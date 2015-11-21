
public class StudentTest
{
   public static void main(String[] args)
   {
      Student account1 = new Student("Jane Green", 90.4);
      Student account2 = new Student("John Blue", 72.75); 
      
      //account1.setName("Steve Martin");
      account1.setAverage(200);
      
      System.out.printf("%s's letter grade is: %s%n", 
         account1.getName(), account1.getLetterGrade());      
      System.out.printf("%s's letter grade is: %s%n", 
         account2.getName(), account2.getLetterGrade());      
   } 
} // end class StudentTest