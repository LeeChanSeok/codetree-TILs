import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; ++i) {
			String color = sc.next();

			int cnt = map.getOrDefault(color, 0) + 1;
			map.put(color, cnt);
		}

		int ans = 0;
		for (Entry<String, Integer> entry : map.entrySet()) {
			String color = entry.getKey();
			int cnt = entry.getValue();
			ans = Math.max(ans, cnt);

		}
		System.out.println(ans);

	}

}