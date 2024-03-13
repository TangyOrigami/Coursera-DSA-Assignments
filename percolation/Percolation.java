import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {

	// creates n-by-n grid, with all sites initially blocked
	public Percolation(int n) {
		StdOut.println(n);
	}

	//  // opens the site (row, col) if it is not open already
	//  public void open(int row, int col)

	//  // is the site (row, col) open?
	//  public boolean isOpen(int row, int col)

	//  // is the site (row, col) full?
	//  public boolean isFull(int row, int col)

	//  // returns the number of open sites
	//  public int numberOfOpenSites()

	//  // does the system percolate?
	//  public boolean percolates()

	// test client (optional)
	public static void main(String[] args) {
		if (args.length < 2) {
			StdOut.println("Please provide at least 2 int arguments");
			return;
		}

		for (String arg : args) {
			try {
				Percolation percolation = Percolation();

				int num = Integer.parseInt(arg);

				percolation.Percolation(num);

			} catch (NumberFormatException e) {
				System.out.println("Invalid argument: " + arg + ". Please provide integer arguments.");
			}

		}
	}
}
