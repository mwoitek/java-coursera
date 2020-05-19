public class ThueMorse {

  public static void main(String[] args) {

    int k = 0; // Exponent of the smallest power of 2 >= n
    String line;
    int n = Integer.parseInt(args[0]);
    int[] powersTwo; // Array that stores the relevant powers of 2
    int[] sequence; // Array that stores the Thue-Morse sequence

    // Determines the exponent of the smallest power of 2 >= n
    while (((int) Math.pow(2.0, (double) k)) < n) {
      k++;
    }

    // For loop that loads the array powersTwo
    powersTwo = new int[k + 1];
    powersTwo[0] = 1;
    for (int i = 1; i <= k; i++) {
      powersTwo[i] = 2 * powersTwo[i - 1];
    }

    // For loops that generate the Thue-Morse sequence
    sequence = new int[powersTwo[k]];
    for (int i = 0; i < k; i++) {
      for (int j = 0; j < powersTwo[i]; j++) {
        if (sequence[j] == 0) {
          sequence[j + powersTwo[i]] = 1;
        } else {
          sequence[j + powersTwo[i]] = 0;
        }
      }
    }

    // For loop that prints the Thue-Morse sequence
    // This is just for debugging
    // line = "";
    // for (int i = 0; i < powersTwo[k]; i++) {
    //   line += sequence[i];
    // }
    // System.out.println(line);

    // For loops that print the desired pattern
    for (int i = 0; i < n; i++) {
      line = "";
      for (int j = 0; j < n; j++) {
        if (sequence[i] == sequence[j]) {
          line += "+";
        } else {
          line += "-";
        }
        if (j != n - 1) {
          line += "  ";
        }
      }
      System.out.println(line);
    }

  }

}
