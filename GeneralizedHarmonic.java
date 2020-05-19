public class GeneralizedHarmonic {

  public static void main(String[] args) {

    int n;
    int r;
    double GenHarNum;

    // Reads the parameters from the command line
    n = Integer.parseInt(args[0]);
    r = Integer.parseInt(args[1]);

    // Computes and prints the generalized harmonic number
    GenHarNum = 0.0;
    for (int i = 1; i <= n; i++) {
      GenHarNum += Math.pow((double) i, (double) (-r));
    }
    System.out.println(GenHarNum);

  }

}
