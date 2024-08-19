import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n; ++i) {
			String cmd = sc.next();

			if (cmd.equals("add")) {
				int k = sc.nextInt();
				int v = sc.nextInt();
				map.put(k, v);
			} else if (cmd.equals("remove")) {
				int k = sc.nextInt();
				map.remove(k);
			} else if (cmd.equals("find")) {
				int k = sc.nextInt();
				int ans = map.getOrDefault(k, -1);
				if(ans == -1) System.out.println("None");
				else System.out.println(ans);
			}
		}

	}

}