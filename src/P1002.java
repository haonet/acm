import java.util.Scanner;

public class P1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int cnt = 0;
		while (cin.hasNext()) {
			int count = 0;
			String s = cin.next();
			char a[] = s.toCharArray();
			for (int i = 0; i < s.length(); i++) {
				if (a[i] == '6' || a[i] == '8') {
					count++;
				}
				if (a[i] == '4') {
					count = 0;
					break;
				}
			}
			if (count >= 5) {
				System.out.println(s);
				cnt++;
			}
		}
		System.out.println(cnt);
		cin.close();
	}

}
