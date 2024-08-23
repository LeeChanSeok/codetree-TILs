import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static List<Integer>[] tree;
	static boolean[] visited;
	static int n, m, ans;

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

		visited = new boolean[n + 1];
		for (int i = 1; i <= n; ++i) {
			if (!visited[i]) {
				traversal(i);
				++ans;
			}
		}
		System.out.println(ans);
	}

	private static void traversal(int node) {

		for (int next : tree[node]) {
			if (visited[next])
				continue;
			visited[next] = true;
			traversal(next);
		}

	}
}