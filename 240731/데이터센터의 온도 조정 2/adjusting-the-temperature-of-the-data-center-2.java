import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int N = sc.nextInt();
    	int C = sc.nextInt();
    	int G = sc.nextInt();
    	int H = sc.nextInt();
        
        int[][] A = new int[N][2];
        int minTa = Integer.MAX_VALUE, maxTb = 0;
        for(int i = 0; i < N; ++i) {
        	A[i][0] = sc.nextInt();
        	A[i][1] = sc.nextInt();
        	minTa = Math.min(minTa, A[i][0]);
        	maxTb = Math.max(maxTb, A[i][1]);
        }
        
        int ans = 0;
        for(int i = minTa - 1; i <= maxTb + 1; ++i) {
        	
        	int sum = 0;
			for(int j = 0; j < N; ++j) {
				int ta = A[j][0];
				int tb = A[j][1];
				
				if(i < ta) sum += C;
				else if( i > tb) sum += H;
				else sum += G;
			}
        	ans = Math.max(ans, sum);
        }
        
        System.out.println(ans);
    }
}