import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	int b = sc.nextInt();
    	int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++) {
        	arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
        }
        
        int ans = 0;
        for(int i = 0; i < n; ++i) {
        	
			int[][] a = new int[n][2];
			for(int j = 0; j < n; ++j) {
				a[j] = arr[j].clone();
			}
			
        	a[i][0] /= 2;
        	Arrays.sort(a, (a1, a2) -> (a1[0] + a1[1]) - (a2[0] + a2[1]));
        	
        	int cnt = 0;
        	int m = b;
        	for(int j = 0; j < n; ++j) {
        		m = m - (a[j][0] + a[j][1]);
        		if(m < 0) break;
        		++cnt;
        	}
        	
        	ans = Math.max(ans, cnt);
        }
        
        System.out.println(ans);
    }
}