package myJava.exercise.ch09;
import java.lang.*;

public class ex9_01         //主類別
{
    public static void main(String args[])
    {
         CB objB = new CB();
         objB.prime(100);
         objB.output();         
    }    
}    

interface IMyPrime
{
   public final int p[] = new int[65535];           //存放質數處
   public void prime(int X);
   public default void output()
   {
     int t=0;
     while(p[t]!=0)
     {
         System.out.print(p[t] + " ");
         t++;
     }
     System.out.println();     
  }
}

class CB implements IMyPrime
{

  public CB()                //建構子
  {     
     for(int index=0;index<p.length;index++)
          p[index] = 0;
  }
  @Override public void prime(int X)
  {
        int i,j;
        int index=0;

     	for(i=2;i<X;i++)
     	{
     	  for(j=2;j<i;j++)
     	  {
            if (i%j==0) break;
          }
     	  if(j==i)
          {
            p[index] = i;
            index++;
          }
        }
  }
}