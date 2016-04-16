package content;

import java.util.Scanner;

public class J {
	static int a[][] =new int[3][3];
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int k = 0;
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				a[i][j] = ++k;
			}
		}
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int b[] = new int[n];
			for (int i=0; i<n; i++) {
				b[i] = a[cin.nextInt()][cin.nextInt()];
			}
			for (int i=0; i<b.length; i++)
				System.out.print(b[i]);
			System.out.println();
		}
		cin.close();
	}
}
