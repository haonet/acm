import java.util.Scanner;

public class P1328new {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String a = cin.nextLine();
			String[] b = a.split(" ");
			int n = Integer.parseInt(b[0]);
			int m = Integer.parseInt(b[1]);
			String[][] c = new String[n + 2][m + 2];
			for (int i = 1; i <= n; i++) {
				String f = cin.nextLine() + ".";
				c[i] = f.split("");
			}
			for (int i = 0; i < n + 2; i++)
				c[i][0] = ".";
			for (int j = 0; j < m + 2; j++) {
				c[0][j] = ".";
				c[n + 1][j] = ".";
			}
			int ans = 0;
			for (int i = 1; i <= n; i++)
				for (int j = 1; j <= m; j++)
					if (c[i][j].equals("W")) {
						ans++;
						dfs(i, j, c, n, m);
					}
			System.out.println(ans);
		}
		cin.close();
	}

	private static void dfs(int x, int y, String[][] c, int n, int m) {
		c[x][y] = ".";
		for (int dx = -1; dx <= 1; dx++) {
			for (int dy = -1; dy <= 1; dy++) {
				int nx = x + dx;
				int ny = y + dy;
				if (nx >= 1 && nx < n + 1 && ny >= 1 && ny < m + 1 && c[nx][ny].equals("W")) {
					dfs(nx, ny, c, n, m);
				}
			}
		}
	}
}
