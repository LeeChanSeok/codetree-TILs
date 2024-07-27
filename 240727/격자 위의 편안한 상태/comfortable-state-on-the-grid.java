import java.util.*;

public class Main {

    public static int[] dx = new int[]{0, 1, -1,  0};
    public static int[] dy = new int[]{1, 0,  0, -1};
    
	static int n;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		int m = sc.nextInt();
		
		boolean[][] board = new boolean[n][n];
		
		for(int i = 0; i < m; ++i) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			
			board[x][y] = true;
			int cnt = 0;
			for(int d = 0; d < 4; ++d) {
				
				int nx = x + dx[d];
				int ny = y + dy[d];
				
				if(inRange(nx, ny) && board[nx][ny]) ++cnt; 
			}
			
			if(cnt == 3) System.out.println('1'); 
			else System.out.println('0'); 
		}
		

	}

	private static boolean inRange(int x, int y) {
		if(x >= 0 && x < n && y >= 0 && y < n) return true;
		return false;
	}

}