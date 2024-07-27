import java.util.Scanner;

public class Main {
    public static final int DIR_NUM = 8;
    
    public static int n, m;
    public static char[][] arr;
    
    public static int[] dx = new int[]{1, 1, 1, -1, -1, -1, 0, 0};
    public static int[] dy = new int[]{-1, 0, 1, -1, 0, 1, -1, 1};
    
    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        
        arr = new char[n][m];
        // 입력
        for(int i = 0; i < n; i++)
        	arr[i] = sc.next().toCharArray();
        
        int ans = 0;
        // 모든 좌표에서 다 확인해봅니다.
        for(int i = 0; i < n; i++) {
            // 격자를 벗어나지 않을 범위로만 잡습니다.
            for(int j = 0; j < m; j++) {
                if(arr[i][j] != 'L') continue;
                
                for(int k = 0; k < DIR_NUM; k++) {
                	boolean isLEE = true;
                    
                    int curx = i;
                    int cury = j;
                    for(int l = 0; l < 2; ++l) {
                        int nx = curx + dx[k];
                        int ny = cury + dy[k];
                        if(inRange(nx, ny) == false) {
                        	isLEE = false;                        	
                        	break;
                        }
                        if(arr[nx][ny] != 'E') {
                        	isLEE = false;
                        	break;
                        }
                        curx = nx;
                        cury = ny;
                    }
                    if(isLEE) {
                        ++ans;
                    }
                }
            }
        }
        System.out.print(ans);
    }
}