import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    	
    	int MAX_R = 1000;
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	int b = sc.nextInt();
    	int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
        	arr[i] = sc.nextInt();
        }
        
        int ans = 0;
        for(int i = 0; i < n; ++i) {
        	
        	int[] a = arr.clone();
        	a[i] /= 2;
        	Arrays.sort(a);
        	
        	int cnt = 0;
        	int m = b;
        	for(int j = 0; j < n; ++j) {
        		m -= a[j];
        		if(m < 0) break;
        		++cnt;
        	}
        	
        	ans = Math.max(ans, cnt);
        }
        
        System.out.println(ans);
    }
}