package content;

import java.util.Scanner;

public class M {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			char a[] = cin.next().toLowerCase().toCharArray();
			int c[] = new int[26];
			for (int i=0; i<a.length; i++) {
				c[a[i] - 'a']++;
			}
			int max = 0, mIndex = 0;
			for (int i=0; i<26; i++) {
				max = 0; mIndex = 0;
				for (int j=0; j<26; j++) {
					if (c[j] > max) {
						max = c[j];
						mIndex = j;
					}
				}
				if (max == 0) break;
				System.out.print((char)('a' + mIndex));
				c[mIndex] = 0;
			}
			System.out.println();
		}
		cin.close();
	}
}
