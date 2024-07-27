import java.util.*;

public class Main {

	public static int[] dx = new int[] { 1, 0, -1, 0 };
	public static int[] dy = new int[] { 0, -1, 0, 1 };

	static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		char[][] board = new char[n][n];
		for (int i = 0; i < n; ++i) {
			board[i] = sc.next().toCharArray();
		}

		int m = sc.nextInt() - 1;

		int x = 0, y = 0;
		int dir = m / n;

		if (dir == 0) {
			x = 0;
			y = m % n;
		} else if (dir == 1) {
			x = m % n;
			y = n - 1;
		} else if (dir == 2) {
			x = n - 1;
			y = n - 1 - m % n;
		} else if (dir == 3) {
			x = n - 1 - m % n;
			y = 0;
		}

		int cnt = 0;
		while(inRange(x, y)) {
			++cnt;
			
			if(board[x][y] == '\\') {
				if(dir == 0) dir = 3;
				else if(dir == 1) dir = 2;
				else if(dir == 2) dir = 1;
				else if(dir == 3) dir = 0;
			} else if(board[x][y] == '/') {
				if(dir == 0) dir = 1;
				else if(dir == 1) dir = 0;
				else if(dir == 2) dir = 3;
				else if(dir == 3) dir = 2;
			}
			
			x += dx[dir];
			y += dy[dir];
		}
		
		System.out.println(cnt);

	}

	private static boolean inRange(int x, int y) {
		if (x >= 0 && x < n && y >= 0 && y < n)
			return true;
		return false;
	}

}