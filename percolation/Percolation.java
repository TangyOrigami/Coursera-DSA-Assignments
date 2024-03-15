import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
	private int row;
	private int col;
	private int[][] grid;

	// creates n-by-n grid, with all sites initially blocked
	// DONE
	public Percolation(int gridn) {
		this.row = gridn;
		this.col = gridn;

		int[][] grid = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				grid[i][j] = 0;
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
	}

	//  // opens the site (row, col) if it is not open already
	public void open(int row, int col) {
		//find row and column then set to 1.
		StdOut.println("what");
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
