package content;

import java.util.Scanner;

public class F {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String a = cin.next();
			int n = cin.nextInt();
			String s = "";
			long sum = 0;
			for (int i=1; i<=n; i++) {
				s = "";
				for (int j=0; j<i; j++) {
					s = s + a;
				}
				sum += Long.parseLong(s);
			}
			System.out.println(sum);
		}
		cin.close();
	}
}
