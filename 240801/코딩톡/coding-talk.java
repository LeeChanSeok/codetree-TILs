import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int P = sc.nextInt();

		char[] X = new char[N];
		int[] Y = new int[N];

		for (int i = 0; i < N; ++i) {
			X[i] = sc.next().charAt(0);
			Y[i] = sc.nextInt();
		}

		boolean[] read = new boolean[N];
		for (int i = P - 1; i < N; ++i) {
			char c = X[i];
			int y = Y[i];

			read[c - 'A'] = true;

		}

		for (int i = 0; i < N; ++i) {
			if (!read[i])
				System.out.print((char) (i + 'A') + " ");
		}

	}

}