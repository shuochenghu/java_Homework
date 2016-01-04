package myJava.exercise.ch09;
import java.lang.*;

public class ex9_02         //主類別
{
    public static void main(String args[])
    {
         CCalculator obj1 = new CCalculator();
         double a,b;
         a = Math.random()*20;
         b = Math.random()*10;
         
         System.out.println(a + " Add " + b + " = " +obj1.Add(a,b));
         System.out.println(a + " Sub " + b + " = " +obj1.Sub(a,b));
         System.out.println(a + " Mul " + b + " = " +obj1.Mul(a,b));
         System.out.println(a + " Div " + b + " = " +obj1.Div(a,b));
               
    }    
}    

interface IBasicCompute
{
   double Add(double a,double b);
   double Sub(double a,double b);
   double Mul(double a,double b);
   double Div(double a,double b);   
}

class CCalculator implements IBasicCompute
{
  public double result;
  
  public CCalculator()                //建構子
  {
     result = 0;
     
  }
  @Override public double Add(double a,double b)
  {
  	result = a + b;
  	return result;
  }
  @Override public double Sub(double a,double b)
  {
  	result = a - b;
  	return result;
  }
  @Override public double Mul(double a,double b)
  {
  	result = a * b;
  	return result;
  }
  @Override public double Div(double a,double b)
  {
  	result = a / b;
  	return result;
  } 
}