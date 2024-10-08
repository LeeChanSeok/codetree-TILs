import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		char[] A = new char[n];
		char[] B = new char[n];

		A = sc.next().toCharArray();
		B = sc.next().toCharArray();

		int ans = 0;
		boolean isDiff = false;
		for (int i = 0; i < n; ++i) {
			if (A[i] != B[i]) {
				if (!isDiff) {
					++ans;
				}
				isDiff = true;
			} else {
				isDiff = false;
			}
		}

		System.out.println(ans);

	}

}