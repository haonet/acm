import java.util.Scanner;

public class P1276 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int m1 = cin.nextInt();
			int m2 = cin.nextInt();
			int count = 0;
			for (int i = 1; i < n; i++) {
				if (i % m1 == 0 || i % m2 == 0) {
					count++;
				}
			}
			System.out.println(count);
		}
		cin.close();
	}
}
