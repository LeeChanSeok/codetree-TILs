import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    	
    	int MAX_R = 1000;
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	int[] s = new int[n+1];
    	int[] e = new int[n+1];
        for(int i = 1; i <= n; i++) {
        	s[i] = sc.nextInt();
        	e[i] = sc.nextInt();
        }
        
        int ans = 0;
        boolean[] isWorking;
        for(int i = 1; i <= n; ++i) {
        	isWorking = new boolean[MAX_R + 1];
        	for(int j = 1; j <= n; ++j) {
        		if(i == j) continue;
        		
        		for(int k = s[j]; k < e[j]; ++k) {
        			isWorking[k] = true;
        		}
        	}
        	int maxVal = 0;
        	for(int k = 1; k <= MAX_R; ++k) {
        		if(isWorking[k]) ++maxVal;
        	}
        	ans = Math.max(ans, maxVal);
        }
            
        
        System.out.println(ans);
    }
}