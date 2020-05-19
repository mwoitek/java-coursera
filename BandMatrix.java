public class BandMatrix {

  public static void main(String[] args) {

    int n;
    int width;
    String line;

    // Reads the parameters from the command line
    n = Integer.parseInt(args[0]);
    width = Integer.parseInt(args[1]);

    // For loops that create the pattern
    for (int i = 0; i < n; i++) {
      line = "";
      for (int j = -i; j < n - i; j++) {
        if (Math.abs(j) > width) {
          line += "0";
        } else {
          line += "*";
        }
        if (j != n - (i + 1)) {
          line += "  ";
        }
      }
      System.out.println(line);
    }

  }

}
