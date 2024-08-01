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
		int a = 0, b = 0, c = 0;
		for (int i = 0; i < n; ++i) {

			if(A[i] == 'A')
				a += B[i];
			else if(A[i] == 'B')
				b += B[i];
			else 
				c += B[i];
				
			if(a == b && b == c) {
				if(rank != 0) ++ans;
				rank = 0;
			} if(a == b) {
				if(rank != 1) ++ans;
				rank = 1;
			} if(a == c) {
				if(rank != 2) ++ans;
				rank = 2;
			} if(b == c) {
				if(rank != 3) ++ans;
				rank = 3;
			} if(a > b && a > c) {
				if(rank != 4) ++ans;
				rank = 4;
			} if(b > a && b > c) {
				if(rank != 5) ++ans;
				rank = 5;
			} else if(c > a && c > b) {
				if(rank != 6) ++ans;
				rank = 6;
			}

		}

		System.out.print(ans);
	}
}