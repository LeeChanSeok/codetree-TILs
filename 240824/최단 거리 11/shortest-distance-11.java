import java.util.Scanner;

public class Main {
	public static final int MAX_N = 1000;

	// 변수 선언
	public static int n, m;
	public static int[][] graph = new int[MAX_N + 1][MAX_N + 1];
	public static boolean[] visited = new boolean[MAX_N + 1];

	public static int[] dist = new int[MAX_N + 1];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();

		while (m-- > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			graph[x][y] = z;
			graph[y][x] = z;
		}

		int A = sc.nextInt();
		int B = sc.nextInt();

		for (int i = 1; i <= n; i++)
			dist[i] = (int) 1e9;

		dist[B] = 0;

		for (int i = 1; i <= n; i++) {
			int minIndex = -1;
			for (int j = 1; j <= n; j++) {
				if (visited[j])
					continue;

				if (minIndex == -1 || dist[minIndex] > dist[j])
					minIndex = j;
			}

			visited[minIndex] = true;

			for (int j = 1; j <= n; j++) {
				if (graph[minIndex][j] == 0)
					continue;

				dist[j] = Math.min(dist[j], dist[minIndex] + graph[minIndex][j]);
			}
		}

		int x = A;
		System.out.println(dist[A]);
		while (x != B) {
			System.out.print(x + " ");
			for (int i = 1; i <= n; i++) {
				if (graph[i][x] == 0)
					continue;

				if (dist[i] + graph[i][x] == dist[x]) {
					x = i;
					break;
				}
			}
		}
		System.out.print(x + " ");
	}
}