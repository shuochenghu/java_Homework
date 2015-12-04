import java.security.SecureRandom;

//import java.util.Scanner;

public class GradeBook2DTest
{
   // main method begins program execution
   public static void main(String[] args)
   {
      // two-dimensional array of student grades
      int[][] gradesArray = new int[5][3];
      SecureRandom random = new SecureRandom();
      //Scanner input = new Scanner(System.in);
      //System.out.println("請輸入成績：");
      for (int i = 0; i < gradesArray.length; i++)
      {
    	  //System.out.println("第"+i+"位成績：");
    	  for (int j = 0; j < gradesArray[i].length; j++)
    		  gradesArray[i][j] = random.nextInt(101);
      }
       
      
      
      GradeBook2D myGradeBook = new GradeBook2D(
         "CS101 Introduction to Java Programming", gradesArray);
      System.out.printf("Welcome to the grade book for%n%s%n%n", 
         myGradeBook.getCourseName());
      myGradeBook.processGrades();
   } 
} // end class GradeBookTest