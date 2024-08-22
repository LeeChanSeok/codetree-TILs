import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		char[] A = new char[n];
		char[] B = new char[n];

		A = sc.next().toCharArray();
		B = sc.next().toCharArray();

		int cnt = 0;
		int ans = 0;
		for (int i = 0; i < n; ++i) {
			if (A[i] != B[i]) {
				++cnt;
			} else {
				if (cnt != 0) {
					ans += (cnt - 1) / 4 + 1;
				}
				cnt = 0;
			}
		}

		System.out.println(ans);

	}

}