package dynamic_memo;
import java.util.ArrayList;
import java.util.List;

public class MinCostPath {

	public int minCost(int[][] cost, int m, int n) {

		int temp[][] = new int[m + 1][n + 1];
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			temp[0][i] = sum + cost[0][i];
			sum = temp[0][i];
		}
		sum = 0;
		for (int i = 0; i <= m; i++) {
			temp[i][0] = sum + cost[i][0];
			sum = temp[i][0];
		}

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				temp[i][j] = cost[i][j]
						+ min(temp[i - 1][j - 1], temp[i - 1][j],
								temp[i][j - 1]);
			}
		}

		System.out.println("Printing Path");

		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				System.out.print(temp[i][j] + " ");
			}
			System.out.println();
		}

		int i = m;
		int j = n;
		List<Integer> l = new ArrayList<Integer>();
		l.add(temp[m][n]);
		while (i > 0 || j > 0) {
			int minVal = Integer.MAX_VALUE;

			if (i > 0 && j > 0) {
				minVal = min(temp[i - 1][j - 1], temp[i - 1][j], temp[i][j - 1]);

				if (minVal == temp[i - 1][j - 1]) {
					i--;
					j--;
					l.add(temp[i][j]);
				} 
				
				else if (minVal == temp[i][j - 1]) {
					j--;
					l.add(temp[i][j]);
				} else {
					i--;
					l.add(temp[i][j]);
				}
			}

				if (i <= 0) {
					minVal = temp[i][j - 1];
					l.add(temp[i][j - 1]);
					j--;
					continue;
				}
				if (j <= 0) {
					minVal = temp[i - 1][j];
					l.add(minVal = temp[i - 1][j]);
					i--;
					continue;
				}
			

		}

		System.out.println(l.toString());
		return temp[m][n];
	}

	public int minCostRec(int cost[][], int m, int n) {
		return minCostRec(cost, m, n, 0, 0);
	}

	public int minCostRec(int cost[][], int m, int n, int x, int y) {
		if (x > m || y > n) {
			return Integer.MAX_VALUE;
		}
		if (x == m && y == n) {
			return cost[m][n];
		}

		int t1 = minCostRec(cost, m, n, x + 1, y);
		int t2 = minCostRec(cost, m, n, x + 1, y + 1);
		int t3 = minCostRec(cost, m, n, x, y + 1);

		return cost[x][y] + min(t1, t2, t3);
	}

	private int min(int a, int b, int c) {
		int l = Math.min(a, b);
		return Math.min(l, c);
	}

	public static void main(String args[]) {
		MinCostPath mcp = new MinCostPath();
		int cost[][] = { { 1, 2, 3 }, { 4, 8, 2 }, { 1, 5, 3 }, { 6, 2, 9 } };
		int result = mcp.minCost(cost, 3, 2);
		int result1 = mcp.minCostRec(cost, 3, 2);
		System.out.println(result);
		System.out.println(result1);
	}

}