import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static int ASCII = 130;
	static char[][] btree;
	static int[] visited;
	static int n, m, group, ans;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		btree = new char[ASCII][2];

		for (int i = 0; i < n; ++i) {
			char c = sc.next().charAt(0);
			char l = sc.next().charAt(0);
			char r = sc.next().charAt(0);

			btree[c][0] = l;
			btree[c][1] = r;

		}

		preOrder('A');
		System.out.println();
		inOrder('A');
		System.out.println();
		postOrder('A');
		System.out.println();

	}

	private static void preOrder(int idx) {

		System.out.print((char) (idx));
		if (btree[idx][0] != '.')
			preOrder(btree[idx][0]);
		if (btree[idx][1] != '.')
			preOrder(btree[idx][1]);

	}

	private static void inOrder(int idx) {

		if (btree[idx][0] != '.')
			inOrder(btree[idx][0]);
		System.out.print((char) (idx));
		if (btree[idx][1] != '.')
			inOrder(btree[idx][1]);

	}

	private static void postOrder(int idx) {

		if (btree[idx][0] != '.')
			postOrder(btree[idx][0]);
		if (btree[idx][1] != '.')
			postOrder(btree[idx][1]);
		System.out.print((char) (idx));

	}

}