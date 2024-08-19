import java.util.Scanner;

public class Main {

	static class Node {
		String v;
		Node prev, next;

		public Node(String v) {
			super();
			this.v = v;
			this.prev = this.next = null;
		}

	}

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Node cur = new Node(sc.next());
		n = sc.nextInt();

		for (int i = 0; i < n; ++i) {
			int cmd = sc.nextInt();

			if (cmd == 1) {
				Node node = new Node(sc.next());
				insertPrev(cur, node);
			} else if (cmd == 2) {
				Node node = new Node(sc.next());
				insertNext(cur, node);
			} else if (cmd == 3) {
				if (cur.prev != null)
					cur = cur.prev;
			} else if (cmd == 4) {
				if (cur.next != null)
					cur = cur.next;
			}

			print(cur);
		}

	}

	private static void print(Node cur) {

		String str = "";
		if (cur.prev == null)
			str += "(Null)";
		else
			str += cur.prev.v;
		str += " ";

		str += cur.v;
		str += " ";

		if (cur.next == null)
			str += "(Null)";
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