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

	public static int[][] graph;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		graph = new int[n + 1][n + 1];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				graph[i][j] = sc.nextInt();
			}
			graph[i][i] = 1;
		}

		for (int k = 1; k <= n; k++)
			for (int i = 1; i <= n; i++)
				for (int j = 1; j <= n; j++) {
					if (graph[i][k] == 1 && graph[k][j] == 1)
						graph[i][j] = 1;
				}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(graph[i][j] + " ");
			}
			System.out.println();
		}
	}
}