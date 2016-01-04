package myJava.exercise.ch09;
import java.lang.*;

public class ex9_05         //主類別
{
    public static void main(String args[])
    {
         CCalculator obj1 = new CCalculator();
         CTriFunc obj2 = new CTriFunc();
         double a,b;
         a = Math.random()*20;
         b = Math.random()*10;
         
         System.out.println(a + " Add " + b + " = " +obj1.Add(a,b));
         System.out.println(a + " Sub " + b + " = " +obj1.Sub(a,b));
         System.out.println(a + " Mul " + b + " = " +obj1.Mul(a,b));
         System.out.println(a + " Div " + b + " = " +obj1.Div(a,b));
         System.out.println("log(" + a + ") = "   +obj1.LOG(a));
         System.out.println("ln(" + a + ") = "    +obj1.LN(a));
         System.out.println("sin(" + b + ") = "   +obj1.SIN(b*10));
         System.out.println("cos(" + b + ") = "   +obj1.COS(b*10));
         System.out.println("tan(" + b + ") = "   +obj1.TAN(b*10));
         System.out.println("sin(" + b + ") = "   +obj2.SIN(b*10) + "by run CTriFunc method");
         System.out.println("cos(" + b + ") = "   +obj2.COS(b*10) + "by run CTriFunc method");
         System.out.println("tan(" + b + ") = "   +obj2.TAN(b*10) + "by run CTriFunc method");
    }    
}    

class CTriFunc
{
  double trans(double x)
  {
  	return x*(Math.PI/180);
  }
  public double SIN(double x)
  {  	
  	
  	return Math.sin(trans(x));
  }
  
  public double COS(double x)
  {  	
  	return Math.cos(trans(x));
  	
  }
  public double TAN(double x)
  {  	  	
  	return Math.tan(trans(x));	
  }
}
interface IAdvCompute
{
   double e = 2.71828182845905;
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

interface IFullCompute extends IBasicCompute,IAdvCompute
{
}



class CCalculator extends CTriFunc implements IFullCompute
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
  
  @Override public double SIN(double x)          //改寫,使得result得以記錄結果
  {  	
  	result = Math.sin(trans(x));
  	return result;
  }
  
  @Override public double COS(double x)         //改寫,使得result得以記錄結果
  {  	
  	result = Math.cos(trans(x));
  	return result;
  	
  }

  @Override public double TAN(double x)             //改寫,使得result得以記錄結果
  {  	  	
  	result = Math.tan(trans(x));
  	return result;
  } 
}