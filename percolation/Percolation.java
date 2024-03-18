import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
	private int[][] grid;

	// creates n-by-n grid, with all sites initially blocked
	// DONE
	public Percolation(int n) {
		this.grid = new int[n][n];

		StdOut.println(grid[0]);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				grid[i][j] = 0;
			}
		}
	}

	//  // opens the site (row, col) if it is not open already
	public void open(int row, int col) {
		//find row and column then set to 1.
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}	
	}

	//  // is the site (row, col) open?
	//  public boolean isOpen(int row, int col)

	//  // is the site (row, col) full?
	//  public boolean isFull(int row, int col)

	//  // returns the number of open sites
	//  public int numberOfOpenSites()

	//  // does the system percolate?
	//  public boolean percolates()
}
