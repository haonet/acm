import java.util.Scanner;

public class P1294new {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int t = cin.nextInt();
			while (t-- > 0) {
				String num = cin.next();
				int m = cin.nextInt();
				int k = cin.nextInt();
				char a[] = new char[m];
				for (int i=0; i<m; i++)
					a[i] = '9';
				num = new String(a) + num;
				for (int i=0; i<k; i++) {
					num = delete(num);
				}
				System.out.println(num);
			}
		}
		cin.close();
	}

	private static String delete(String num) {
		char a[] = num.toCharArray();
		long max = 0;
		for (int i=0; i<a.length; i++) {
			long sum = 0;
			for (int j=0; j<a.length; j++) {
				if (i != j) {
					sum = sum * 10 + a[j] - '0';
				}
			}
			if (max < sum)
				max = sum;
		}
		return String.valueOf(max);
	}
}
