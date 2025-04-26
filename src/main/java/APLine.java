public class APLine
{
  /* your code here */
  private int a;
  private int b;
  private int c;
  public APLine(int A, int B, int C)
  {
    a = A;
    b = B;
    c = C;
  }
  public double getSlope(){
    return -(double)a/b;
  }
  public boolean isOnLine(int x, int y)
  {
    return a*x + b*y + c == 0;
  }
}
