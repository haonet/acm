import java.util.Scanner;

public class P1054 {
	static int a[];
	static int b[];
	static int cnt = 0;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int t = cin.nextInt();
			while (t-- > 0) {
				cnt = 0;
				int n = cin.nextInt();
				a = new int[n];
				b = new int[n];
				for (int i=0; i<n; i++){
					a[i] = cin.nextInt();
				}
				MergeSort(0, n-1);
				System.out.println(cnt);
			}
		}
		cin.close();
	}
	private static void MergeSort(int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			MergeSort(start, mid);
			MergeSort(mid + 1, end);
			Merge(start, mid, end);
		}
	}
	private static void Merge(int start, int mid, int end) {
		int i = start, j = mid + 1, k = start;
		while (i <= mid && j <= end) {
			if (a[i] <= a[j]) { 
				b[k++] = a[i++];
			}
			else { 
				b[k++] = a[j++];
				cnt += mid - i + 1; 
			}
		}
		while (i <= mid)
			b[k++] = a[i++];
		while (j <= end)
			b[k++] = a[j++];
		for (int m=start; m<=end; m++)
			a[m] = b[m];
	}
}
