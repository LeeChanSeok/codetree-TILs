import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();		
		int m = sc.nextInt();
		
		int[] A = new int[n];
		for (int i = 0; i < n; ++i) {
			A[i] = sc.nextInt();
		}
		
		int[] B = new int[m];
		for (int i = 0; i < m; ++i) {
			B[i] = sc.nextInt();
		}
		Arrays.sort(B);
		
		
        int ans = 0;
        int[] C = new int[m];
        for(int i = 0; i <= n - m; i++) {
        	for(int j = i; j < i + m; ++j) {
        		C[j-i] = A[j];
        	}
        	Arrays.sort(C);
        	
        	boolean isBeautiful = true;
        	for(int k = 0; k < m; ++k) {
        		if(C[k] != B[k]) {
        			isBeautiful = false;
        			break;
        		}
        	}
        	
        	if(isBeautiful) ++ans;
        	
        }
        
        System.out.println(ans);
	}
}