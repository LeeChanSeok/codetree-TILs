import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int[] dx = { -1, -1, -1, 0, 1, 1, 1, 0 };
	static int[] dy = { -1, 0, 1, 1, 1, 0, -1, -1 };

	static int n, m;
	static int[][] arr;

	static int[][] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();

		arr = new int[n][n];
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				arr[i][j] = sc.nextInt();
			}
		}

		while (m-- > 0) {
			simulation();
		}

		print();
	}

	private static void simulation() {

		for (int i = 1; i <= n * n; ++i) {
			int[] cur = find(i);
			int[] next = findNext(cur);

			int tmp = arr[cur[0]][cur[1]];

			arr[cur[0]][cur[1]] = arr[next[0]][next[1]];
			arr[next[0]][next[1]] = tmp;

		}

	}

	private static void print() {
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();
		}

	}

	private static int[] findNext(int[] cur) {

		int x = cur[0];
		int y = cur[1];

		int max = 0;
		int[] pos = new int[2];
		for (int d = 0; d < 8; ++d) {
			int nx = x + dx[d];
			int ny = y + dy[d];

			if (!inRange(nx, ny))
				continue;

			if (arr[nx][ny] > max) {
				max = arr[nx][ny];
				pos[0] = nx;
				pos[1] = ny;
			}
		}

		return pos;
	}

	private static int[] find(int num) {

		int[] pos = new int[2];
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				if (arr[i][j] == num) {
					pos[0] = i;
					pos[1] = j;
					return pos;
				}
			}
		}
		return null;
	}

	private static boolean inRange(int x, int y) {
		if (x < 0 || x >= n || y < 0 || y >= n)
			return false;
		return true;
	}

}