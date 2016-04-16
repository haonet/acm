import java.util.HashMap;
import java.util.Scanner;

public class P1193 {
	static	String EMPTY = new String("\u8fd8\u6709\u6ca1\u6709\u5973\u5b69\u5b50\u613f\u610f\u8ddf\u6211\u4e00\u8d77\u56de\u5bb6\u79cd\u7530\u007e\u007e"); 
	static	String ACM = "\u7f8e\u4e3d\u7684\u5973\u5b69\uff0c\u4f60\u4e0d\u9002\u5408\u79cd\u7530\uff0c\u4f60\u9002\u5408\u505a\u0041\u0043\u004d\uff01"; 
	static	String FARMER = "\u5c31\u662f\u4f60\u4e86\uff0c\u966a\u6211\u56de\u5bb6\u79cd\u7530\u53bb\u5427\uff01";
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt(), m = cin.nextInt();
			if (n == 0 && m == 0) break;
			HashMap<Integer, Integer> map = new HashMap<>();
			
			for (int i=0; i<n; i++) {
				map.put(cin.nextInt(), 1);
			}
			int same = 0;
			for (int i=0; i<m; i++) {
				int v = cin.nextInt();
				if (map.containsKey(v))
					same++;
			}
			if (same > n / 2)
				System.out.println(ACM);
			else if (same == 0)
				System.out.println(EMPTY);
			else 
				System.out.println(FARMER);
			map.clear();
		}
		cin.close();
	}
}
