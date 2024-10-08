import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge implements Comparable<Edge> {
	int u, d;

	public Edge(int u, int d) {
		super();
		this.u = u;
		this.d = d;
	}

	@Override
	public int compareTo(Edge o) {
		return this.d - o.d;
	}

};

public class Main {

	public static List<Edge>[] graph;
	public static int[] dist;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		graph = new List[n + 1];
		for (int i = 1; i <= n; ++i) {
			graph[i] = new LinkedList<>();
		}

		for (int i = 1; i <= m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();

			graph[y].add(new Edge(x, z));
		}

		dist = new int[n + 1];
		for (int i = 1; i <= n; i++)
			dist[i] = (int) 1e9;
		dist[n] = 0;

		PriorityQueue<Edge> pq = new PriorityQueue<>();
		pq.offer(new Edge(n, 0));

		while (!pq.isEmpty()) {

			Edge cur = pq.poll();
			if (dist[cur.u] != cur.d)
				continue;

			for (Edge next : graph[cur.u]) {

				int nd = dist[cur.u] + next.d;
				if (nd < dist[next.u]) {
					dist[next.u] = nd;
					pq.offer(new Edge(next.u, dist[next.u]));
				}

			}
		}

		int max = 0;
		for (int i = 1; i <= n; i++) {
			max = Math.max(max, dist[i]);
		}
		System.out.println(max);
	}
}