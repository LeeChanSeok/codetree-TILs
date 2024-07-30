import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    	
    	int MAX_N = 1000;
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
        
    	int[] arr = new int[n];
    	for(int i = 0; i < n; ++i) {
    		arr[i] = sc.nextInt();
    	}
        
    	int ans = 0;
    	for(int k = -100; k <= 100; ++k) {
    		int cnt = 0;
    		for(int i = 0; i < n -1; ++i) {
    			for(int j = i + 1; j < n; ++j) {
        			if(arr[j] - k == k - arr[i]) ++cnt;
    			}	
    			ans = Math.max(ans,  cnt);
			}
        }
        
        System.out.println(ans);
    }
}