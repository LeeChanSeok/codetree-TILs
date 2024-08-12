import java.util.Scanner;

public class Main {

	static int n, m, q;
	static int arr[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		q = sc.nextInt();

		arr = new int[n][m];

		for (int i = 0; i < n; ++i) {
			for(int j = 0; j < m; ++j) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		while (q-- > 0) {
			int r = sc.nextInt() - 1;
			int d = (sc.next().charAt(0) == 'L') ? 1 : 0;
			
			move(r, d);
			if(r != 0) recursive(0, r - 1, d^1);
			if(r != n - 1) recursive(1, r + 1, d^1);
		}
		
		for(int i = 0; i < n; ++i) {
			for(int j = 0; j < m; ++j) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void recursive(int ud, int r, int d) {

		if(r == -1 || r == n) return;
		
		if(ud == 0) {
			boolean isSame = false;
			for(int i = 0; i < m; ++i) {
				if(arr[r][i] == arr[r+1][i]) {
					isSame = true;
					break;
				}
			}
			
			if(isSame) {
				move(r, d);
				recursive(ud, r - 1, d ^ 1);
			}
		} else {
			boolean isSame = false;
			for(int i = 0; i < m; ++i) {
				if(arr[r][i] == arr[r-1][i]) {
					isSame = true;
					break;
				}
			}
			
			if(isSame) {
				move(r, d);
				recursive(ud, r + 1, d ^ 1);
			}
		}
		
	}

	private static void move(int r, int d) {

		if(d == 0) {
			int tmp = arr[r][0];
			for(int i = 0; i < m - 1; ++i) {
				arr[r][i] = arr[r][i + 1];
			}
			arr[r][m-1] = tmp;
		}
		else {
			int tmp = arr[r][m-1];
			for(int i = m - 1; i > 0; --i) {
				arr[r][i] = arr[r][i-1];
			}
			arr[r][0] = tmp;
		}
		
	}

}