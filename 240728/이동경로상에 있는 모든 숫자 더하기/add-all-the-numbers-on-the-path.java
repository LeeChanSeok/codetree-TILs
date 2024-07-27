import java.util.*;

public class Main {

	static int[] dx = new int[]{-1, 0, 1, 0};
	static int[] dy = new int[]{0, 1, 0, -1};
	
	static int N, T;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		T = sc.nextInt();
		
		char[] cmd = sc.next().toCharArray();
		
		int[][] arr = new int[N][N];
		for(int i = 0; i < N; ++i) {
			for(int j = 0; j < N; ++j) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int x = N/2, y = N/2;
		int dir = 0;
		int sum = arr[x][y];
		for (char c : cmd) {	

			if(c == 'F') {
				int nx = x + dx[dir];
				int ny = y + dy[dir];
				
				if(inRange(nx, ny)) {
					x += dx[dir];
					y += dy[dir];					
					sum += arr[x][y];
				}
			}else if (c == 'L')
				dir = (dir - 1 + 4) % 4;
			else if (c == 'R')
				dir = (dir + 1) % 4;
		}
		
		System.out.println(sum);

	}

	private static boolean inRange(int x, int y) {

		if (x >= 0 && x < N && y >= 0 && y < N) return true;
		return false;
	}

}