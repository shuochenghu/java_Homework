package myJava.exercise.ch05;
import java.lang.*;
import java.util.Arrays;

public class ex5_09         //主類別
{
    public static void main(String args[])
    {
       int arr[]={56,32,67,32,66,31,75,49,32,56};
       for(int i=0;i<arr.length;i++)           /* 先乘-1變成負數  */
          arr[i]=arr[i]*-1;
       
       
       Arrays.sort(arr);                       /* 對陣列進行遞增排序 */
       
       for(int i=0;i<arr.length;i++)           /* 最後乘-1變回正數  */
           arr[i]=arr[i]*-1;
       
       for(int num : arr)         //使用foreach語法蜜糖
            System.out.print(num+ "\t");
    }
}