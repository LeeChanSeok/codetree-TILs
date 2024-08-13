import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int[] dx = { -1, 1, 0, 0, 0 };
	static int[] dy = { 0, 0, -1, 1, 0 };

	static int n, m, t, ans;
	static int[][] arr;

	static Queue<int[]> q;
	static int[][] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		t = sc.nextInt();

		arr = new int[n][n];
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				arr[i][j] = sc.nextInt();
			}
		}

		q = new LinkedList<>();
		for (int i = 0; i < m; ++i) {
			int r = sc.nextInt() - 1;
			int c = sc.nextInt() - 1;

			q.offer(new int[] { r, c });
		}

		while (t-- > 0) {
			simulation();
		}

		System.out.println(q.size());
	}

	private static void simulation() {

		int qSize = q.size();
		visited = new int[n][n];

		while (qSize-- > 0) {
			int[] cur = q.poll();
			int x = cur[0];
			int y = cur[1];

			int dir = getDir(x, y);
			int nx = x + dx[dir];
			int ny = y + dy[dir];

			q.offer(new int[] { nx, ny });
			++visited[nx][ny];
		}

		qSize = q.size();
		while (qSize-- > 0) {
			int[] cur = q.poll();
			int x = cur[0];
			int y = cur[1];

			if (visited[x][y] <= 1)
				q.offer(new int[] { x, y });
		}

	}

	private static int getDir(int x, int y) {

		int num = 0;
		int dir = 4;
		for (int d = 0; d < 4; ++d) {
			int nx = x + dx[d];
			int ny = y + dy[d];

			if (!inRange(nx, ny))
				continue;
			if (arr[nx][ny] > num) {
				num = arr[nx][ny];
				dir = d;
			}
		}
		return dir;
	}

	private static boolean inRange(int x, int y) {
		if (x < 0 || x >= n || y < 0 || y >= n)
			return false;
		return true;
	}

}