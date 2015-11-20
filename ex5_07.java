package myJava.exercise.ch05;
import java.lang.*;
import java.util.Scanner;

public class ex5_07         //主類別
{
    public static void main(String args[])
    {
       Scanner keyboardInput = new Scanner(System.in);
       int Sum,FactNum,x,y;
       int m[]={1,1,1,1,1,1,1,1,1,1};
 
       System.out.println("計算1!+2!+...+" + (m.length-1) + "!");
       
       for(Sum=0,x=1;x<m.length;x++)
       {
          for(FactNum=1,y=1;y<=x;y++)
          {
          	FactNum=FactNum*y;          	
          }
            Sum=Sum+FactNum;
        }  
        System.out.println("1!+2!+...+" + (m.length-1) + "!=" + Sum);
    }
}