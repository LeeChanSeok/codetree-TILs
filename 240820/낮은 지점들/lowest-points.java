import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; ++i) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			int tmp = map.getOrDefault(x, Integer.MAX_VALUE);
			map.put(x, Math.min(tmp, y));
		}

		long sum = 0;
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			sum += entry.getValue();

		}
		System.out.println(sum);

	}

}