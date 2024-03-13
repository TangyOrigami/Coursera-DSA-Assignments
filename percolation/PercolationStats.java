import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class PercolationStats {

	//// perform independent trials on an n-by-n grid
	//public PercolationStats(int n, int trials)

	//   // sample mean of percolation threshold
	//   public double mean()

	//   // sample standard deviation of percolation threshold
	//   public double stddev()

	//   // low endpoint of 95% confidence interval
	//   public double confidenceLo()

	//   // high endpoint of 95% confidence interval
	//   public double confidenceHi()

	// test client (see below)
	public static void main(String[] args) {
		if (args.length < 2) {
			StdOut.println("Please provide at least 2 int arguments");
			return;
		}

		try {
			int num = Integer.parseInt(args[0]);

			Percolation percolation = new Percolation(num);

		} catch (IllegalArgumentException e) {
			System.out.println("Arguments n and trials must be > 0");
		}

	}
}
