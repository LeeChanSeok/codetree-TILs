import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; ++i) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n; ++i) {
			map.put(arr[i], i);
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; ++i) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			int s = map.get(a);
			int e = map.get(b);
			sb.append(e - s + 1).append('\n');
		}

		System.out.println(sb);

	}

}