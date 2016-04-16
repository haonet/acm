import java.util.Scanner;

public class P1019 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int m = cin.nextInt();
		while (m-- > 0) {
			int s = cin.nextInt() * cin.nextInt();
			int k = cin.nextInt();
			int sum = 0;
			for (int i=0; i<k; i++){
				int sx = cin.nextInt(), sy = cin.nextInt();
				int ex = cin.nextInt(), ey = cin.nextInt();
				sum += (ex - sx + 1 ) * (ey - sy + 1);
			}
			System.out.println(s - sum);
		}
		cin.close();
	}
}
