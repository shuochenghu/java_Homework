import java.security.SecureRandom;
import java.util.Arrays;

public class Triangle
{
  private int[] edges = new int[3];
  private static int count;
  
  public Triangle()
  {
    System.out.printf("第  %d三角形 \n", ++count);
  }
  
  public void genThreeEdges()
  {
    SecureRandom random = new SecureRandom();
    for (int i = 0; i < this.edges.length; i++) {
      this.edges[i] = (1 + random.nextInt(10));
    }
    Arrays.sort(this.edges);
  }
  
  public boolean isTriangle()
  {
    if ((this.edges[2] < this.edges[0] + this.edges[1]) && (this.edges[0] > this.edges[2] - this.edges[1])) {
      return true;
    }
    return false;
  }
  
  public boolean isRightTriangle()
  {
    if (this.edges[0] * this.edges[0] + this.edges[1] * this.edges[1] == this.edges[2] * this.edges[2]) {
      return true;
    }
    return false;
  }
  
  public void printTriangle()
  {
    System.out.print("三角形三邊長分別為 ");
    
    for (int i = 0; i < edges.length; i++)
    {
      System.out.printf("%4d", edges[i]);
    }
  }
}
