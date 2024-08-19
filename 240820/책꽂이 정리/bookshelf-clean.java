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

		@Override
		public String toString() {
			String str = "";
			if (this.prev == null)
				str += "(null)";
			else
				str += this.prev.v;
			str += ", ";

			str += this.v;
			str += ", ";

			if (this.next == null)
				str += "(null)";
			else
				str += this.next.v;
			str += " ";

			return str;
		}

	}

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		k = sc.nextInt();

		Node[] head = new Node[m + 1];
		Node[] tail = new Node[m + 1];

		for (int i = 1; i <= m; ++i) {
			head[i] = new Node(-1);
			tail[i] = new Node(-1);

			head[i].next = tail[i];
			tail[i].prev = head[i];

		}

		for (int i = 1; i <= n; ++i) {
			insertTail(tail[1], new Node(i));
		}

		for (int i = 0; i < k; ++i) {
			int cmd = sc.nextInt();

			if (cmd == 1) {
				int x = sc.nextInt();
				int y = sc.nextInt();

				if (head[x].next.v == -1)
					continue;
				Node node = popHead(head[x]);
				insertTail(tail[y], node);

			} else if (cmd == 2) {
				int x = sc.nextInt();
				int y = sc.nextInt();

				if (head[x].next.v == -1)
					continue;
				Node node = popTail(tail[x]);
				insertHead(head[y], node);

			} else if (cmd == 3) {
				int x = sc.nextInt();
				int y = sc.nextInt();

				if (head[x].next.v == -1)
					continue;
				Node h = head[x].next;
				Node t = tail[x].prev;
				head[x].next = tail[x];
				tail[x].prev = head[x];
				insertHead(head[y], h, t);

			} else if (cmd == 4) {
				int x = sc.nextInt();
				int y = sc.nextInt();

				if (head[x].next.v == -1)
					continue;
				Node h = head[x].next;
				Node t = tail[x].prev;
				head[x].next = tail[x];
				tail[x].prev = head[x];
				insertTail(tail[y], h, t);
			}
		}

		for (int i = 1; i <= m; ++i) {
			String str = "";
			int cnt = 0;

			Node cur = head[i].next;
			while (cur.v != -1) {
				++cnt;
				str += cur.v + " ";
				cur = cur.next;
			}
			str = cnt + " " + str;
			System.out.println(str);
		}

	}

	private static void insertTail(Node tail, Node h, Node t) {
		tail.prev.next = h;
		h.prev = tail.prev;
		t.next = tail;
		tail.prev = t;
	}

	private static void insertHead(Node head, Node h, Node t) {
		head.next.prev = t;
		t.next = head.next;
		h.prev = head;
		head.next = h;

	}

	private static Node popTail(Node tail) {
		Node node = tail.prev;

		tail.prev.prev.next = tail;
		tail.prev = tail.prev.prev;

		node.next = node.prev = null;
		return node;
	}

	private static Node popHead(Node head) {

		Node node = head.next;

		head.next.next.prev = head;
		head.next = head.next.next;

		node.next = node.prev = null;
		return node;
	}

	private static void insertHead(Node head, Node node) {

		head.next.prev = node;
		node.next = head.next;
		node.prev = head;
		head.next = node;

	}

	private static void insertTail(Node tail, Node node) {

		tail.prev.next = node;
		node.prev = tail.prev;
		node.next = tail;
		tail.prev = node;
	}

}