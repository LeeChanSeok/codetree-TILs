import java.util.Scanner;

public class Main {
	
    public static int n, m;
    public static int[][] answer;

    public static int[] dx = {1, 0, -1,  0};
    public static int[] dy = {0, 1, 0, -1};    
    public static int dirNum = 0;        // 0: 오른쪽, 1: 아래쪽, 2: 왼쪽, 3: 위쪽

    public static boolean inRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < m);
    }
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	n = sc.nextInt();
    	
    	answer = new int[n][n];
    	int x = n/2;
    	int y = n/2;
        answer[x][y] = 1;
      
        
        for(int i = 2; i <= n*n; i++) {
        	
        	int nd = (dirNum + 1) % 4;
            int nx = x + dx[nd], ny = y + dy[nd];
            
            if(answer[nx][ny] == 0) {
            	dirNum = nd;
            }
            
            x = x + dx[dirNum];
            y = y + dy[dirNum];	
            answer[x][y] = i;
        }
        
        // 출력:
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++)
                System.out.print(answer[i][j] + " ");
            System.out.println();
        }
    }
}