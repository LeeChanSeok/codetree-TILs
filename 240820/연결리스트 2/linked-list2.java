import java.util.Scanner;

public class Main {
	static int MAX = 100000;

	static class Node {
		int v;
		Node prev, next;

		public Node(int v) {
			super();
			this.v = v;
			this.prev = this.next = null;
		}

	}

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		Node[] nodes = new Node[MAX + 1];
		for (int i = 1; i <= MAX; ++i) {
			nodes[i] = new Node(i);
		}

		m = sc.nextInt();
		for (int i = 0; i < m; ++i) {
			int cmd = sc.nextInt();

			if (cmd == 1) {
				int v = sc.nextInt();
				disconnext(nodes[v]);

			} else if (cmd == 2) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				insertPrev(nodes[x], nodes[y]);
			} else if (cmd == 3) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				insertNext(nodes[x], nodes[y]);
			} else if (cmd == 4) {
				int v = sc.nextInt();
				print(nodes[v]);
			}

		}

		for (int i = 1; i <= n; ++i) {
			if (nodes[i].next != null)
				System.out.print(nodes[i].next.v);
			else
				System.out.print(0);
			System.out.print(" ");
		}

	}

	private static void disconnext(Node node) {

		if (node.prev != null) {
			node.prev.next = node.next;
		}

		if (node.next != null) {
			node.next.prev = node.prev;
		}

		node.prev = node.next = null;

	}

	private static void print(Node cur) {

		String str = "";
		if (cur.prev == null)
			str += "0";
		else
			str += cur.prev.v;
		str += " ";

		if (cur.next == null)
			str += "0";
		else
			str += cur.next.v;
		System.out.println(str);
	}

	private static void insertPrev(Node cur, Node node) {

		node.prev = cur.prev;
		node.next = cur;

		if (node.prev != null) {
			node.prev.next = node;
		}

		if (node.next != null) {
			node.next.prev = node;
		}

	}

	private static void insertNext(Node cur, Node node) {

		node.prev = cur;
		node.next = cur.next;

		if (node.next != null) {
			node.next.prev = node;
		}

		if (node.prev != null) {
			node.prev.next = node;
		}

	}

}