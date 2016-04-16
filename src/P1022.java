import java.util.Scanner;

public class P1022 {
	static int n, m;
	static int a[][] = new int[101][101];
	static int idx[][] = new int[101][101];
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			m = cin.nextInt();
			n = cin.nextInt();
			for (int i=0; i<101; i++) {
				for (int j=0; j<101; j++)
					idx[i][j] = 0;
			}
			for (int i=0; i<m; i++) {
				for (int j=0; j<n; j++) {
					a[i][j] = cin.nextInt();				}
			}
			int cnt = 0;
			for (int i=0; i<m; i++) {
				for (int j=0; j<n; j++) {
					if (a[i][j] != 0 && idx[i][j] == 0)
						dfs(i, j, ++cnt);
				}
			}
			System.out.println(100 - 10 * cnt);
		}
		cin.close();
	}
	private static void dfs(int i, int j, int id) {
		if (i < 0 || i >= m || j < 0 || j >= n) return;
		if (idx[i][j] != 0 || a[i][j] == 0) return;
		idx[i][j] = id;
		for (int di=-1; di<=1; di++) {
			for (int dj=-1; dj<=1; dj++) {
				if (di != 0 || dj != 0)
					dfs(di + i, dj + j, id);
			}
		}
	}

}
