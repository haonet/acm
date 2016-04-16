package content;

import java.util.HashMap;
import java.util.Scanner;

public class K {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String begin[] = cin.nextLine().trim().split("\\s+");
			if (begin.length == 1)
				continue;
			int n = Integer.parseInt(cin.nextLine().trim());
			HashMap<String, Integer> to = new HashMap<String, Integer>();
			HashMap<String, Integer> have = new HashMap<String, Integer>();
			for (int i=0; i<Integer.parseInt(begin[0]); i++) {
				to.put(begin[i+1], 0);
				have.put(begin[i+1], 0);
			}
			for (int i=0; i<n; i++) {
				String s[] = cin.nextLine().trim().split("\\s+");
				if (!s[0].equals(s[2])) {
					to.put(s[0], to.get(s[0]) + 1);
					have.put(s[2], have.get(s[2]) + 1);
				}
			}
			for (int i=0; i<Integer.parseInt(begin[0]); i++) {
				System.out.println(begin[i + 1] +" "+ have.get(begin[i+1])+ " " + to.get(begin[i+1]));
			}
			System.out.println();
		}
		cin.close();
	}
}
