import java.util.Scanner;
import java.util.Stack;

public class P1369 {
	static int n, m, a[][], dp[][];
	static Stack<Integer> stack;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			n = cin.nextInt();
			m = cin.nextInt();
			a = new int[n+1][m+1];
			dp = new int[n+1][m+1];
			for (int i=1; i<=n; i++) {
				for (int j=1; j<=m; j++)
					a[i][j] = cin.nextInt();
			}
			System.out.println(solve());
			printPath();
		}
		cin.close();
	}
	private static void printPath() {
		stack = new Stack<>();
		Pu(n, m);
		while (!stack.isEmpty()) {
			System.out.println("("+stack.pop()+","+stack.pop()+")");
		}
		stack.removeAllElements();
	}
	private static void Pu(int n, int m) {
		stack.push(m);
		stack.push(n);
		if (n == 1 && m == 1)
			return;
		else if (n == 1 && m > 1)
			Pu(n, m-1);
		else if (n > 1 && m == 1)
			Pu(n-1, m);
		else {
			if (dp[n-1][m] > dp[n][m-1])
				Pu(n-1, m);
			else
				Pu(n, m-1);
		}
	}
	private static int solve() {
		for (int i=0; i<=n; i++)
			dp[i][0] = 0;
		for (int j=0; j<=m; j++)
			dp[0][j] = 0;
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=m; j++) {
				dp[i][j] = a[i][j] + Math.max(dp[i-1][j], dp[i][j-1]);
			}
		}
		return dp[n][m];
	}
}