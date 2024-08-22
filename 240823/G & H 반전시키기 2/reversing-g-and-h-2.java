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
		boolean push = false;
		for (int i = n - 1; i >= 0; --i) {
			if ((A[i] != B[i] && !push) || (A[i] == B[i] && push)) {
				push = !push;
				++ans;
			}
		}

		System.out.println(ans);

	}

}