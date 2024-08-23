import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static List<Integer>[] tree;
	static int n;
	static int[] p;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		tree = new List[n + 1];

		for (int i = 1; i <= n; ++i) {
			tree[i] = new LinkedList<>();
		}

		for (int i = 0; i < n - 1; ++i) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			tree[x].add(y);
			tree[y].add(x);
		}

		p = new int[n + 1];
		traversal(1);

		for (int i = 2; i <= n; ++i) {
			System.out.println(p[i]);
		}

	}

	private static void traversal(int node) {

		for (int child : tree[node]) {
			if (p[child] != 0)
				continue;
			p[child] = node;
			traversal(child);
		}

	}
}