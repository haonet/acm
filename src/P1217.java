import java.util.Scanner;

public class P1217 {
	static int a[] = new int[200];
	public static void main(String[] args) {
		for (int i='0'; i<='9'; i++)
			a[i] = i - '0';
		for (int i='A'; i<='Z'; i++)
			a[i] = i - 'A' + 10;
		for (int i='a'; i<='z'; i++)
			a[i] = i - 'a' + 36; 
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int t = cin.nextInt();
			while (t-- > 0) {
				int s = cin.nextInt(), d = cin.nextInt();
				String st = cin.next();
				System.out.println(s+" "+st);
				long dec = toDec(st, s);
				System.out.println(dec);
				System.out.print(d+" ");
				toAns(dec, d);
				
			}
		}
		cin.close();
	}
	private static void toAns(long dec, int d) {
		char ans[] = new char[100];
		int k = 0;
		while (dec > 0) {
			ans[k++] = (char) (dec % d + '0');
			dec /= d;
		}
		for (int i=k; i>=0; i--) {
			System.out.print(ans[k]);
		}System.out.println();
		System.out.println();
	}
	private static long toDec(String st, int s) {
		char b[] = st.toCharArray();
		long sum = 0;
		for (int i=0; i<b.length; i++) {
			sum = sum * s + a[b[i]];
		}
		return sum;
	}
}
