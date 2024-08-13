import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static int[] dx = { 0, 0, -1, 1 };
	static int[] dy = { -1, 1, 0, 0 };

	static int MAX = 10000;
	static int n, m, k, ans;
	static int h, t;
	static int[][] arr;
	static int[][] pos;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		k = sc.nextInt();

		arr = new int[n][n];
		pos = new int[MAX][2];
		h = t = 0;
		pos[0][0] = pos[0][1] = 0;
		arr[0][0] = 1;

		Map<Character, Integer> map = new HashMap<>();
		map.put('L', 0);
		map.put('R', 1);
		map.put('U', 2);
		map.put('D', 3);

		for (int i = 0; i < m; ++i) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;

			arr[x][y] = 2;
		}

		ans = 0;
		for (int i = 0; i < k; ++i) {
			int d = map.get(sc.next().charAt(0));
			int p = sc.nextInt();
			if (!simulation(d, p))
				break;
		}

		System.out.println(ans);
	}

	private static boolean simulation(int d, int p) {

		for (int i = 0; i < p; ++i) {
			++ans;

			int hx = pos[h][0];
			int hy = pos[h][1];
			int tx = pos[t][0];
			int ty = pos[t][1];

			int nx = hx + dx[d];
			int ny = hy + dy[d];

			if (!inRange(nx, ny))
				return false;
			if (arr[nx][ny] == 2) {
				arr[nx][ny] = 1;

				++h;
				pos[h][0] = nx;
				pos[h][1] = ny;
			} else if (arr[nx][ny] == 0 || (nx == tx && ny == ty)) {

				arr[tx][ty] = 0;
				++t;

				++h;
				pos[h][0] = nx;
				pos[h][1] = ny;
				arr[nx][ny] = 1;
			} else {
				return false;
			}

		}

		return true;

	}

	private static boolean inRange(int x, int y) {
		if (x < 0 || x >= n || y < 0 || y >= n)
			return false;
		return true;
	}

}