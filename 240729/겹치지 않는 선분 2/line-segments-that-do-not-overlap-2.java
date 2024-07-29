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
        for(int i = 1; i <= n - 1; ++i) {
        	
        	boolean isContect = false;
        	for(int j = i + 1; j <= n; ++j) {
        		
        		if((s[i] > s[j] && e[j] > s[i])||
        				(s[i] < s[j] && e[i] > e[j])){
        			isContect = true;
        			break;
        		}
        		
        	}
        	if(!isContect) ++ans;
        }
        
        System.out.println(ans);
    }
}