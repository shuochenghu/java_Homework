import java.util.Scanner;

public class GradeBookTest
{
   public static void main( String args[] )
   {
      // create GradeBook object myGradeBook and 
      // pass course name to constructor
	   
	  int numOfStudent = 0;
	  Scanner input = new Scanner(System.in);
	  
	  System.out.print("�п�J�ǥͤH�ơG ");
	  numOfStudent = input.nextInt();
      GradeBook myGradeBook = new GradeBook("CS101 Introduction to Java Programming", numOfStudent);

      myGradeBook.displayMessage(); // display welcome message
      myGradeBook.inputGrades(); // read grades from user
      myGradeBook.displayGradeReport(); // display report based on grades
   } // end main
} // end class GradeBookTest