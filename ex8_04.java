package myJava.exercise.ch08;
import java.lang.*;

//請不斷重複執行類別檔測試,因每次產生的亂數都不相同

public class ex8_04         //主類別
{
    public static void main(String args[])
    {
    	CTriangleMore objArr[]=new CTriangleMore[10];          //4-e
    	int x[];
    	for(int i=1;i<objArr.length;i++)
    	{
    	    x=makeThreeNum();
    	    objArr[i]=new CTriangleMore(x[0],x[1],x[2]);
    	    objArr[i].computeArea();
    	}
    	
    	
    	for(int i=1;i<objArr.length;i++)          //4-f
    	{
    	    System.out.println("3邊為\t" + objArr[i].edge1 + "\t" +
    	                                 objArr[i].edge2 + "\t" +
    	                                 objArr[i].edge3 + "\t" +
    	                     "面積為\t" + objArr[i].area);
            
    	}       
    }
    static int[] makeThreeNum()         //ch7  1-e
    {
    	int x[]=new int[3];
    	x[0]= ((int)(Math.random()*25))+5;    //5~29   0+5 ~24+5
    	x[1]= ((int)(Math.random()*41))+9;    //9~49   0+9 ~40+9
    	x[2]= ((int)(Math.random()*61))+29;   //29~89  0+29~60+29
    	return x;
    }    
}    

class CTriangle
{
    public int edge1;
    public int edge2;
    public int edge3;
    
    public CTriangle()   //ch7   1-a
    {
    	edge1 = 3;
    	edge2 = 4;
    	edge3 = 5;   	
    }
    
    public CTriangle(int a,int b,int c)     //ch7  1-c
    {
        this();
        if(CTriangle.isLegal(a,b,c)==true)
        {
          edge1=a;
          edge2=b;
          edge3=c;
        }
    }
    private static boolean isLegal(int a,int b,int c)  //ch7  1-b
    {
    	if((a<=b)&&(b<=c))
    	{
             if((c<(a+b)) && (a>(c-b)))  return true;
             else return false;
             
        }
        else
           return false;    	
    }
    public final boolean isRightAngled()   //ch7   1-d     ch8 4-d
    {
        int c2=edge3*edge3;	
        int a2=edge1*edge1;
        int b2=edge2*edge2;
    	if(c2==(a2+b2))
    	   return true;
    	else return false;
    }
}

class CTriangleMore extends CTriangle
{
   private double p;                           //4-a
   public double area;                         //4-a
   public CTriangleMore(int a,int b,int c)     //4-b
   {
   	super(a,b,c);
   	p=(double)(edge1+edge2+edge3)/(double)2;
   }
   public void computeArea()                   //4-c
   {
   	area=Math.sqrt(p*(p-edge1)*(p-edge2)*(p-edge3));
   }	
}