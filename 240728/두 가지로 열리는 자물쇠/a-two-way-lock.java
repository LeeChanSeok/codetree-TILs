import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static int N;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		int[] A = new int[3];
		int[] B = new int[3];
		
		for (int i = 0; i < 3; ++i) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < 3; ++i) {
			B[i] = sc.nextInt();
		}

		int ans = 0;
        for(int i = 1; i <= N; i++) {
        	for(int j = 1; j <= N; j++) {
        		for(int k = 1; k <= N; k++) {
        			if(in2Dist(A, i, j ,k) || in2Dist(B, i, j ,k))
        				++ans;
        		}
        		
        	}
        }
        
        
		System.out.println(ans);
	}

	private static boolean in2Dist(int[] A, int i, int j, int k) {

		int dist_a = Math.min(Math.abs(A[0] - i + N) % N, Math.abs(i - A[0] + N) % N);
		int dist_b = Math.min(Math.abs(A[1] - j + N) % N, Math.abs(j - A[1] + N) % N);
		int dist_c = Math.min(Math.abs(A[2] - k + N) % N, Math.abs(k - A[2] + N) % N);
		
		return (dist_a <= 2 && dist_b <= 2 && dist_c <= 2);
	}
}