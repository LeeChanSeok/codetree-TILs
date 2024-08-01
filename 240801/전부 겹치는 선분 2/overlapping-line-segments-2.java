import java.util.Scanner;

public class Main {

	static int MAX = 100;
	static int N;
	static int[] X;
	static int[] Y;
	static int[] A;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		X = new int[N];
		Y = new int[N];
		A = new int[MAX + 1];

		for (int i = 0; i < N; ++i) {
			X[i] = sc.nextInt();
			Y[i] = sc.nextInt();

			for (int a = X[i]; a <= Y[i]; ++a) {
				++A[a];
			}
		}

		boolean isAllContain = solution();

		if (isAllContain)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

	private static boolean solution() {

		for (int i = 0; i < N; ++i) {
			int a = X[i];
			int b = X[i];

			for (int j = a; j <= b; ++j) {
				--A[j];
			}

			boolean isAllContain = false;
			for (int j = 0; j <= MAX; ++j) {
				if (A[j] == N - 1) {
					isAllContain = true;
					break;
				}
			}

			if (isAllContain)
				return true;
			for (int j = a; j <= b; ++j) {
				++A[j];
			}
		}

		return false;
	}
}