import java.util.Scanner;

public class P1202 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			if (n == 0)
				break;
			int p = 1, q = 2, t = 0;
			if (n == 1 || n == 2)
				System.out.println(n);
			else {
				while (n-- > 2) {
					t = p + q;
					p = q;
					q = t;
				}
				System.out.println(t);
			}
		}
		cin.close();
	}
}
