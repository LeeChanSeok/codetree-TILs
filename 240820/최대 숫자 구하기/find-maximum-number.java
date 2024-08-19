import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		TreeSet<Integer> set = new TreeSet<>();

		for (int i = 1; i <= m; ++i) {
			set.add(i);
		}

		for (int i = 0; i < n; ++i) {
			set.remove(sc.nextInt());
			System.out.println(set.last());
		}

	}

}