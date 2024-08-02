import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] A = new int[n*2];
		for (int i = 0; i < n*2; ++i) {
			A[i] = sc.nextInt();			
		}

		Arrays.sort(A);
		
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < n; ++i) {
			min = Math.min(min, A[i+n] - A[i]);
		}
		System.out.print(min);
	}
}