
import java.util.Scanner;

public class P1149 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int m = cin.nextInt();
			System.out.println(f(n, m));
		}
		cin.close();
	}

	private static long f(int n, int m) {
		return Cnm(n, n- m) * g(m);
	}

	private static long g(int n) {
		if (n == 1)
			return 0;
		if (n == 2)
			return 1;
		return (n-1) * (g(n-1) + g(n-2));
	}

	private static long Cnm(int n, int m) {

		return fun(n)/fun(m)/fun(n-m);
	}

	private static long fun(int n) {
		long k = 1;
		for (long i=1; i<=n; i++)
			k *= i;
		return k;
	}
}
