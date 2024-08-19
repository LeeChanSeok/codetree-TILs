import java.util.HashSet;
import java.util.Scanner;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		HashSet<Integer> A = new HashSet<>();
		for (int i = 0; i < n; ++i) {
			int num = sc.nextInt();
			A.add(num);
		}

		m = sc.nextInt();
		for (int i = 0; i < m; ++i) {
			int num = sc.nextInt();
			if (A.contains(num))
				System.out.print("1 ");
			else
				System.out.print("0 ");
		}

	}

}