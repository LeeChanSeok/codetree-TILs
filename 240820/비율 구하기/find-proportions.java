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
			String color = sc.next();

			int cnt = map.getOrDefault(color, 0) + 1;
			map.put(color, cnt);
		}

		for (Entry<String, Integer> entry : map.entrySet()) {
			String color = entry.getKey();
			int cnt = entry.getValue();
			System.out.printf("%s %.4f\n", color, (double) cnt / n * 100 * 1000 / 1000);

		}

	}

}