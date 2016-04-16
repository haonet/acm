import java.io.PrintWriter;
import java.util.Scanner;

public class P1088 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
	static class BTree {
		char root;
		BTree left, right;
		void preVisit(StringBuffer buffer) {
			buffer.append(root);
			if (left != null)
				left.preVisit(buffer);
			if (right != null)
				right.preVisit(buffer);
		}
		void midVisit(StringBuffer buffer) {
			if (left != null)
				left.preVisit(buffer);
			buffer.append(root);
			if (right != null)
				right.preVisit(buffer);
		}
		void postVisit(StringBuffer buffer) {
			if (left != null)
				left.preVisit(buffer);
			if (right != null)
				right.preVisit(buffer);
			buffer.append(root);
		}
		static BTree create(String pre, String mid) {
			if (pre.length() == 0)
				return null;
			BTree tree = new BTree();
			tree.root = pre.charAt(0);
			int pos = mid.indexOf(tree.root);
			String ml = mid.substring(0, pos);
			String mr = mid.substring(pos + 1);
			String pl = "";
			for (char c: pre.toCharArray())
				if (ml.indexOf(c) >= 0)
					pl += c;
			String pr = "";
			for (char c: pre.toCharArray())
				if (mr.indexOf(c) >= 0)
					pr += c;
			tree.left = create(pl, ml);
			tree.right = create(pr, mr);
			return tree;
		}
	}
	public static void main(String[] args) {
		
		while (cin.hasNext() && solve())
			;
			closeIO();
		cin.close();
	}
	private static boolean solve() {
		StringBuffer buffer = new StringBuffer();
		BTree.create(cin.next(), cin.next()).postVisit(buffer);
		cout.println(buffer);
		return true;
	}
	private static void closeIO() {
		if (cin != null)
			cin.close();
		if (cout != null)
			cout.close();
	}
}
