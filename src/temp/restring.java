package temp;

import java.util.Scanner;

public class restring {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0) {
			char a[] = cin.next().toCharArray();
			char b[] = new char[a.length];
			for (int i=a.length-1, j = 0; i>=0; i--, j++)
				b[j] = a[i];
			int A[][] = new int[a.length][b.length];
			for (int i=0; i<a.length; i++) {
				for (int j=0; j<b.length; j++) {
					if (a[i] == b[j])
						A[i][j] = 1;
					else
						A[i][j] = 0;
				}
			}
			int max = solve(A, a.length, a.length);
			System.out.println(Math.abs(a.length - max));
		}
		cin.close();
	}

	private static int solve(int[][] A, int n, int m) {
		int dp[][] = new int[n+1][m+1];
		for (int i=0; i<=n; i++)
			dp[i][0] = 0;
		for (int j=0; j<=m; j++)
			dp[0][j] = 0;
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=m; j++) {
				if (i >= 1 && j >= 1)
					dp[i][j] = A[i-1][j-1] + Math.max(dp[i-1][j], dp[i][j-1]);
			}
		}
		return dp[n][m];
	}
}
