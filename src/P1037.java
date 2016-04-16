
public class P1037 {
	static int C[] = new int[8];
	static int n = 8;
	static int tot = 0;
	public static void main(String[] args) {
		search(0);
	}
	private static void search(int cur) {
		if (cur == n) {
			tot++;
			for (int i=0; i<n; i++) {
				System.out.print(C[i]);
			}
			System.out.println();
		}
		else for (int i=0; i<n; i++) {
			boolean ok = true;
			C[cur] = i;
			for (int j=0; j<cur; j++) {
				if (C[cur] == C[j] || cur - C[cur] == j - C[j] || cur + C[cur] == j + C[j]){
					ok = false; break;
				}
			}
			if (ok)
				search(cur + 1);
		}
	}
}
