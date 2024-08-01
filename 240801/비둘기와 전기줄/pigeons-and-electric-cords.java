import java.util.Scanner;

public class Main {

	static int MAX = 100;
	static int N;
	static int[] X;
	static int[] Y;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		X = new int[N];
		Y = new int[N];

		for (int i = 0; i < N; ++i) {
			X[i] = sc.nextInt();
			Y[i] = sc.nextInt();
		}

		int cnt = -1;
		for (int i = 1; i <= 10; ++i) {
			int pos = -1;
			for (int j = 0; j < N; ++j) {
				if (X[j] == i && Y[i] != pos) {
					++cnt;
					pos = Y[i];
				}
			}

		}
		System.out.println(cnt);

	}

}