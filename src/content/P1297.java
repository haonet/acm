package content;

import java.util.Scanner;

public class P1297 {
	static long m;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			long a = cin.nextLong(), p = cin.nextLong();
			m = cin.nextLong();
			if (a == 0 && p == 0 && m == 0) break;
			System.out.println(pow(a % m, p));
		}
		cin.close();
	}
	private static long pow(long a, long p) {
		if (a == 0)
			return 0;
		if (a == 1 || p == 0)
			return 1;
		if (p % 2 == 0)
			return pow(a * a % m, p / 2) % m;
		else {
			return pow(a * a % m, p / 2) * a % m;
		}
	}
}
