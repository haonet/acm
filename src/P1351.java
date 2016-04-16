import java.util.Scanner;

public class P1351 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int s = 1;
		for (int i=0; i<n; i++) {
			int num = cin.nextInt();
			if (num % 2 == 0)
				s *= num;
		}
		if (s == 1)
			System.out.println(0);
		else {
			System.out.println(s);
		}
		cin.close();
	}
}
