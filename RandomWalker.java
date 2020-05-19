public class RandomWalker {

  public static void main(String[] args) {

    int ManhDist = 0; // Manhattan distance from the starting point
    int r = Integer.parseInt(args[0]);
    double rand; // Stores a pseudo-random number
    int steps = 0; // Number of steps
    int x = 0; // x coordinate of the random walker
    int y = 0; // y coordinate of the random walker

    // Prints the coordinates of the starting point
    System.out.println("(" + x + ", " + y + ")");

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

      // Prints the coordinates of the new point
      System.out.println("(" + x + ", " + y + ")");

      // Updates the value of the Manhattan distance from the starting point
      ManhDist = Math.abs(x) + Math.abs(y);

    }

    // Prints the number of steps
    System.out.println("steps = " + steps);

  }

}
