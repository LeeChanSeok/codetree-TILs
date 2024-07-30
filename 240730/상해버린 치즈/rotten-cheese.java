import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int D = sc.nextInt();
		int S = sc.nextInt();

		int[][] A = new int[D][3];

		for (int i = 0; i < D; i++) {
			int p = sc.nextInt();
			int m = sc.nextInt();
			int t = sc.nextInt();

			A[i][0] = p;
			A[i][1] = m;
			A[i][2] = t;
		}

		Arrays.sort(A, (a1, a2) -> a1[2] - a2[2]);

		int[] B = new int[N+1];
		for (int i = 0; i < S; i++) {
			int p = sc.nextInt();
			int t = sc.nextInt();

			B[p] = t;
		}

		int ans = 0;
		for (int i = 1; i <= M; ++i) {

			int cnt = 0;
			boolean[] isSick = new boolean[N+1];
			boolean[] isEat = new boolean[N+1];
			boolean isPro = true;
			for (int j = 1; j <= N; ++j) {
				
				int t = B[j];				
				
				for (int k = 0; k < D; ++k) {
					if(A[k][1] == i) isEat[j] = true;
					if(A[k][0] == j && A[k][1] == i && A[k][2] < t) {
						isSick[j] = true;
					}
				}
				
				if(isEat[j]) {
					++cnt;
				}else if(!isEat[j] && isSick[j]){
					isPro = false;
					break;
				}
			}
			ans = Math.max(ans, cnt);
		}

		System.out.println(ans);
	}
}