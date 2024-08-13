import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static int[] dx = { 0, 0, -1, 1 };
	static int[] dy = { -1, 1, 0, 0 };

	static int n, m, r, c;
	static int[][] dice, arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		r = sc.nextInt() - 1;
		c = sc.nextInt() - 1;

		dice = new int[][] { { 0, 5, 0 }, { 4, 6, 3 }, { 0, 2, 0 }, { 0, 1, 0 }, };

		Map<Character, Integer> map = new HashMap<>();
		map.put('L', 0);
		map.put('R', 1);
		map.put('U', 2);
		map.put('D', 3);

		arr = new int[n][n];
		arr[r][c] = dice[1][1];

		while (m-- > 0) {
			char C = sc.next().charAt(0);
			int dir = map.get(C);

			int nr = r + dx[dir];
			int nc = c + dy[dir];

			if (!inRange(nr, nc))
				continue;
			move(dir);
			r = nr;
			c = nc;
			arr[r][c] = dice[1][1];
		}

		int ans = 0;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				ans += arr[i][j];
			}
		}
		System.out.println(ans);
	}

	private static void move(int dir) {

		if (dir == 0) {
			int tmp = dice[1][2];
			dice[1][2] = dice[1][1];
			dice[1][1] = dice[1][0];
			dice[1][0] = dice[3][1];
			dice[3][1] = tmp;
		} else if (dir == 1) {
			int tmp = dice[1][0];
			dice[1][0] = dice[1][1];
			dice[1][1] = dice[1][2];
			dice[1][2] = dice[3][1];
			dice[3][1] = tmp;
		} else if (dir == 2) {
			int tmp = dice[3][1];
			dice[3][1] = dice[2][1];
			dice[2][1] = dice[1][1];
			dice[1][1] = dice[0][1];
			dice[0][1] = tmp;
		} else if (dir == 3) {
			int tmp = dice[0][1];
			dice[0][1] = dice[1][1];
			dice[1][1] = dice[2][1];
			dice[2][1] = dice[3][1];
			dice[3][1] = tmp;
		}

	}

	private static boolean inRange(int x, int y) {
		if (x < 0 || x >= n || y < 0 || y >= n)
			return false;
		return true;
	}

}