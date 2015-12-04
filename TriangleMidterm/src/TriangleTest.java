import java.io.PrintStream;

public class TriangleTest
{
  public static void main(String[] args)
  {
    Triangle triangle;
    do
    {
      triangle = new Triangle();
      triangle.genThreeEdges();
      triangle.printTriangle();
      if (triangle.isTriangle())
      {
        System.out.print("\n為合法三角形");
        if (triangle.isRightTriangle()) {
          System.out.println(",且為直角三角形\n");
        } else {
          System.out.println(",但不是直角三角形\n");
        }
      }
      else
      {
        System.out.println("\n不是合法三角形\n");
      }
    } while (!triangle.isRightTriangle());
  }
}