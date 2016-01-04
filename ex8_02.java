package myJava.exercise.ch08;
import java.lang.*;

public class ex8_02         //主類別
{
    public static void main(String args[])
    {
         CA objA=new CA();
         CB objB=new CB();
         objA.func(8);
         objB.func(8);         
    }    
}    

class CA
{
  public void func(int X)
  {
        System.out.println(X + "的3次方=" +(X*X*X ));
  }

}
class CB extends CA
{
  @Override public void func(int X)              //Override
  {
     	int result=1;
        int q;
        q=X;
        while(q>=1)
     	{
     	 result=result*q;
     	 q--;
     	}
        System.out.println(X + "!=" + result);
  }
}