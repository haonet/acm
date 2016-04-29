import java.util.Scanner;

public class P1304 {
	static int cnt, dp[][];
	static char a[], b[];
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int t = cin.nextInt();
			while (t-- > 0) {
				a = cin.next().toCharArray();
				b = new char[a.length];
				for (int i=a.length-1, j=0; i>=0; i--, j++)
					b[j] = a[i];
				init(a.length);
				int max = 0;
				max = solve(a.length);
				System.out.println(a.length-max);
			}
		}
		cin.close();
	}
	private static int solve(int n) {
		int max = 0;
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				 if (a[i-1] == b[j-1])
					 dp[i][j] = dp[i-1][j-1] + 1;
				 else if (a[i-1] != b[j-1])
					 dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				 if (max < dp[i][j])
					 max = dp[i][j];
			}
		}
		return max;
	}
	private static void init(int n) {
		dp = new int[n+1][n+1];
		for (int i=0; i<=n; i++)
			for (int j=0; j<=n; j++) {
				dp[i][j] = 0;
			}
	}
}
