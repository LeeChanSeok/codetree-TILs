import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < n; ++i) {
			String cmd = sc.next();

			if (cmd.equals("find")) {
				int k = sc.nextInt();
				if (set.contains(k))
					System.out.println("true");
				else
					System.out.println("false");
			} else if (cmd.equals("add")) {
				int k = sc.nextInt();
				set.add(k);
			} else if (cmd.equals("remove")) {
				int k = sc.nextInt();
				set.remove(k);
			}
		}

	}

}