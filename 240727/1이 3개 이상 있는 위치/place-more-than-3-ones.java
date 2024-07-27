import java.util.*;

public class Main {

	static int[] dx = new int[]{0, 1, 0, -1};
	static int[] dy = new int[]{1, 0, -1, 0};
	
	static int n;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		int[][] arr = new int[n][n];
		
		for(int i = 0; i < n; ++i) {
			for(int j = 0; j < n; ++j) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		
		int ans = 0;
		for(int i = 0; i < n; ++i) {
			for(int j = 0; j < n; ++j) {
				int cnt = 0;
				for(int d = 0; d < 4; ++d) {
					int nx = i + dx[d];
					int ny = j + dy[d];
					
					if(inRange(nx, ny) && arr[nx][ny] == 1) ++cnt;
				}
				if(cnt >= 3) ++ans;
			}
		}
		
		System.out.println(ans);

	}

	private static boolean inRange(int x, int y) {
		if(x >= 0 && x < n && y >= 0 && y < n) return true;
		return false;
	}

}