import java.util.Scanner;

public class P1043 {
	static final int INF = Integer.MAX_VALUE;
	static int a[][];
	static int b[];
	static int n, min, sum;

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			min = INF; sum = 0;
			n = cin.nextInt();
			a = new int[n][n];
			b = new int[n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++)
					a[i][j] = cin.nextInt();
			}
			search(0);
			System.out.println(min);
		}
		cin.close();
	}

	private static void search(int cur) {
		sum = 0;
		if (cur == n){
			for (int i=0; i<n; i++) {
				sum += a[i][b[i]];	
			}
			if (sum < min)
					min = sum;
		}
		else {
			for (int i=0; i<n; i++) {
				boolean ok = true;
				b[cur] = i;
				for (int j=0; j<cur; j++) {
					if (b[cur] == b[j]) {
						ok = false; break;
					}
				}
				if (ok)
					search(cur + 1);
			}
		}
	}
}