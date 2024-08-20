import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static int MAX = 100000;

	static class Node {
		String name;
		Node prev, next;

		public Node(String name) {
			super();
			this.name = name;
			this.prev = this.next = null;
		}

		@Override
		public String toString() {
			String str = "";
			if (this.prev == null)
				str += "(null)";
			else
				str += this.prev.name;
			str += ", ";

			str += this.name;
			str += ", ";

			if (this.next == null)
				str += "(null)";
			else
				str += this.next.name;
			str += " ";

			return str;
		}

	}

	static int n, m, k;
	static Map<String, Integer> strToIdx;
	static Node[] nodes, head, tail;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		k = sc.nextInt();

		strToIdx = new HashMap<>();

		nodes = new Node[n];
		head = new Node[m];
		tail = new Node[m];

		for (int i = 0; i < n; ++i) {
			String name = sc.next();
			strToIdx.put(name, i);
			nodes[i] = new Node(name);
		}

		for (int i = 0; i < m; ++i) {
			head[i] = tail[i] = null;
		}

		for (int i = 0; i < n; ++i) {
			int line = i / (n / m);
			push_back(line, i);
		}

		for (int i = 0; i < k; ++i) {
			int cmd = sc.nextInt();

			if (cmd == 1) {
				String a = sc.next();
				String b = sc.next();

				Node A = nodes[strToIdx.get(a)];
				Node B = nodes[strToIdx.get(b)];

				changeHT(A);

				insertPrev(B, A);

				int h = isHead(B);
				if (h != -1)
					head[h] = A;

			} else if (cmd == 2) {
				String a = sc.next();
				Node A = nodes[strToIdx.get(a)];
				changeHT(A);
				disconnext(A);

			} else if (cmd == 3) {
				String a = sc.next();
				String b = sc.next();
				String c = sc.next();

				Node A = nodes[strToIdx.get(a)];
				Node B = nodes[strToIdx.get(b)];
				Node C = nodes[strToIdx.get(c)];

				changeHT(A, B);
				insertPrev(C, A, B);
				int h = isHead(B);
				if (h != -1)
					head[h] = A;
			}

		}

		for (int i = 0; i < m; ++i) {
			StringBuilder sb = new StringBuilder();
			Node cur = head[i];
			if (cur == null)
				sb.append("-1");
			else {
				while (cur != null) {
					sb.append(cur.name + " ");
					cur = cur.next;
				}
			}
			sb.append('\n');
			System.out.println(sb);
		}

	}

	private static void changeHT(Node A, Node B) {
		int h = isHead(A);
		int t = isTail(B);

		if (h != -1 && t != -1)
			head[h] = tail[t] = null;
		else if (h != -1) {
			head[h] = B.next;
			head[h].prev = null;
		} else if (t != -1) {
			tail[t] = A.prev;
			tail[t].next = null;
		}

	}

	private static void changeHT(Node node) {
		int h = isHead(node);
		int t = isTail(node);
		if (h != -1 && t != -1)
			head[h] = tail[t] = null;
		else if (h != -1) {
			head[h] = head[h].next;
			head[h].prev = null;
		} else if (t != -1) {
			tail[t] = tail[t].prev;
			tail[t].next = null;
		}

	}

	private static int isHead(Node node) {

		int h = -1;
		for (int i = 0; i < m; ++i) {
			if (head[i] == node) {
				h = i;
			}

		}
		return h;

	}

	private static int isTail(Node node) {

		int t = -1;
		for (int i = 0; i < m; ++i) {
			if (tail[i] == node) {
				t = i;
			}

		}
		return t;

	}

	private static void push_back(int line, int i) {

		Node node = nodes[i];

		if (tail[line] == null) {
			head[line] = tail[line] = node;
		} else {
			tail[line].next = node;
			node.prev = tail[line];
			tail[line] = node;
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

	private static void insertPrev(Node cur, Node a, Node b) {

		a.prev = cur.prev;
		b.next = cur;

		if (a.prev != null) {
			a.prev.next = a;
		}

		if (b.next != null) {
			b.next.prev = b;
		}

	}
}