import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static final int MAX = 10;

	static int N;
	static int[][] point;
	static boolean[] X;
	static boolean[] Y;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		point = new int[N][2];
		X = new boolean[MAX + 1];
		Y = new boolean[MAX + 1];

		for (int i = 0; i < N; ++i) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			point[i][0] = x;
			point[i][1] = y;
			X[x] = true;
			Y[y] = true;
		}

		int ans = 0;
		if (solution())
			ans = 1;

		System.out.println(ans);
	}

	private static boolean solution() {
		
		int xCnt = 0, yCnt = 0;
		for (int i = 0; i <= MAX; ++i) {
			if (X[i])
				xCnt++;
			if (Y[i])
				yCnt++;
		}

		if (xCnt == 3 || yCnt == 3)
			return true;

		// x 2개, y 1개
		if (solution2())
			return true;
		// x 1개, y 2개
		if (solution3())
			return true;

		return false;
	}

	private static boolean solution3() {
		for (int y1 = 0; y1 <= MAX - 1; ++y1) {
			for (int y2 = y1 + 1; y2 <= MAX; ++y2) {
				for (int x1 = 0; x1 <= MAX; ++x1) {

					boolean isAnswer = true;
					for (int i = 0; i < N; ++i) {
						int x = point[i][0];
						int y = point[i][1];
						if (!(x == x1 || y == y1 || y == y2)) {
							isAnswer = false;
							break;
						}
					}
					if(isAnswer) return true;
				}
			}
		}

		return false;
	}

	private static boolean solution2() {
		for (int x1 = 0; x1 <= MAX - 1; ++x1) {
			for (int x2 = x1 + 1; x2 <= MAX; ++x2) {
				for (int y1 = 0; y1 <= MAX; ++y1) {

					boolean isAnswer = true;
					for (int i = 0; i < N; ++i) {
						int x = point[i][0];
						int y = point[i][1];
						if (!(x == x1 || x == x2 || y == y1)) {
							isAnswer= false;
							break;
						}
						
					}
					if(isAnswer) return true;
				}
			}
		}

		return false;
	}
}