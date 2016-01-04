package myJava.exercise.ch09;
import java.lang.*;

public class ex9_03         //主類別
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
         System.out.println("log(" + a + ") = "   +obj1.LOG(a));
         System.out.println("ln(" + a + ") = "    +obj1.LN(a));
    }    
}    

interface IAdvCompute
{
   double e=2.71828182845905;
   double LOG(double x);
   double LN(double x);
}

interface IBasicCompute
{
   double Add(double a,double b);
   double Sub(double a,double b);
   double Mul(double a,double b);
   double Div(double a,double b);   
}

class CCalculator implements IBasicCompute,IAdvCompute
{
  public double result;
    
  public CCalculator()                //建構子
  {
     result = 0;
     
  }

  @Override public double LOG(double x)
  {
  	result = Math.log10(x);
  	return result;
  }
  
  @Override public double LN(double x)
  {  	
  	result = LOG(x)/LOG(e);
  	return result;  	
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