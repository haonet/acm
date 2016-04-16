import java.util.Scanner;

public class P1334 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			double p = cin.nextDouble();
			p /= 100.0;
			for (int i=1; i<=150; i++) {
				if (f(i) > p) {
					System.out.println(i);
					break;
				}
			}
		}
		cin.close();
	}

	private static double f(int n) {
		double s = 1.0;
		for (int i=365 - n + 1; i<=365; i++) {
			s *= i * 1.0 / 365.0;
		}
		return 1 - s;
	}
}
