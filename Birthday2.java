public class Birthday {

  public static void main(String[] args) {

    int n = Integer.parseInt(args[0]);
    int trials = Integer.parseInt(args[1]);

    int[] birth; // Array that stores the birthdays of the people inside the room
    String[] birthCopy;
    String birthStr;
    int[] count;
    double fraction;
    int k = 0;
    String line;
    int numExp = 0; // Number of experiments already performed
    int numInside; // Number of people inside the room
    int[] numPeople = new int[trials]; // Array that stores the results of the various experiments
    int numPeopleMax; // The largest integer in the array numPeople
    int r; // Stores a pseudo-random integer
    double sum;
    double trialsDouble = (double) trials;
    boolean twoShare; // At least two people have the same birthday?

    // Performs the experiments
    while (numExp < trials) {

      // We’ll start with one person inside the room
      numInside = 1;
      r = (int) (Math.random() * n);
      birth = new int[] {r};
      birthStr = "" + r;

      // Lets one more person into the room as long as
      // we cannot find at least two people with the same birthday
      twoShare = false;
      while (!twoShare) {

        // Lets another person into the room
        numInside++;
        r = (int) (Math.random() * n); // Date of birth of the new person

        // Checks the array birth to determine
        // if the new person has the same birthday
        // as someone that was already inside the room
        for (int i = 0; i < numInside - 1; i++) {
          if (r == birth[i]) {
            twoShare = true;
            break;
          }
        }

        // If we still cannot find at least two people with the same birthday,
        // we need to make preparations in order to let one more person into the room
        if (!twoShare) {

          // Updates the array birth
          birthStr += " " + r;
          birthCopy = birthStr.split(" ");
          birth = new int[numInside];
          for (int i = 0; i < numInside; i++) {
            birth[i] = Integer.parseInt(birthCopy[i]);
          }

        // In this case, we are ready to stop
        // However, first we need to register the result of the experiment
        // and increase the number of experiments already performed
        } else {

          numPeople[numExp] = numInside;
          numExp++;

        }

      }

    }

    // Finds the largest integer in the array numPeople
    numPeopleMax = numPeople[0];
    for (int i = 1; i < trials; i++) {
      if (numPeople[i] > numPeopleMax) {
        numPeopleMax = numPeople[i];
      }
    }

    // Loads the array count
    count = new int[numPeopleMax];
    for (int i = 0; i < trials; i++) {
      count[numPeople[i] - 1]++;
    }

    // Prints the table
    sum = (double) count[k];
    fraction = sum / trialsDouble;
    while (fraction < 0.5) {
      line = (k + 1) + "\t" + count[k] + "\t" + fraction;
      System.out.println(line);
      k++;
      sum += (double) count[k];
      fraction = sum / trialsDouble;
    }
    line = (k + 1) + "\t" + count[k] + "\t" + fraction;
    System.out.println(line);

  }

}
