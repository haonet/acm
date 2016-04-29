
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class P1021new {
	static int n, m, k;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		n = cin.nextInt();
		m = cin.nextInt();
		k = cin.nextInt();
		LinkedList<Integer> list = new LinkedList<>();
		for (int i=1; i<=n; i++) {
			list.add(i);
		}
		int j = 0;
		for (int i=0; i<n-k; i++) {
			j = (j + m - 1) % list.size();
			list.remove(j);
		}
		Iterator<Integer> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}System.out.println();
		cin.close();
	}
}
