package myJava.exercise.ch08;
import java.lang.*;

public class ex8_03         //主類別
{
    public static void main(String args[])                //(c)
    {
         CShape objArr[] = new CShape[3];
         objArr[0]=new CTriangle();      
         objArr[1]=new CRect();                        
         objArr[2]=new CPentagon();                   
         for(int i=0;i<objArr.length;i++)
            objArr[i].angle();           
         for(int i=0;i<objArr.length;i++)
            System.out.println(objArr[i].toString());
         
    }    
}    

abstract class CShape                          //抽象類別
{
  public int number;                   //邊數
  public int totalAngle;       //內角和,公式為totalAangle=(number-2)*180
  public abstract void angle();        //抽象方法
  @Override public String toString()   //(b)
  {
    return "正" + number + "邊形每一角為" + (totalAngle/number) + "度";
  }
}

class CTriangle extends CShape
{
 @Override public void angle()  //(a)
 {
     	number=3;
     	totalAngle=(number-2)*180;     
 }
 
}
class CRect extends CShape
{
  @Override public void angle() //(a)
  {
     	number=4;
     	totalAngle=(number-2)*180;
  }  
}
class CPentagon extends CShape
{
  @Override public void angle() //(a)
  {
     	number=5;
     	totalAngle=(number-2)*180;
  }
}