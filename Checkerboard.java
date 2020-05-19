public class Checkerboard
{
  public static void main(String[] args)
  {

    int n = Integer.parseInt(args[0]);

    double halfSideLength = 0.5;
    boolean isBlue; // Is the next square blue?
    double x;
    double y;

    StdDraw.setScale(0.0, (double) n);

    // For loops that draw the checkerboard pattern
    for (int i = 0; i < n; i++)
    {
      if (i % 2 == 0)
        isBlue = true;
      else
        isBlue = false;
      y = halfSideLength + (double) i;
      for (int j = 0; j < n; j++)
      {
        x = halfSideLength + (double) j;
        if (isBlue)
          StdDraw.setPenColor(StdDraw.BLUE);
        else
          StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        StdDraw.filledSquare(x, y, halfSideLength);
        isBlue = !isBlue;
      }
    }

  }
}
