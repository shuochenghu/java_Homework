package myJava.exercise.ch05;
import java.lang.*;

public class ex5_08         //主類別
{
    public static void main(String args[])
    {
       int arr[]={56,32,67,32,66,31,75,49,32,56};
       int k,times,temp;
  
       k=arr.length-1; 
       while(k!=0)
       { 
          times=0;
          for(int i=0;i<=k-1;i++)
          {
             if(arr[i]<arr[i+1])
             {
              temp=arr[i]; arr[i]=arr[i+1]; arr[i+1]=temp;  // arr[i]<->arr[i+1]
              times=i;
             }
          }
          k=times;
       }
       for(int num : arr)         //使用foreach語法蜜糖
            System.out.print(num+ "\t");

    }
}