
import java.util.LinkedList;
import java.util.Scanner;


public class P1371new {
	static int n, start, m, b[];
	static LinkedList<Integer> list;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			n = cin.nextInt();
			start = cin.nextInt();
			m = cin.nextInt();
			b = new int[m];
			for (int i=0; i<m; i++)
				b[i] = cin.nextInt();
			init();
			solve();
		}
		cin.close();
	}
	private static void init() {
		list = new LinkedList<>();
		for (int i=1; i<=n; i++) 
			list.add(i);
	}
	private static void solve() {
		int index = start - 1;
		list.remove(index);
		for (int i=0; i<m; i++) {
			index = (index + b[i] - 1) % list.size();
			list.remove(index);
		}
		for (int i=0; i<list.size(); i++)
			System.out.print(list.get(i)+" ");
		System.out.println();
		list.remove();
	}
}