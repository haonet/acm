import java.util.HashMap;
import java.util.Scanner;

public class P1295new {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextLine()) {
			String b[] = cin.nextLine().trim().split("\\s+");
			if (b.length == 1) continue; 
			HashMap<String, Integer> in = new HashMap<>();
			HashMap<String, Integer> out = new HashMap<>();
			for (int i=1; i<b.length; i++) {
				in.put(b[i], 0);
				out.put(b[i], 0);
			}
			int m = Integer.parseInt(cin.nextLine().trim());
			for (int i=0; i<m; i++) {
				String a[] = cin.nextLine().trim().split("\\s+");
				if (a[0].equals(a[2])) continue;
				else {
					in.put(a[2], in.get(a[2]) + 1);
					out.put(a[0], out.get(a[0]) + 1);
				}
			}
			for (int i=1; i<b.length; i++) {
				System.out.println(String.format("%s %d %d", b[i], in.get(b[i]),out.get(b[i])));
			}
			System.out.println();
			
		}
		cin.close();
	}
}
