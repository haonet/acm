import java.util.Scanner;

public class P1247 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int ans[] = new int[1000 + 5];
		ans[1] = 1; ans[2] = 1; ans[3] = 2; ans[4] = 3;
		ans[5] = 5; ans[6] = 7;
		for (int i=7, j=2; i<1000; i++, j+=2)
			ans[i] = ans[i-1] + j;
		while (true) {
			String s = cin.next();
			if (s == null) break;
			int n = Integer.parseInt(s);
			System.out.println(ans[n]);
		}
		cin.close();
	}
}
