package content;

import java.util.Scanner;

public class G {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int a[] = new int[n];
			for (int i=0; i<n; i++) {
				a[i] = cin.nextInt();
			}
			int cnt = 0;
			for (int i=0; i<n-1; i++) {
				for (int j=i + 1; j<n; j++) {
					if (gcd(a[i], a[j]) == 1)
						cnt++;
				}
			}
			System.out.println(cnt);
		}
		cin.close();
	}

	private static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}
