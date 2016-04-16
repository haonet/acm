import java.util.Scanner;

public class P1328 {
	static int n, m;
	static char a[][] = new char[151][151];
	static int idx[][] = new int[151][151];
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			n = cin.nextInt();
			m = cin.nextInt();
			int cnt = 0;
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++)
					idx[i][j] = 0;
			}
			for (int i = 0; i < n; i++) {
				a[i] = cin.next().toCharArray();
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (a[i][j] == 'W' && idx[i][j] == 0) {
						dfs(i, j, ++cnt);
					}
				}
			}
			System.out.println(cnt);
		}
		cin.close();
	}

	private static void dfs(int i, int j, int id) {
		if (i < 0 || i >= n || j < 0 || j >= m) return;
		if (idx[i][j] != 0 || a[i][j] != 'W') return;
		idx[i][j] = id;
		for (int di=-1; di<=1; di++) {
			for (int dj=-1; dj<=1; dj++) {
				if (di != 0 || dj != 0)
					dfs(di + i, dj + j, id);
			}
		}
	}
}
