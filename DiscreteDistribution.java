public class DiscreteDistribution {

  public static void main(String[] args) {

    int m = Integer.parseInt(args[0]);

    int i; // Index variable
    boolean indexFound; // Was the random index found?
    int n = args.length - 1; // Number of integers in the sequence
    int[] cumSums = new int[n + 1]; // Array of cumulative sums
    String output = "";
    int[] posInt = new int[n]; // Array of positive integers
    int r; // Stores a pseudo-random integer
    int sum = 0;

    // For loop that loads the array posInt
    for (int k = 1; k < args.length; k++) {
      posInt[k - 1] = Integer.parseInt(args[k]);
    }

    // For loop that loads the array cumSums
    for (int k = 1; k < args.length; k++) {
      sum += posInt[k - 1];
      cumSums[k] = sum;
    }

    // For loop that generates the random indexes
    for (int k = 0; k < m; k++) {

      // Picks a pseudo-random integer
      r = (int) (Math.random() * cumSums[n]);

      // Finds the unique index
      i = 1;
      indexFound = false;
      while (!indexFound) {
        if ((r >= cumSums[i - 1]) && (r < cumSums[i])) {
          indexFound = true;
        }
        i++;
      }
      i--;

      // Adds the index just found to the output
      output += i + " ";

    }

    // Prints the output
    System.out.println(output.trim());

  }

}
