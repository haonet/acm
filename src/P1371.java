import java.util.Scanner;

public class P1371 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int num = cin.nextInt(), start = cin.nextInt(), n = cin.nextInt();
			int step[] = new int[n];
			for (int i=0; i<n; i++)
				step[i] = cin.nextInt();
			solve(num, start, step, n);
		}
		cin.close();
	}

	private static void solve(int num, int start, int[] step, int n) {
		int a[] = new int[num+1];
		for (int i=0; i<num; i++)
			a[i] = i+1;
		a[num] = 1;
		int head = start - 1;
		a[head] = a[a[head]];
		a[start] = 0;
		for (int i=0; i<n; i++) {
			for (int j=1; j<step[i]; j++) {
				head = a[head];
			}
			int k = a[head];
			a[head] = a[a[head]];
			a[k] = 0;
		}
		for (int i=1; i<=num; i++) {
			if (a[i] != 0)
				System.out.print(i+" ");
		}
		System.out.println();
	}
}