import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int n;

	static int[] dx = { -1, -1, 1, 1 };
	static int[] dy = { 1, -1, -1, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				arr[i][j] = sc.nextInt();
			}
		}

		int ans = 0;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {

				Queue<int[]> q = new LinkedList<>();
				int nx = i + dx[0];
				int ny = j + dy[0];
				if (!inRange(nx, ny))
					continue;
				q.offer(new int[] { nx, ny, 0, 0 });

				while (!q.isEmpty()) {
					int[] cur = q.poll();
					int x = cur[0], y = cur[1];
					int sum = cur[2], dir = cur[3];
					sum += arr[x][y];
					if (x == i && y == j) {
						ans = Math.max(ans, sum);
						continue;
					}

					// 직진
					nx = x + dx[dir];
					ny = y + dy[dir];
					if (inRange(nx, ny)) {
						q.offer(new int[] { nx, ny, sum, dir });
					}

					// 회전
					if (dir != 3) {
						nx = x + dx[dir + 1];
						ny = y + dy[dir + 1];

						if (!inRange(nx, ny))
							continue;
						q.offer(new int[] { nx, ny, sum, dir + 1 });

					}

				}

			}
		}

		System.out.println(ans);

	}

	static public boolean inRange(int x, int y) {
		if (x < 0 || x >= n || y < 0 || y >= n)
			return false;
		return true;
	}

}