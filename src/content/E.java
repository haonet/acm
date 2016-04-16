package content;

import java.util.Scanner;

public class E {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int t = cin.nextInt();
			while (t-- > 0) {
				int a = cin.nextInt(), b = cin.nextInt(), c = cin.nextInt();
				if (a + b - c < 0)
					System.out.println("Impossible");
				else System.out.println(a + b - c);
			}
		}
		cin.close();
	}
}
