import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static final int INT_MAX = Integer.MAX_VALUE;

	public static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		int[] A = new int[n];
		int total = 0;
		for (int i = 0; i < n; ++i) {
			A[i] = sc.nextInt();
			total += A[i];
		}
		Arrays.sort(A);
		int h = total / n;
		int ans = 0;
		while(!(A[0] == h && A[n - 1] == h)) {
			int need = h - A[0];
			int over = A[n-1] - h;
			int move = Math.min(need, over);
			
			ans += move;
			A[0] += move;
			A[n-1] -= move;
			
			Arrays.sort(A);
		}
		
		System.out.print(ans);
	}
}