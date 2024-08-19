import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; ++i) {
			int num = sc.nextInt();

			int cnt = map.getOrDefault(num, 0) + 1;
			map.put(num, cnt);
		}

		for (int i = 0; i < m; ++i) {
			int num = sc.nextInt();
			int cnt = map.getOrDefault(num, 0);
			System.out.print(cnt + " ");

		}

	}

}