package myJava.exercise.ch04;
import java.lang.*;
import java.util.Scanner;

public class ex4_12         //�D���O
{
    public static void main(String args[])
    {
       Scanner keyboardInput = new Scanner(System.in);
       int x,y,m,i;
 
       System.out.print("�п�J����x:");
       x=Integer.parseInt(keyboardInput.nextLine());
       do
       {
         System.out.print("�п�J����y:");
         y=Integer.parseInt(keyboardInput.nextLine());
       }while(y<0);
 
       if((x==0) && (y==0))
         System.out.println("0��0����L�w�q");
       else if(y==0)
         System.out.println(x+"��"+y+"���謰1");
       else
       {
         m=x;
         for(i=1;i<=y-1;i++)
           m=m*x;
          System.out.println(x+"��"+y+"���謰"+m);
       } 
    }
}