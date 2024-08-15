import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	static int n, m, ans, cnt, num;
	static int[][] arr;
	static boolean[][] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		visited = new boolean[n][m];
		bfs();
		System.out.println(ans);
	}

	private static void bfs() {
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] { 0, 0 });

		while (!q.isEmpty()) {
			int[] cur = q.poll();

			int x = cur[0];
			int y = cur[1];

			if (x == n - 1 && y == m - 1) {
				ans = 1;
				return;
			}

			for (int d = 0; d < 4; ++d) {
				int nx = x + dx[d];
				int ny = y + dy[d];

				if (nx < 0 || nx >= n || ny < 0 || ny >= m)
					continue;
				if (visited[nx][ny] || arr[nx][ny] == 0)
					continue;

				q.offer(new int[] { nx, ny });
				visited[nx][ny] = true;
			}
		}
	}

}