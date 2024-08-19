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

			if (set.contains(num)) {
				set.remove(num);
				System.out.println(num);
			} else if (set.lower(num) != null) {
				int x = set.lower(num);
				System.out.println(x);
				set.remove(x);
			} else {
				System.out.println(-1);
			}

		}

	}

}