import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		TreeMap<Integer, Integer> map = new TreeMap<>();

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
				if (ans == -1)
					System.out.println("None");
				else
					System.out.println(ans);
			} else if (cmd.equals("print_list")) {

				if (map.isEmpty())
					System.out.println("None");
				else {
					Iterator<Entry<Integer, Integer>> iter = map.entrySet().iterator();
					while (iter.hasNext()) {
						Entry<Integer, Integer> entry = iter.next();
						System.out.print(entry.getValue() + " ");
					}
					System.out.println();
				}
			}
		}

	}

}