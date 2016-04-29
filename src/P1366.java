import java.util.HashMap;
import java.util.Scanner;

public class P1366 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String D = cin.next().toLowerCase();
			String L = cin.next().toLowerCase();
			int D_num = dota(D);
			int L_num = lol(L);
			System.out.println("Dotaer: "+D_num);
			System.out.println("Loler: "+L_num);
			if (D_num > 3 * L_num)
				System.out.println("Loler win");
			else 
				System.out.println("Dotaer win");
		}
		cin.close();
	}

	private static int lol(String l) {
		int min = Integer.MAX_VALUE;
		char a[] = l.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('l', 0);
		map.put('o', 0);
		map.put('e', 0);
		map.put('r', 0);
		for (int i=0; i<a.length; i++) {
			if (!map.containsKey(a[i]))
				map.put(a[i], 1);
			else
				map.put(a[i], map.get(a[i]) + 1);
		}
		if (map.containsKey('l'))
			map.put('l', map.get('l')/2);
		for (Character ch : map.keySet()) {
			if (map.get(ch) < min)
				min = map.get(ch);
		}
		return min;
	}

	private static int dota(String d) {
		int min = Integer.MAX_VALUE;
		char a[] = d.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('d', 0);
		map.put('o', 0);
		map.put('t', 0);
		map.put('a', 0);
		map.put('e', 0);
		map.put('r', 0);
		for (int i=0; i<a.length; i++) {
			if (!map.containsKey(a[i]))
				map.put(a[i], 1);
			else
				map.put(a[i], map.get(a[i]) + 1);
		}
		for (Character ch : map.keySet()) {
			if (map.get(ch) < min)
				min = map.get(ch);
		}
		return min;
	}
}
