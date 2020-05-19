public class WorldMap
{
  public static void main(String[] args)
  {

    int width = StdIn.readInt();
    int height = StdIn.readInt();

    int numberVertices;
    double[] xPolygon;
    double[] yPolygon;

    StdDraw.enableDoubleBuffering();
    StdDraw.setCanvasSize(width, height);
    StdDraw.setXscale(0.0, (double) width);
    StdDraw.setYscale(0.0, (double) height);

    while (!StdIn.isEmpty())
    {

      // Reads the data associated with a new region,
      // and draws the corresponding polygon

      StdIn.readString();
      numberVertices = StdIn.readInt();

      xPolygon = new double[numberVertices];
      yPolygon = new double[numberVertices];
      for (int i = 0; i < numberVertices; i++)
      {
        xPolygon[i] = StdIn.readDouble();
        yPolygon[i] = StdIn.readDouble();
      }

      StdDraw.polygon(xPolygon, yPolygon);

    }

    StdDraw.show();

  }
}
