import java.util.HashSet;
import java.util.Scanner;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();

		HashSet<Integer> A = new HashSet<>();
		for (int i = 0; i < n; ++i) {
			int num = sc.nextInt();
			A.add(num);
		}

		HashSet<Integer> B = new HashSet<>();
		for (int i = 0; i < m; ++i) {
			int num = sc.nextInt();
			B.add(num);
		}

		HashSet<Integer> C = new HashSet<>();
		for (int num : A) {
			if (!B.contains(num))
				C.add(num);
		}
		for (int num : B) {
			if (!A.contains(num))
				C.add(num);
		}

		System.out.println(C.size());
	}

}