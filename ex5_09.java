package myJava.exercise.ch05;
import java.lang.*;
import java.util.Arrays;

public class ex5_09         //�D���O
{
    public static void main(String args[])
    {
       int arr[]={56,32,67,32,66,31,75,49,32,56};
       for(int i=0;i<arr.length;i++)           /* ����-1�ܦ��t��  */
          arr[i]=arr[i]*-1;
       
       
       Arrays.sort(arr);                       /* ��}�C�i�滼�W�Ƨ� */
       
       for(int i=0;i<arr.length;i++)           /* �̫᭼-1�ܦ^����  */
           arr[i]=arr[i]*-1;
       
       for(int num : arr)         //�ϥ�foreach�y�k�e�}
            System.out.print(num+ "\t");
    }
}