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

		Node[] nodes = new Node[n + 2];
		for (int i = 0; i <= n + 1; ++i) {
			nodes[i] = new Node(i);
		}
		for (int i = 1; i <= n; ++i) {
			nodes[i].prev = nodes[i - 1];
			nodes[i].next = nodes[i + 1];
		}
		nodes[0].next = nodes[1];
		nodes[n+1].prev = nodes[n];

		m = sc.nextInt();
		for (int i = 0; i < m; ++i) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();

			if (nodes[b].next == nodes[c]) {

				Node P = nodes[a].prev;
				Node N = nodes[d].next;

				nodes[a].prev = nodes[d];
				nodes[b].next = N;

				if (N != null)
					N.prev = nodes[b];

				nodes[c].prev = P;
				if (P != null)
					P.next = nodes[c];
				nodes[d].next = nodes[a];

			} else {
				Node P1 = nodes[a].prev;
				Node N1 = nodes[b].next;

				Node P2 = nodes[c].prev;
				Node N2 = nodes[d].next;

				nodes[a].prev = P2;
				nodes[b].next = N2;

				nodes[c].prev = P1;
				nodes[d].next = N1;

				if (P1 != null)
					P1.next = nodes[c];
				if (N1 != null)
					N1.prev = nodes[d];

				if (P2 != null)
					P2.next = nodes[a];
				if (N2 != null)
					N2.prev = nodes[b];
			}

		}

		Node cur = nodes[0].next;
		while (cur.next != null) {
			System.out.print(cur.v + " ");
			cur = cur.next;
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