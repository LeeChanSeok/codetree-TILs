import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static List<Integer>[] tree;
	static int[] visited;
	static int n, m, group, ans;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		tree = new List[n + 1];
		for (int i = 1; i <= n; ++i) {
			tree[i] = new LinkedList<>();
		}

		for (int i = 0; i < m; ++i) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			tree[x].add(y);
			tree[y].add(x);
		}

		visited = new int[n + 1];
		for (int i = 1; i <= n; ++i) {
			if (visited[i] == 0) {
				++group;
				if (traversal(i, 0))
					++ans;
			}
		}
		System.out.println(ans);
	}

	private static boolean traversal(int node, int prev) {

		for (int next : tree[node]) {
			if (next == prev)
				continue;
			if (visited[next] == group)
				return false;
			visited[next] = group;
			if (traversal(next, node))
				return true;
		}

		return true;

	}
}