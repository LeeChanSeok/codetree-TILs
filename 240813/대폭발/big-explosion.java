import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int[] dx = { 0, 0, -1, 1 };
	static int[] dy = { -1, 1, 0, 0 };

	static int n, m, r, c;
	static int[][] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		r = sc.nextInt() - 1;
		c = sc.nextInt() - 1;

		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] { r, c });

		boolean[][] visited = new boolean[n][n];
		visited[r][c] = true;

		for (int i = 1; i <= m; ++i) {
			int dist = (int) Math.pow(2, i - 1);

			int qSize = q.size();
			while (qSize-- > 0) {
				int[] cur = q.poll();
				q.offer(cur);

				int x = cur[0];
				int y = cur[1];

				for (int d = 0; d < 4; ++d) {
					int nx = x + dx[d] * dist;
					int ny = y + dy[d] * dist;

					if (!inRange(nx, ny))
						continue;
					if (visited[nx][ny])
						continue;

					q.offer(new int[] { nx, ny });
					visited[nx][ny] = true;
				}
			}
		}

		int ans = 0;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				if (visited[i][j])
					++ans;
			}
		}
		System.out.println(ans);
	}

	private static boolean inRange(int x, int y) {
		if (x < 0 || x >= n || y < 0 || y >= n)
			return false;
		return true;
	}

}