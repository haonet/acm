package content;

import java.util.Scanner;

public class P {
	private static final int INF = -1;
	static int n, m;
	static int[][] a;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			n = cin.nextInt();
			m = cin.nextInt();
			int k = cin.nextInt();
			a = new int[n][m];
			for (int i=0; i<n; i++) {
				for (int j=0; j<m; j++) {
					a[i][j] = 0;
				}
			}
			for (int i=0; i<k; i++) {
				int x = cin.nextInt(), y = cin.nextInt();
				a[x][y] = INF;
			}
			for (int i=0; i<n; i++) {
				for (int j=0; j<n; j++) {
					if (a[i][j] == INF) {
						f(a, i, j);
					}
				}
			}
			for (int i=0; i<n; i++) {
				for (int j=0; j<m; j++) {
					if (a[i][j] != INF)
						System.out.print(a[i][j]);
					else System.out.print("*");
				}System.out.println();
			}
			System.out.println();
		}
		cin.close();
	}
	private static void f(int[][] a, int x, int y) {
		for (int i=-1; i<=1; i++) {
			for (int j=-1; j<=1; j++) {
				if (!(i == 0 && j == 0) && x + i >= 0 && x + i < n && y + j >= 0 && y +j < m && a[i + x][y + j] != INF )
					a[i + x][j + y]++;
			}
		}
	}
}
