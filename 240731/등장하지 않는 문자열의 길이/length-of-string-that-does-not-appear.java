import java.util.Scanner;

public class Main {

	static int N;
	static String str;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		str = sc.next();

		int ans = solution();

		System.out.println(ans);
	}

	private static int solution() {
		int ans = 0;

		// 길이
		for (int i = 1; i <= N; ++i) {

			boolean isMatch = false;
			// 시작위치
			for (int j = 0; j <= N - i; ++j) {
				String p = str.substring(j, j + i);

				// 비교
				for (int k = j + 1; k <= N - i; ++k) {
					if (p.equals(str.substring(k, k + i))) {
						isMatch = true;
						break;
					}
				}
				if (isMatch) break;
			}
			if(!isMatch)
				return i;
		}

		return ans;
	}

}