public class ActivationFunction
{

  // Returns the Heaviside function of x
  public static double heaviside(double x)
  {

    if (Double.isNaN(x))
      return Double.NaN;
    else if (x < 0.0)
      return 0.0;
    else if (x > 0.0)
      return 1.0;
    else
      return 0.5;

  }

  // Returns the sigmoid function of x
  public static double sigmoid(double x)
  {

    if (Double.isNaN(x))
      return Double.NaN;
    else
    {
      double exp = Math.exp(- x);
      return 1.0 / (1.0 + exp);
    }

  }

  // Returns the hyperbolic tangent of x
  public static double tanh(double x)
  {

    if (Double.isNaN(x))
      return Double.NaN;
    else
    {
      double exp1 = Math.exp(x);
      double exp2 = Math.exp(- x);
      return (exp1 - exp2) / (exp1 + exp2);
    }

  }

  // Returns the softsign function of x
  public static double softsign(double x)
  {

    if (Double.isNaN(x))
      return Double.NaN;
    else
    {
      double abs = Math.abs(x);
      return x / (1.0 + abs);
    }

  }

  // Returns the square nonlinearity function of x
  public static double sqnl(double x)
  {

    if (Double.isNaN(x))
      return Double.NaN;
    else if (x <= - 2.0)
      return - 1.0;
    else if (x >= 2.0)
      return 1.0;
    else
    {
      double xSquare4 = (x * x) / 4.0;
      if ((x > - 2.0) && (x < 0.0))
        return x + xSquare4;
      else
        return x - xSquare4;
    }

  }

  // Takes a double command-line argument x and prints each activation function
  public static void main(String[] args)
  {

    double x;

    try
    {
      x = Double.parseDouble(args[0]);
    }
    catch(Exception e)
    {
      x = Double.NaN;
    }

    StdOut.println("heaviside(" + x + ") = " + heaviside(x));
    StdOut.println("  sigmoid(" + x + ") = " + sigmoid(x));
    StdOut.println("     tanh(" + x + ") = " + tanh(x));
    StdOut.println(" softsign(" + x + ") = " + softsign(x));
    StdOut.println("     sqnl(" + x + ") = " + sqnl(x));

  }

}
