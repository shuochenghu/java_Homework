import java.util.InputMismatchException;
import java.util.Scanner; // program uses class Scanner

public class GradeBook 
{
   private String courseName; // name of course this GradeBook represents
   private int total; // sum of grades
   private int gradeCounter; // number of grades entered

   private int[] frequency = new int[5];  //新加入
   private int[] grades;                  //新加入
   //private int   numOfStudent;
   
   // constructor initializes courseName; 
   // int instance variables are initialized to 0 by default
   public GradeBook( String name, int numOfStudent )
   {
      courseName = name; // initializes courseName
      grades = new int[numOfStudent];  //新加入
   } // end constructor

   // method to set the course name
   public void setCourseName( String name )
   {
      courseName = name; // store the course name
   } // end method setCourseName

   // method to retrieve the course name
   public String getCourseName()
   {
      return courseName;
   } // end method getCourseName

   // display a welcome message to the GradeBook user
   public void displayMessage()
   {
      // getCourseName gets the name of the course
      System.out.printf( "Welcome to the grade book for\n%s!\n\n", 
         getCourseName() );
   } // end method displayMessage

 
   
   // input arbitrary number of grades from user
   public void inputGrades() 
   {
      Scanner input = new Scanner( System.in );

      int grade; // grade entered by user

      System.out.printf( "%s\n%s\n   %s\n   %s\n", 
         "Enter the integer grades in the range 0-100.", 
         "Type the end-of-file indicator to terminate input:", 
         "On UNIX/Linux/Mac OS X type <ctrl> d then press Enter",
         "On Windows type <ctrl> z then press Enter" );

      // loop until user enters the end-of-file indicator
      while ( input.hasNext() ) 
      {
         try {
        	 grade = input.nextInt();        			 
        	 if (grade <0 || grade > 100)
        		 throw new InputMismatchException();
        	 grades[gradeCounter] = grade;
         }         
         catch (ArrayIndexOutOfBoundsException outofboundsexception) {
        	 System.err.println("Out of Array Boundary!");
        	 break;
         }
         catch (InputMismatchException exception)
         {
        	 //System.err.printf("\n Exception: %s\n", exception);
             input.nextLine();
          	 System.err.println("**請輸入0~100間的整數**");
          	 continue;
         }
         
         total += grades[gradeCounter]; // add grade to total    
    	 incrementLetterGradeCounter( grades[gradeCounter] );
    	 ++gradeCounter;
      } // end while 
   } // end method inputGrades

   // add 1 to appropriate counter for specified grade
   public void incrementLetterGradeCounter( int grade )
   {
	  // determine which grade was entered
      switch ( grade / 10 )
      {  
         case 9:  // grade was between 90
         case 10: // and 100 
            ++frequency[0]; // increment aCount
            break; // necessary to exit switch

         case 8: // grade was between 80 and 89
        	 ++frequency[1]; // increment bCount    
            break; // exit switch

         case 7: // grade was between 70 and 79
        	 ++frequency[2]; // increment cCount    
            break; // exit switch

         case 6: // grade was between 60 and 69
        	 ++frequency[3]; // increment dCount    
            break; // exit switch

         default: // grade was less than 60
        	 ++frequency[4]; // increment fCount    
            break; // optional; will exit switch anyway
      } // end switch
   } // end method incrementLetterGradeCounter

   // display a report based on the grades entered by user 
   public void displayGradeReport()
   {
      System.out.println( "\nGrade Report:" );

      // if user entered at least one grade...
      if ( gradeCounter != 0 ) 
      {
         // calculate average of all grades entered
         double average = (double) total / gradeCounter;  

         // output summary of results
         System.out.printf( "Total of the %d grades entered is %d\n", 
            gradeCounter, total );
         System.out.printf( "Class average is %.2f\n", average );
         
         for (int count = 0; count < frequency.length; count++)
         {
        	 if (count == frequency.length - 1)
        		 System.out.print("    F: ");
        	 else
        		 System.out.printf("%5c: ", 65+count);
        	 
        	 for (int stars = 0; stars < frequency[count]; stars++)
        		 System.out.print("*");
        	 
        	 System.out.println();        	 
         }
      } // end if
      else // no grades were entered, so output appropriate message
         System.out.println( "No grades were entered" );
   } // end method displayGradeReport
} // end class GradeBook