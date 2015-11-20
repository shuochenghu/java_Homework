package myJava.exercise.ch04;
import java.lang.*;
import java.util.Scanner;

public class ex4_12         //主類別
{
    public static void main(String args[])
    {
       Scanner keyboardInput = new Scanner(System.in);
       int x,y,m,i;
 
       System.out.print("請輸入底數x:");
       x=Integer.parseInt(keyboardInput.nextLine());
       do
       {
         System.out.print("請輸入指數y:");
         y=Integer.parseInt(keyboardInput.nextLine());
       }while(y<0);
 
       if((x==0) && (y==0))
         System.out.println("0的0次方無定義");
       else if(y==0)
         System.out.println(x+"的"+y+"次方為1");
       else
       {
         m=x;
         for(i=1;i<=y-1;i++)
           m=m*x;
          System.out.println(x+"的"+y+"次方為"+m);
       } 
    }
}