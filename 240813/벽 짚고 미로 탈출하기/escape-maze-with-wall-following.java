import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { 1, 0, -1, 0 };

	static int n, x, y;
	static char[][] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		x = sc.nextInt() - 1;
		y = sc.nextInt() - 1;

		arr = new char[n][n];
		for (int i = 0; i < n; ++i) {
			arr[i] = sc.next().toCharArray();
		}
		int ans = simulation();
		System.out.println(ans);
	}

	private static int simulation() {

		boolean[][][] visited = new boolean[n][n][4];
		visited[x][y][0] = true;

		int move = 0;
		int dir = 0;
		while (true) {
			int nx = x + dx[dir];
			int ny = y + dy[dir];

			if (!inRange(nx, ny))
				return move + 1;
			if (visited[nx][ny][dir])
				return -1;
			if (arr[nx][ny] == '.') {
				x = nx;
				y = ny;
				dir = (dir + 1) % 4;
				++move;
				visited[nx][ny][dir] = true;
			}
			if (arr[nx][ny] == '#') {
				dir = (dir + 3) % 4;
				visited[nx][ny][dir] = true;
			}
		}

	}

	private static boolean inRange(int x, int y) {
		if (x < 0 || x >= n || y < 0 || y >= n)
			return false;
		return true;
	}

}