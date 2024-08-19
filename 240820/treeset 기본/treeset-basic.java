import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		TreeSet<Integer> set = new TreeSet<>();

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
			} else if (cmd.equals("lower_bound")) {
				int k = sc.nextInt();
				if (set.ceiling(k) == null)
					System.out.println("None");
				else
					System.out.println(set.ceiling(k));
			} else if (cmd.equals("upper_bound")) {
				int k = sc.nextInt();
				if (set.higher(k) == null)
					System.out.println("None");
				else
					System.out.println(set.higher(k));
			} else if (cmd.equals("largest")) {
				if (set.isEmpty())
					System.out.println("None");
				else
					System.out.println(set.last());
			} else if (cmd.equals("smallest")) {
				if (set.isEmpty())
					System.out.println("None");
				else
					System.out.println(set.first());
			}
		}

	}

}