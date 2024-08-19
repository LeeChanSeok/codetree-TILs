import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		TreeMap<String, Integer> map = new TreeMap<>();
		for (int i = 0; i < n; ++i) {
			String str = sc.next();
			int cnt = map.getOrDefault(str, 0) + 1;
			map.put(str, cnt);
		}

		for (Entry<String, Integer> entry : map.entrySet()) {
			String k = entry.getKey();
			int v = entry.getValue();
			System.out.printf("%s %d\n", k, v);

		}

	}

}