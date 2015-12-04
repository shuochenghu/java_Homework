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
        System.out.print("\n���X�k�T����");
        if (triangle.isRightTriangle()) {
          System.out.println(",�B�������T����\n");
        } else {
          System.out.println(",�����O�����T����\n");
        }
      }
      else
      {
        System.out.println("\n���O�X�k�T����\n");
      }
    } while (!triangle.isRightTriangle());
  }
}