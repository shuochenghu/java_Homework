package myJava.exercise.ch06;
import java.lang.*;

public class ex6_10       //主類別
{
    public static void main(String args[])
    {
       int a[][]={{0,5,7,3,9},
                  {-3,6,-7,12,8,67,32},
                  {66,-98,23}};
       double b[][]={{0.0,5.3,2.7,5.3,9},
                  {-3.5,2.6,-2.7,1.2,46.8,6.32,45.32},
                  {66.4,-98.2,33.23}};                  
                  
       
       
       System.out.println("a陣列最大元素為" +maxEle(a));
       
       System.out.println("b陣列最大元素為" +maxEle(b));
    }
    
    static double maxEle(int x[][])
    {
       double maxValue=java.lang.Double.MIN_VALUE;
       for(int i=0;i<x.length;i++)
          for(int j=0;j<x[i].length;j++)
             if(x[i][j]>maxValue)  maxValue=x[i][j];
       return maxValue;
    }
    
    static double maxEle(double x[][])
    {
       double maxValue=java.lang.Double.MIN_VALUE;
       for(int i=0;i<x.length;i++)
          for(int j=0;j<x[i].length;j++)
             if(x[i][j]>maxValue)  maxValue=x[i][j];
       return maxValue;
    }
}