package myJava.exercise.ch04;
import java.lang.*;
import java.util.Scanner;

public class ex4_14         //�D���O
{
    public static void main(String args[])
    {
       Scanner keyboardInput = new Scanner(System.in);
       int price,money,dif,coin50=0,coin10=0,coin5=0,coin1=0;

       do
       {
        System.out.print("�п�J�ʲ����B:");
        price=Integer.parseInt(keyboardInput.nextLine());
       }while(price<=0);
 
       do
       {
        System.out.print("�п�J��J���B:");
        money=Integer.parseInt(keyboardInput.nextLine());
       }while((money%100!=0)||(money<price));
       
       dif=money-price;
 
       while(dif>=50)
       {
         coin50++;
         dif=dif-50;
       }
 
       while(dif>=10)
       {
         coin10++;
         dif=dif-10;
       }
 
       while(dif>=5)
       {
         coin5++;
         dif=dif-5;
       }
 
       while(dif>=1)
       {
         coin1++;
         dif=dif-1;
       }
        System.out.println("��s50���w���@" + coin50 +"��,10���w���@" +coin10 + "��,5���w���@" +coin5 + "��,1���w���@"+ coin1+"��");
    }
}