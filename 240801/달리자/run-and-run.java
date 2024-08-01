import java.util.Scanner;

public class Main {

	static int MAX = 100;
	static int N;
	static int[] X;
	static int[] Y;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		X = new int[N + 1];
		Y = new int[N + 1];

		for (int i = 0; i < N; ++i) {
			X[i] = sc.nextInt();
		}
		for (int i = 0; i < N; ++i) {
			Y[i] = sc.nextInt();
		}

		int ans = 0;
		for (int i = 0; i < N; ++i) {
			int diff = X[i] - Y[i];
			ans += diff;
			X[i + 1] += diff;

		}
		
		System.out.println(ans);

	}

}