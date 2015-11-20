package myJava.exercise.ch04;
import java.lang.*;
import java.util.Scanner;

public class ex4_14         //主類別
{
    public static void main(String args[])
    {
       Scanner keyboardInput = new Scanner(System.in);
       int price,money,dif,coin50=0,coin10=0,coin5=0,coin1=0;

       do
       {
        System.out.print("請輸入購票金額:");
        price=Integer.parseInt(keyboardInput.nextLine());
       }while(price<=0);
 
       do
       {
        System.out.print("請輸入投入金額:");
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
        System.out.println("找零50元硬幣共" + coin50 +"個,10元硬幣共" +coin10 + "個,5元硬幣共" +coin5 + "個,1元硬幣共"+ coin1+"個");
    }
}