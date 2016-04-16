package content;

import java.util.HashMap;
import java.util.Scanner;

public class R {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt(), m = cin.nextInt();
			
			HashMap<Integer, Integer> map = new HashMap<>();
			for (int i=0; i<n; i++) 
				map.put(cin.nextInt(), 0);
			for (int i=0; i<m; i++) {
				int num = cin.nextInt();
				if (map.containsKey(num))
					map.put(num, map.get(num) + 1);
			}
			int s = cin.nextInt();
			if (map.get(s) == 0)
				System.out.println("NO");
			else 
				System.out.println("YES");
		}
		cin.close();
	}
}
