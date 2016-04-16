package content;

import java.util.Scanner;

public class B {
	static int b[] = {1, 0, 0, 0, 0, 0, 1, 0, 2, 1}; 
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			char a[] = cin.next().toCharArray();
			int s = 0;
			for (int i=0; i<a.length; i++) 
				s += b[a[i] - '0'];
			System.out.println(s);
		}
		cin.close();
	}
}
