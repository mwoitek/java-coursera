public class ShannonEntropy
{
  public static void main(String[] args)
  {

    int m = Integer.parseInt(args[0]);

    double entropy = 0.0;
    int[] freq = new int[m]; // Frequencies
    int newInt;
    double[] prop = new double[m]; // Proportions
    int seqRead = 0; // How many numbers of the sequence have been read

    while (!StdIn.isEmpty())
    {
      newInt = StdIn.readInt();
      freq[newInt - 1]++;
      seqRead++;
    }

    // Loads the array prop
    double seqReadDouble = (double) seqRead;
    for (int i = 0; i < m; i++)
      prop[i] = ((double) freq[i]) / seqReadDouble;

    // Evaluates the Shannon entropy
    for (int i = 0; i < m; i++)
    {
      if (freq[i] != 0)
        entropy -= prop[i] * Math.log(prop[i]);
    }
    entropy /= Math.log(2.0);
    StdOut.printf("%.4f\n", entropy);

  }
}
