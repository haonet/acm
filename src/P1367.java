import java.util.Scanner;

public class P1367 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String s[] = cin.nextLine().trim().split("\\s+");
			easy(s);
		}
		cin.close();
	}

	private static void easy(String[] s) {
		int cnt = 1;
		for (int i=1; i<s.length; i++) {
			System.out.print(cnt+" ");
			if (s[i].equals(s[i-1])) 
				cnt++;
			else
				cnt = 1;
		}
		System.out.println(cnt);
	}
}
