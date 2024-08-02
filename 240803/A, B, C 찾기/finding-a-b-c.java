import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 7;
		int[] X = new int[n];
		for (int i = 0; i < n; ++i) {
			X[i] = sc.nextInt();			
		}

		Arrays.sort(X);
		
		int A = X[0];
		int B = X[1];
		int C = X[n-1] - (A + B);
		
		System.out.print(A + " " + B + " " + C);
	}
}