public class ThueMorse {

  public static void main(String[] args) {

    int n = Integer.parseInt(args[0]);

    int k = 0; // Exponent of the smallest power of 2 >= n
    String line;
    String[][] pattern = new String[n][n];
    int power = 1;
    int[] powersTwo; // Array that stores the relevant powers of 2
    int[] sequence; // Array that stores the Thue-Morse sequence

    // Determines the exponent of the smallest power of 2 >= n
    while (power < n) {
      k++;
      power *= 2;
    }

    // For loop that loads the array powersTwo
    powersTwo = new int[k];
    power = 1;
    for (int i = 0; i < k; i++) {
      powersTwo[i] = power;
      power *= 2;
    }

    // For loops that generate the Thue-Morse sequence
    sequence = new int[power];
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
    // for (int i = 0; i < power; i++) {
    //   line += sequence[i];
    // }
    // System.out.println(line);

    // Loads the array pattern
    // Deals with the diagonal elements
    for (int i = 0; i < n; i++) {
      pattern[i][i] = "+  ";
    }
    // Deals with the off-diagonal elements
    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        if (sequence[i] == sequence[j]) {
          pattern[i][j] = "+  ";
          pattern[j][i] = "+  ";
        } else {
          pattern[i][j] = "-  ";
          pattern[j][i] = "-  ";
        }
      }
    }

    // Prints the desired pattern
    for (int i = 0; i < n; i++) {
      line = "";
      for (int j = 0; j < n; j++) {
        line += pattern[i][j];
      }
      System.out.println(line.trim());
    }

  }

}
