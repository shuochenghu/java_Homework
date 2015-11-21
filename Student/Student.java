import java.util.Scanner;
public class Student 
{
   private String name; 
   private double average; 
   private Scanner input = new Scanner(System.in);
    
   // constructor initializes instance variables
   public Student(String name, double average)
   {
      this.name = name;

      // validate that average is > 0.0 and <= 100.0; otherwise,
      // keep instance variable average's default value (0.0)
      /*if (average > 0.0) 
         if (average <= 100.0)
            this.average = average;*/ // assign to instance variable
      setAverage(average);
   }

   // sets the Student's name
   public void setName(String name)
   {
      this.name = name; 
   }

   // retrieves the Student's name
   public String getName()
   {
      return name;
   }

   // sets the Student's average
   public void setAverage(double average)
   {
      // validate that average is > 0.0 and <= 100.0; otherwise,
      // keep instance variable average's current value
	  int count = 0;
      while (average <0.0 || average > 100.0)
      {
	      //this.average = average; // assign to instance variable
	      System.out.println("分數須介於0~100之間！");
	      if (count < 5)
	      {
	    	  System.out.print("請重新輸入：");
	    	  average = input.nextDouble();
	    	  count++;
	      }
	      else
	      {
	    	  System.out.println("超過輸入次數，程式結束");
	    	  System.exit(0);
	      }
	    	  
      }// end of while
      this.average = average;
   }

   // retrieves the Student's average
   public double getAverage()
   {
      return average;
   }

   // determines and returns the Student's letter grade
   public String getLetterGrade()
   {
      String letterGrade = ""; // initialized to empty String

      if (average >= 90.0)
         letterGrade = "A";
      else if (average >= 80.0)
         letterGrade = "B";
      else if (average >= 70.0)
         letterGrade = "C";
      else if (average >= 60.0)
         letterGrade = "D";
      else
         letterGrade = "F";

      return letterGrade;
   }
} // end class Student