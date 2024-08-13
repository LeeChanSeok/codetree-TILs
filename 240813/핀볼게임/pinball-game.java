import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static int[] dx = { 0, 0, -1, 1 };
	static int[] dy = { -1, 1, 0, 0 };

	static int MAX = 10000;
	static int n, ans;
	static int[][] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		arr = new int[n][n];

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				arr[i][j] = sc.nextInt();
			}
		}

		ans = 0;
		for (int i = 0; i < n; ++i) {
			ans = Math.max(ans, simulation(i, 0, 1));
			ans = Math.max(ans, simulation(i, n - 1, 0));
			ans = Math.max(ans, simulation(0, i, 3));
			ans = Math.max(ans, simulation(n - 1, i, 2));
		}
		System.out.println(ans);
	}

	private static int simulation(int r, int c, int dir) {
		int move = 1;
		while (inRange(r, c)) {

			if(arr[r][c] != 0) {
				dir = changeDir(dir, arr[r][c]);
			} 
			r += dx[dir];
			c += dy[dir];
			++move;
		}

		return move;

	}

	private static int changeDir(int dir, int w) {

		int nDir = 0;
		if(w == 1) {
			if(dir == 0) nDir = 3;
			else if(dir == 1) nDir = 2;
			else if(dir == 2) nDir = 1;
			else if(dir == 3) nDir = 0;
		} else {
			if(dir == 0) nDir = 2;
			else if(dir == 1) nDir = 3;
			else if(dir == 2) nDir = 0;
			else if(dir == 3) nDir = 1;
		}
		
		return nDir;
	}

	private static boolean inRange(int x, int y) {
		if (x < 0 || x >= n || y < 0 || y >= n)
			return false;
		return true;
	}

}