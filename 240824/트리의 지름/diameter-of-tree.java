import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static class Edge {
		int u, d;

		public Edge(int u, int d) {
			super();
			this.u = u;
			this.d = d;
		}

	}

	static List<Edge>[] tree;
	static boolean[] visited;
	static int n, x, ans;

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
			int z = sc.nextInt();

			tree[x].add(new Edge(y, z));
			tree[y].add(new Edge(x, z));
		}

		visited = new boolean[n + 1];
		visited[1] = true;
		traversal(1);

		ans = 0;
		visited = new boolean[n + 1];
		visited[x] = true;
		dfs(x, 0);
		System.out.println(ans);
		
	}

	private static void dfs(int node, int dist) {

		ans = Math.max(ans, dist);

		for (Edge child : tree[node]) {
			if (visited[child.u])
				continue;
			visited[child.u] = true;
			dfs(child.u, dist + child.d);
		}

	}

	private static void traversal(int node) {

		boolean isLeaf = true;
		for (Edge child : tree[node]) {
			if (visited[child.u])
				continue;
			visited[child.u] = true;
			traversal(child.u);
			isLeaf = false;
		}

		if (isLeaf)
			x = node;

	}
}