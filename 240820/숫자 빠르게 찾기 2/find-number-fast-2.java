import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		TreeSet<Integer> set = new TreeSet<>();

		for (int i = 0; i < n; ++i) {
			set.add(sc.nextInt());
		}

		for (int i = 0; i < m; ++i) {
			int num = sc.nextInt();

			if (set.ceiling(num) == null)
				System.out.println(-1);
			else
				System.out.println(set.ceiling(num));
		}

	}

}