import java.util.Scanner;

public class Main {    
    public static final int OFFSET = 1000;
    public static final int MAX_N = 2000;   
    
    public static int n;
    public static int[][] board = new int[MAX_N + 1][MAX_N + 1];   
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        for(int k = 1; k <= 2; k++) {
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;

            for(int i = x1; i <= x2; ++i){
                for(int j = y1; j <= y2; ++j){
                    board[i][j] = k;
                }
            }

        }
        
        int area = 0;

        int maxX = 0, maxY = 0;
        int minX = MAX_N, minY = MAX_N;
        for(int i = 0; i <= MAX_N; i++){
            for(int j = 0; j <= MAX_N; j++){
                if(board[i][j] == 1) {
                    minX = Math.min(minX, i);
                    maxX = Math.max(maxX, i);
                    minY = Math.min(minY, j);
                    maxY = Math.max(maxY, j);                   
                }
            }

        }

        if(maxX < minX || maxY < minY) System.out.println(0);     
        else System.out.print((maxY - minY) * (maxX - minX));
    }

}