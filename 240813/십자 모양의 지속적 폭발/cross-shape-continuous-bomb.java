import java.util.Scanner;

public class Main {

	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	static int n, m, r, c, num;
	static int[][] arr;

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
		
		for(int k = 0; k < m; ++k) {
			c = sc.nextInt() - 1;
			
			r = -1;
			for(int j = 0; j < n; ++j) {
				if(arr[j][c] != 0) {
					r = j;
					break;
				}
			}
			
			if(r == -1) continue;
			
			num = arr[r][c];
			arr[r][c] = 0;
			
			for (int d = 0; d < 4; ++d) {
				int x = r;
				int y = c;
				for (int i = 1; i < num; ++i) {
					x += dx[d];
					y += dy[d];
					if (x < 0 || x >= n || y < 0 || y >= n)
						break;
					
					arr[x][y] = 0;
				}
			}
			
			down();
			
		}

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void down() {

		for (int j = Math.max(0, c - num + 1); j <= Math.min(n - 1, c + num - 1); ++j) {
			if (j == c)
				continue;
			for (int i = r; i > 0; --i) {
				arr[i][j] = arr[i - 1][j];
			}
			arr[0][j] = 0;
		}

		for (int i = Math.min(n - 1, r + num - 1), j = r - num; j >= 0; --j, --i) {
			arr[i][c] = arr[j][c];
			arr[j][c] = 0;
		}

	}

}