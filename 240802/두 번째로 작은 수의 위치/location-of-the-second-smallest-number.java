import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	static class Data implements Comparable<Data>{
		int n, p;

		public Data(int n, int p) {
			super();
			this.n = n;
			this.p = p;
		}

		@Override
		public int compareTo(Data o) {
			// TODO Auto-generated method stub
			return this.n - o.n;
		}
		
		
	}

	public static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		int[] A = new int[n];
		int[] B = new int[n];
		for (int i = 0; i < n; ++i) {
			A[i] = B[i] = sc.nextInt();
		}

		Arrays.sort(A);
		int num = A[0];
		for (int i = 1; i < n; ++i) {
			if(A[i] != num) {
				num = A[i];
				break;
			}
		}

		int ans = -1;
		int cnt = 0;
		if(num != A[0]) {
			for (int i = 1; i < n; ++i) {
				if(B[i] == num) {
					ans = i + 1;
					++cnt;
				}
			}
		}
		if(cnt > 1) ans = -1;
		
		System.out.print(ans);
	}
}