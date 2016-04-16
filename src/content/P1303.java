package content;

import java.util.Scanner;

public class P1303 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a = cin.nextInt(), b = cin.nextInt();
			if (f(a) > f(b))
				System.out.println(">");
			else if (f(a) < f(b))
				System.out.println("<");
			else {
				System.out.println("=");
			}
		}
		cin.close();
	}

	private static int f(int n) {
		if (n % 2 != 0)
			return 0;
		else {
			int cnt = 0;
			while (n % 2 == 0) {
				n /= 2;
				cnt++;
			}
			return cnt;
		}
	}
}
