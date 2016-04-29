import java.util.Scanner;

public class P1039 {
	static int n, V, v[], m[], dp[][] = new int[200][500];
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			n = cin.nextInt(); V = cin.nextInt();
			v = new int[n+1];
			m = new int[n+1];
			for (int i=1; i<=n; i++)
				v[i] = cin.nextInt();
			for (int i=1; i<=n; i++)
				m[i] = cin.nextInt();
			for (int i=1; i<=n; i++) {
				for (int j=0; j<=V; j++) {
					dp[i][j] = (i==1 ? 0 : dp[i-1][j]);
					if (j >= v[i])
						dp[i][j] = Math.max(dp[i][j], dp[i-1][j-v[i]] + m[i]);
				}
			}
			System.out.println(dp[n][V]);
			
		}
		cin.close();
	}
}
