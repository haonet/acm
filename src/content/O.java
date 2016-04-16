package content;

import java.util.HashMap;
import java.util.Scanner;

public class O {
	static HashMap<String, Integer> map = new HashMap<>();
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			map.put("2", 2);
			map.put("3", 3);
			map.put("4", 4);
			map.put("5", 5);
			map.put("6", 6);
			map.put("7", 7);
			map.put("8", 8);
			map.put("9", 9);
			map.put("10", 10);
			map.put("J", 10);
			map.put("Q", 10);
			map.put("K", 10);
			String first[] = cin.nextLine().trim().split("\\s+");
			@SuppressWarnings("unused")
			int n = Integer.parseInt(first[0]), m = Integer.parseInt(first[1]);
			String host[] = cin.nextLine().trim().split("\\s+");
			String guest[] = cin.nextLine().trim().split("\\s+");
			if (f(host) >= f(guest))
				System.out.println(String.format("%d vs %d HOST WIN", f(host), f(guest)));
			else
				System.out.println(String.format("%d vs %d GUEST WIN", f(host), f(guest)));
		}
		cin.close();
	}
	private static int f(String[] host) {
		int sum = 0, A = 0;
		for (int i=0; i<host.length; i++) {
			if (host[i].equals("A")) {
				sum += 1;
				A++;
			}
			else {
				if (map.containsKey(host[i]))
					sum += map.get(host[i]);
			}
		}
		if (sum > 21)
			sum = 0;
		while (A-- > 0) {
			if (sum + 10 > 21)
				sum += 0;
			else 
				sum += 10;
		}
		
		return sum;
	}
}
