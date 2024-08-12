import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	static int n, r, c;
	static int[][] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		r = sc.nextInt() - 1;
		c = sc.nextInt() - 1;

		arr = new int[n][n];
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				arr[i][j] = sc.nextInt();
			}
		}
		simulation();

	}

	private static void simulation() {

		int x = r, y = c;
		boolean isMove = true;
		while (isMove) {
			System.out.print(arr[x][y] + " ");
			isMove = false;
			for (int d = 0; d < 4; ++d) {
				int nx = x + dx[d];
				int ny = y + dy[d];

				if (nx < 0 || nx >= n || ny < 0 || ny >= n)
					continue;
				if (arr[nx][ny] > arr[x][y]) {
					x = nx;
					y = ny;
					isMove = true;
					break;
				}
			}
		}

	}

}