import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static final int INT_MAX = Integer.MAX_VALUE;

	public static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		boolean isZero = false;
		int[] A = new int[n];
		for (int i = 0; i < n; ++i) {
			A[i] = sc.nextInt();
			if(A[i] == 0) isZero = true;
		}
		Arrays.sort(A);
		int ans = Integer.MIN_VALUE;
		
		if(A[n-1] > 0 && A[n-2] > 0 && A[n-3] > 0) ans = Math.max(ans, A[n-1] * A[n-2] * A[n-3]);
		if(A[0] < 0 && A[1] < 0 && A[n-1] > 0) ans = Math.max(ans, A[0] * A[1]* A[n-1]);
		if(A[0] < 0 && A[n-2] > 0 && A[n-1] > 0) ans = Math.max(ans, A[0] * A[1]* A[n-1]);
		if(isZero) ans = Math.max(ans, 0);
		
		System.out.print(ans);
	}
}