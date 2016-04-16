import java.util.Scanner;

public class P1179 {
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
		while (n > 0) {
			n >>= 1;
			ret += n;
		}
		return ret + 1;
	}
}
