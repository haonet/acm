package content;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a = cin.nextInt(), b = cin.nextInt();
			System.out.println(a + f(b));
		}
		cin.close();
	}

	private static int f(int b) {
		int s = 0;
		while (b > 0) {
			s = s * 10  + b % 10;
			b /= 10;
		}
		return s;
	}
}
