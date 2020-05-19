public class RandomWalkers {

  public static void main(String[] args) {

    double AvSteps = 0.0; // Average number of steps
    int ManhDist; // Manhattan distance from the starting point
    int r = Integer.parseInt(args[0]);
    double rand; // Stores a pseudo-random number
    int steps; // Number of steps
    int trials = Integer.parseInt(args[1]); // Number of independent experiments
    int x; // x coordinate of the random walker
    int y; // y coordinate of the random walker

    // For loop that performs all of the independent experiments
    for (int i = 0; i < trials; i++) {

      // Sets a few variables so that we can start a new experiment
      ManhDist = 0;
      steps = 0;
      x = 0;
      y = 0;

      // While loop that performs the random walk
      while (ManhDist < r) {

        // Chooses a direction randomly and moves to a new point
        rand = Math.random();
        if (rand < 0.25) {
          y++; // Moves north
        } else if (rand < 0.5) {
          x++; // Moves east
        } else if (rand < 0.75) {
          y--; // Moves south
        } else {
          x--; // Moves west
        }
        steps++; // Increases the number of steps

        // Updates the value of the Manhattan distance from the starting point
        ManhDist = Math.abs(x) + Math.abs(y);

      }

      // Updates the value in the variable AvSteps
      AvSteps += (double) steps;

    }

    // Computes and prints the average number of steps
    AvSteps = AvSteps / ((double) trials);
    System.out.println("average number of steps = " + AvSteps);

  }

}
