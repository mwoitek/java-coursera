public class Minesweeper {

  public static void main(String[] args) {

    int m = Integer.parseInt(args[0]); // Number of rows
    int n = Integer.parseInt(args[1]); // Number of columns
    int k = Integer.parseInt(args[2]); // Number of mines we need to put

    int foundMines; // Number of mines found in the neighboring cells
    int[][] grid = new int[m][n];
    String line;
    int[] neighX;
    int[] neighY;
    int numberMines = 0; // Counts the number of mines we already put
    int r1; // Stores a pseudo-random integer
    int r2; // Stores a pseudo-random integer
    boolean testX;
    boolean testY;

    // Puts the k mines in the grid
    while (numberMines < k) {

      // Picks a cell randomly
      r1 = (int) (Math.random() * ((double) m));
      r2 = (int) (Math.random() * ((double) n));

      // If there is no mine in the cell we selected, we put one there
      // The existence of a mine will be characterized by the value -1
      if (grid[r1][r2] != -1) {
        grid[r1][r2] = -1;
        numberMines++;
      }

    }

    // For every cell that does not contain a mine,
    // determines the number of mines in the neighboring cells
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (grid[i][j] != -1) { // Is there a mine in the current cell?

          foundMines = 0;

          // Determines the coordinates of the neighboring cells
          neighX = new int[] {i, i, i - 1, i + 1, i - 1, i + 1, i - 1, i + 1};
          neighY = new int[] {j - 1, j + 1, j, j, j + 1, j + 1, j - 1, j - 1};

          // Counts the number of mines in the neighboring cells
          for (int a = 0; a < neighX.length; a++) {
            testX = (neighX[a] >= 0) && (neighX[a] < m);
            testY = (neighY[a] >= 0) && (neighY[a] < n);
            if (testX && testY) {
              if (grid[neighX[a]][neighY[a]] == -1) {
                foundMines++;
              }
            }
          }
          grid[i][j] = foundMines;

        }
      }
    }

    // Prints the grid
    for (int i = 0; i < m; i++) {
      line = "";
      for (int j = 0; j < n; j++) {
        if (grid[i][j] == -1) {
          line += "*";
        } else {
          line += grid[i][j];
        }
        if (j != n - 1) {
          line += "  ";
        }
      }
      System.out.println(line);
    }

  }

}
