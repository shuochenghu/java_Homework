package myJava.exercise.ch06;
import java.lang.*;

public class ex6_11
{
      public static void main(String args[])
      {
       int charCount=0;
       
       for(int i=2;i<=100;i++)
       {
         if(isPrime(i))
         {
            System.out.print(i + "\t");
            charCount = charCount + 1;  
            if((charCount%5)==0)
               System.out.println();     
         }                                 
        }            
      }
      
      static boolean isPrime(int x)
      {
        for(int j=2;j<=x-1;j++)
        {
         if((x%j)==0)
            return false;   
        }
        return true;
      }
}