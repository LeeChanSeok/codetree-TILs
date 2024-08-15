import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	static int n, m, k, u, d, ans;
	static int[][] arr;
	static int[] select;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = n;
		k = sc.nextInt();
		u = sc.nextInt();
		d = sc.nextInt();

		arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		select = new int[k];
		recursive(0, 0);
		bfs();
		System.out.println(ans);
	}

	private static void recursive(int idx, int cnt) {

		if (cnt == k) {
			bfs();
			return;
		}

		for (int i = idx; i < n * n; ++i) {

			select[cnt] = i;
			recursive(i + 1, cnt + 1);

		}

	}

	private static void bfs() {

		Queue<int[]> q = new LinkedList<>();
		boolean[][] visited = new boolean[n][m];

		int cnt = 0;
		for (int i = 0; i < k; ++i) {
			int x = select[i] / n;
			int y = select[i] % n;

			q.offer(new int[] { x, y });
			visited[x][y] = true;
			++cnt;
		}

		while (!q.isEmpty()) {
			int[] cur = q.poll();

			int x = cur[0];
			int y = cur[1];

			int h = arr[x][y];

			for (int dir = 0; dir < 4; ++dir) {
				int nx = x + dx[dir];
				int ny = y + dy[dir];

				if (nx < 0 || nx >= n || ny < 0 || ny >= m)
					continue;
				if (visited[nx][ny])
					continue;

				int diff = Math.abs(h - arr[nx][ny]);
				if (u <= diff && diff <= d) {

					q.offer(new int[] { nx, ny });
					visited[nx][ny] = true;
					++cnt;
				}

			}
		}

		ans = Math.max(ans, cnt);
	}

}