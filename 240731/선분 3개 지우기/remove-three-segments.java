import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int N;
	static int[][] A;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		A = new int[N][2];

		for (int i = 0; i < N; ++i) {
			A[i][0] = sc.nextInt();
			A[i][1] = sc.nextInt();
		}

		int ans = 0;
		for (int i = 0; i < N - 2; ++i) {
			for (int j = i + 1; j < N - 1; ++j) {
				for (int k = j + 1; k < N; ++k) {
					if (solution(i, j, k))
						++ans;
				}
			}
		}
		System.out.println(ans);
	}

	private static boolean solution(int a, int b, int c) {

		int[] line = new int[101];
		
		for(int i = 0; i < N; ++i) {
			if( i == a || i == b || i == c) continue;
			
			for(int j = A[i][0]; j <= A[i][1]; ++j) {
				++line[j];
			}
		}
		
		for(int i = 0; i <= 100; ++i) {
			if(line[i] >= 2) return false;
		}
		
		return true;
	}
}