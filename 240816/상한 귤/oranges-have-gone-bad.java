import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	static int n, m, k;
	static int[][] arr, ans;
	static Queue<int[]> q;
	static boolean[][] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = n;
		k = sc.nextInt();

		arr = new int[n][m];
		ans = new int[n][m];

		q = new LinkedList<>();
		visited = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			Arrays.fill(ans[i], -2);
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int num = sc.nextInt();
				arr[i][j] = num;
				if (num == 2) {
					q.offer(new int[] { i, j });
					visited[i][j] = true;
					ans[i][j] = 0;
				} else if (num == 0) {
					ans[i][j] = -1;
				}
			}
		}

		bfs();
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[i].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void bfs() {

		while (!q.isEmpty()) {
			int qSize = q.size();

			while (qSize-- > 0) {

				int[] cur = q.poll();

				int x = cur[0];
				int y = cur[1];

				for (int dir = 0; dir < 4; ++dir) {
					int nx = x + dx[dir];
					int ny = y + dy[dir];

					if (nx < 0 || nx >= n || ny < 0 || ny >= m)
						continue;
					if (visited[nx][ny] || arr[nx][ny] != 1)
						continue;

					q.offer(new int[] { nx, ny });
					visited[nx][ny] = true;
					ans[nx][ny] = ans[x][y] + 1;
				}

			}
		}

	}

}