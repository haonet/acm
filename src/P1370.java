import java.util.Scanner;

public class P1370 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int a[] = new int[n];
			for (int i=0; i<n; i++)
				a[i] = cin.nextInt();
			solve(a, n);
		}
		cin.close();
	}

	private static void solve(int[] a, int n) {
		int step = 0;
		int sum = 0;
		for (int i=0; i<n; i++)
			sum += a[i];
		int avg = sum / 4;
		if (sum % n == 0) {
			for (int i=0; i<n-1; i++) {
				if (a[i] != avg) {
					a[i+1] += a[i] - avg;
					step++;
				}
			}
			System.out.println(step);
		}else {
			System.out.println("Oh no!");
		}
	}
}
