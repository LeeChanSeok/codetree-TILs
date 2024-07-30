import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int X = sc.nextInt();
    	int Y = sc.nextInt();
        
        int ans = 0;
        for(int i = X; i <= Y; ++i) {
        	
        	int len = 0;
			int j = i;
			int[] A = new int[10];
						
			while(j != 0) {
				int digit = j % 10;
				++A[digit];
				++len;
				j /= 10;
			}
			
			int cnt = 0;
			boolean isNum = true;
			for(int k = 0; k < 10; ++k) {
				if(A[k] != 0) {
					++cnt;
					if(A[k] == 0 || A[k] == 1 || A[k] == len - 1) continue;
					isNum = false;
				}
			}
			
			if(cnt != 2) isNum = false;
			if(isNum) ++ans;
        }
        
        System.out.println(ans);
    }
}