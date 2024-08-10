import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int n, m, k;
	
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				arr[i][j] = sc.nextInt();
			}
		}
		k = 2 * n;

		int ans = 0;
		for(int i = 0; i < n; ++i) {
			for(int j = 0; j < n; ++j) {
				
				Queue<int[]> q = new LinkedList<>();
				q.offer(new int[] {i, j});
				
				boolean[][] visited = new boolean[n][n];
				visited[i][j] = true;
				
				int k = 0;
				int gold = 0;
				while(!q.isEmpty()) {
					int qSize = q.size();
									
					while(qSize-- > 0) {
						int[] cur = q.poll();
						int x = cur[0], y = cur[1];
						
						if(arr[x][y] == 1) ++gold;
						
						for(int d = 0; d < 4; ++d) {
							int nx = x + dx[d];
							int ny = y + dy[d];
							
							if(nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
							if(visited[nx][ny]) continue;
							
							visited[nx][ny] = true;
							q.offer(new int[] {nx, ny});
						}
					}
					
					int cost = k * k + (k + 1) * (k + 1);
					if(gold * m > cost) {
						ans = Math.max(ans, gold);
					}
					++k;
				}
				
			}
		}
		
		
		System.out.println(ans);

	}

}