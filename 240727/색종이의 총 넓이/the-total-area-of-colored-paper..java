import java.util.Scanner;

public class Main {    
    public static final int OFFSET = 100;
    public static final int MAX_N = 200;   
    
    public static int n;
    public static boolean[][] board = new boolean[MAX_N + 1][MAX_N + 1];   
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        n = sc.nextInt();
        
        // 현재 위치
        
        for(int k = 0; k < n; k++) {
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;
            
            for(int i = x1; i < x1 + 8; ++i){
                for(int j = y1; j < y1 + 8; ++j){
                    board[i][j] = true;
                }
            }

        }
        
        int area = 0;
        for(int i = 0; i <= MAX_N; i++){
            for(int j = 0; j <= MAX_N; j++){
                if(board[i][j]) ++area;
            }

        }
        
        System.out.print(area);
    }

}