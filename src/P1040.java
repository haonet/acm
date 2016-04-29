import java.util.Scanner;

public class P1040 {
	static int max, mi, n;
	static long sum;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			n = cin.nextInt();
			int a[] = new int[2 * n];
			for (int i=0; i<2*n-1; i+=2) {
				a[i] = cin.nextInt();
				a[i+1] = cin.nextInt();
			}
			max = 0; sum =0;
			sum = f(a);
			System.out.println(sum);
		}
		cin.close();
	}

	private static long f(int []a) {
		sum = 0;
		for (int i=1; i<2*n-1; i+=2) {
			max = 0;
			for (int j=1; j<n*2-1; j+=2) {
				if (max < a[j]) {
					max = a[j];
					mi = j;
				}
			}
			if (max > 0) {
				for (int x = mi-1, y = mi+2; x>0 && y<2*n-1;) {
					if (a[x] !=0 && a[y] != 0) {
						sum += a[x]*a[y]*a[mi];
						a[mi] = 0;
						a[mi+1] = 0;
					}
					if (a[x] == 0)
						x--;
					if (a[y] == 0)
						y++;
				}
			}
		}
		return sum + a[0] * a[2*n-1];
	}
}
