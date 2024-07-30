import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int K, N;
	static int[][] A;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		K = sc.nextInt();
		N = sc.nextInt();
		
		A = new int[K][N];

		for (int i = 0; i < K; i++) {
			
			for(int j = 0; j < N; ++j) {
				A[i][j] = sc.nextInt();
			}
		}

		
		int ans = 0;
		for (int i = 1; i <= N; ++i) {
			
			for(int j = 1; j <= N; ++j) {
				if(i == j) continue;
			
				if(solution(i, j)) {
					++ans;
				}
				
			}
			
		}

		System.out.println(ans);
	}

	private static boolean solution(int a, int b) {

		int aPos = 0, bPos = 0;
		for(int i = 0; i < K; ++i) {
			for(int j = 0; j < N; ++j) {
				if(A[i][j] == a) aPos = j;
				else if(A[i][j] == b) bPos = j;
			}
			if (aPos < bPos) return false;
		}

		return true;
	}
}