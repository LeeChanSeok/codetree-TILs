import java.util.Scanner;

public class Main {
	
    public static int n, m;
    public static int[][] answer;

    public static int[] dx = {1, 0,  -1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static int x = 0, y = 0;
    public static int dirNum = 0;

    public static boolean inRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < m);
    }
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	n = sc.nextInt();
    	m = sc.nextInt();
    	
    	answer = new int[n][m];
        answer[x][y] = 1;
        
        for(int i = 2; i <= n*m; i++) {
            int nx = x + dx[dirNum], ny = y + dy[dirNum];

            if(!inRange(nx, ny) || answer[nx][ny] != 0)
                dirNum = (dirNum + 1) % 4;
 
            x = x + dx[dirNum]; y = y + dy[dirNum];
            answer[x][y] = i;
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++)
                System.out.print(answer[i][j] + " ");
            System.out.println();
        }
    }
}