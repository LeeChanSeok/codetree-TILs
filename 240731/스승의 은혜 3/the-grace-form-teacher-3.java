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
        	
			int[] a = new int[n];
			for(int j = 0; j < n; ++j) {
				a[j] = arr[j][0] + arr[j][1];
			}
			
        	a[i] = (arr[i][0]/2) + arr[i][1];
        	Arrays.sort(a);
        	
        	int cnt = 0;
        	int m = b;
        	for(int j = 0; j < n; ++j) {
        		m = m - a[j];
        		if(m < 0) break;
        		++cnt;
        	}
        	
        	ans = Math.max(ans, cnt);
        }
        
        System.out.println(ans);
    }
}