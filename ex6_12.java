package myJava.exercise.ch06;
import java.lang.*;
import java.util.Scanner;

public class ex6_12
{
      public static void main(String args[])
      {
        Scanner keyboardInput = new Scanner(System.in);
        int i;
  
        System.out.print("�п�J�����:"); 
        i=Integer.parseInt(keyboardInput.nextLine());
        if(prime4j3(i))
           System.out.println(i+ "��4j+3�����");
        else
           System.out.println(i+ "����4j+3�����"); 
      }
      
      static boolean prime4j3(int x)
      {
        if((x%4==3) && (isPrime(x)))
           return true;
        else
           return false;  
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