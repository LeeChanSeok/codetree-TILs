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

		arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		visited = new boolean[n][n];
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (visited[i][j])
					continue;
				cnt = 0;
				num = arr[i][j];
				DFS(i, j);

				if (cnt >= 4) {
					++ans;
					max = Math.max(max, cnt);

				}
			}
		}
		System.out.println(ans + " " + max);
	}

	private static void DFS(int x, int y) {
		visited[x][y] = true;
		++cnt;

		for (int d = 0; d < 4; d++) {
			int nx = x + dx[d];
			int ny = y + dy[d];

			if (nx < 0 || nx >= n || ny < 0 || ny >= n)
				continue;
			if (visited[nx][ny] || arr[nx][ny] != num)
				continue;
			DFS(nx, ny);
		}

	}

}