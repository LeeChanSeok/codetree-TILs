import java.util.Scanner;

public class Main {
	public static final int INT_MAX = Integer.MAX_VALUE;

	public static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		char[] A = new char[n];
		int[] B = new int[n];
		for (int i = 0; i < n; ++i) {
			A[i] = sc.next().charAt(0);
			B[i] = sc.nextInt();
		}

		int ans = 0;
		int rank = 0;
		int a = 0, b = 0;
		for (int i = 0; i < n; ++i) {

			if(A[i] == 'A')
				a += B[i];
			else
				b += B[i];
			
			if(a == b) {
				if(rank != 0) ++ans;
				rank = 0;
			} else if(a > b) {
				if(rank != 1) ++ans;
				rank = 1;
			}else {
				if(rank != 2) ++ans;
				rank = 2;
			}

		}

		System.out.print(ans);
	}
}