import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
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

		Map<Integer, Integer> map = new HashMap<>();
		int idx = 0;
		Iterator<Integer> iter = set.iterator();
		while (iter.hasNext()) {
			map.put(iter.next(), idx++);
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; ++i) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			int s = map.get(set.ceiling(a));
			int e = map.get(set.floor(b));
			sb.append(e - s + 1).append('\n');
		}

		System.out.println(sb);

	}

}