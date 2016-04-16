package content;

import java.util.Scanner;

public class L {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int t = cin.nextInt();
			while (t-- > 0) {
				String num = cin.next();
				int m = cin.nextInt(), k = cin.nextInt();
				char str[] = new char[m];
				for (int i=0; i<m; i++)
					str[i] = '9';
				num = new String(str) + num;
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
		long sum = 0, max = 0;
		for (int i=0; i<a.length; i++) {
			sum = 0;
			for (int j=0; j<a.length; j++) {
				if (i != j){
					sum = sum * 10 + a[j] - '0';
				}
			}
			if (sum > max)
				max = sum;
		}
		return String.valueOf(max);
	}
}
