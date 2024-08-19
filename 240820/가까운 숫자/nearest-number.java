import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		TreeSet<Integer> set = new TreeSet<>();
		set.add(0);

		int dist = Integer.MAX_VALUE;
		for (int i = 0; i < n; ++i) {
			int num = sc.nextInt();

			if (set.lower(num) != null) {
				dist = Math.min(dist, num - set.lower(num));
			}
			if (set.higher(num) != null) {
				dist = Math.min(dist, set.higher(num) - num);
			}

			set.add(num);
			System.out.println(dist);
		}

	}

}