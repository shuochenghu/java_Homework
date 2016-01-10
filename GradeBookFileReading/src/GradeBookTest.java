//import java.security.SecureRandom;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;

public class GradeBookTest
{
   private static Scanner input;  //�s�W
	// main method begins program execution
   public static void main(String[] args)
   {
      // two-dimensional array of student grades
      int[][] gradesArray = new int[5][3];
      //SecureRandom random = new SecureRandom();
      //Scanner input = new Scanner(System.in);
      //System.out.println("�п�J���Z�G");
      //for (int i = 0; i < gradesArray.length; i++)
      //{
    	  //System.out.println("��"+i+"�즨�Z�G");
    	//  for (int j = 0; j < gradesArray[i].length; j++)
    	//	  gradesArray[i][j] = random.nextInt(101);
      //}
       
      openFile();
      readData(gradesArray);
      closeFile();
      
      GradeBook myGradeBook = new GradeBook(
    		  "CS101 Introduction to Java Programming", gradesArray);
      System.out.printf("Welcome to the grade book for%n%s%n%n", 
         myGradeBook.getCourseName());
      myGradeBook.processGrades();
   } 
   //open file grades.txt
   public static void openFile()
   {
	   try
	   {
		   input = new Scanner(Paths.get("c:\\grades.txt"));	
		   //input = new Scanner(new File("grades.txt"));
	   }
	   catch (IOException ioException)
	   {
		   System.err.println("Error opening file. Terminating.");
		   System.exit(1);
	   }
   }
   //read data from file
   public static void readData(int[][] gradesArray)
   {
	   int i = 0;
	   try
	   {
		   while (input.hasNext())
		   {
			   gradesArray[i][0] = input.nextInt();
			   gradesArray[i][1] = input.nextInt();
			   gradesArray[i][2] = input.nextInt();
			   ++i;
		   }
	   }
	   catch (NoSuchElementException elementException)
	   {
		   System.err.println("File improperly formed. Terminating.");		   
	   }
	   catch (IllegalStateException stateException)
	   {
		   System.err.println("Error reading from file. Terminating");
	   }	
   }
   
   //close file and terminate application
   public static  void closeFile()
   {
	   if (input != null)
		   input.close();
   }  
} // end class GradeBookTest