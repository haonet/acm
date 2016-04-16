import java.util.Scanner;

public class P1347nw {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			System.out.println(f(n));
		}
		cin.close();
	}

	private static int f(int n) {
		int ret = 0;
		for (int i=1; i<=n; i++) {
			int j = i;
			while (j % 5 == 0) {
				ret++;
				j /= 5;
			}
		}
		return ret;
	}
}
