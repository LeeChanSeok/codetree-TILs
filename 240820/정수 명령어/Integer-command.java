import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			TreeSet<Integer> set = new TreeSet<>();
			n = sc.nextInt();

			for (int i = 0; i < n; ++i) {
				String cmd = sc.next();

				if (cmd.equals("I")) {
					int k = sc.nextInt();
					set.add(k);
				} else if (cmd.equals("D")) {
					int k = sc.nextInt();
					if (!set.isEmpty()) {
						if (k == 1)
							set.pollLast();
						else
							set.pollFirst();
					}

				}

			}
			if (set.isEmpty())
				System.out.println("EMPTY");
			else
				System.out.println(set.last() + " " + set.first());

		}

	}

}