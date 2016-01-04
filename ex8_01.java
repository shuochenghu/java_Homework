package myJava.exercise.ch08;
import java.lang.*;

public class ex8_01         //主類別
{
    public static void main(String args[])
    {
         CB objB= new CB();
         objB.prime(100);
         objB.output();         
    }    
}    

class CA
{
  protected int p[];           //存放質數處
  public CA()                //建構子
  {
     p=new int[65535];
     for(int index=0;index<65535;index++)
          p[index]=0;
  }
  public void prime(int X)
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
            p[index]=i;
            index++;
          }
        }
  }
}

class CB extends CA
{
  public void output()
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