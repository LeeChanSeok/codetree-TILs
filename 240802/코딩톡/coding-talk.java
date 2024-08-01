import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int P = sc.nextInt();

		char[] X = new char[M];
		int[] Y = new int[M];

		for (int i = 0; i < M; ++i) {
			X[i] = sc.next().charAt(0);
			Y[i] = sc.nextInt();
		}

		boolean[] read = new boolean[N + 1];
		for (int i = 0; i < M; ++i) {
			char c = X[i];
			int y = Y[i];

			if(i >= P - 1 || y == Y[P-1]) 
				read[c - 'A'] = true;
		}

		if(Y[P-1] != 0) {
			for (int i = 0; i < N; ++i) {
				if (!read[i])
					System.out.print((char) (i + 'A') + " ");
			}
		}

	}

}