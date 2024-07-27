import java.util.Scanner;

public class Main {
    public static final int MAX_N = 20;

    public static int n;
    public static int[][] arr = new int[MAX_N][MAX_N];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력
        n = sc.nextInt();
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();

        // 모든 쌍을 다 잡아봅니다.
        int maxCnt = 0;
  
        for(int i = 0; i < n; i++) {
        	for(int j = 0; j < n - 2; j++) {
    			for(int l = j + 3; l < n - 2; l++) {
    				maxCnt = Math.max(maxCnt, arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i][l] + arr[i][l + 1]+ arr[i][l + 2]);
    			}
        		for(int k = i + 1; k < n; k++) {        			
        			for(int l = 0; l < n - 2; l++) {
        				maxCnt = Math.max(maxCnt, arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[k][l] + arr[k][l + 1]+ arr[k][l + 2]);
        			}
        		}      		
        	}
        }
        
        System.out.println(maxCnt);
    }
}