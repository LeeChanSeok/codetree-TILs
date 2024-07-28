import java.util.Arrays;
import java.util.Scanner;

public class Main {
	

	
	static int N;
	static int[][] A;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		A = new int[N][3];
		
		for (int i = 0; i < N; ++i) {
			for(int j = 0; j < 3; ++j) {
				A[i][j] = sc.nextInt();
			}
		}

		int ans = 0;
        for(int i = 1; i <= 9; i++) {
        	for(int j = 1; j <= 9; j++) {
        		if(i == j) continue;
        		for(int k = 1; k <= 9; k++) {
        			if(j == k) continue;
        			if(isCheck(i, j, k)) {
        				++ans;
        			}
        		}
        		
        	}
        }
        
        
		System.out.println(ans);
	}

	private static boolean isCheck(int i, int j, int k) {
		for(int l = 0; l < N; ++l) {
			int a1 = A[l][0] / 100;
			int a2 = A[l][0] / 10 % 10;
			int a3 = A[l][0] % 10;
			int s = A[l][1];
			int b = A[l][2];
			
			int ss = 0;
			int bb = 0;
			
			if(a1 == i) ++ss;
			else if(a1 == j || a1 == k) ++bb;
			
			if(a2 == j) ++ss;
			else if(a2 == i || a2 == k) ++bb;
			
			if(a3 == k) ++ss;
			else if(a3 == i || a3 == j) ++bb;
			
			if(s != ss || b != bb ) return false;
			
		}
		
		return true;
		
	}

	
}