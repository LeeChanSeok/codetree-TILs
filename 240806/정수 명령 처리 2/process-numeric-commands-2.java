import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static int n;
	public static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < N; ++i) {
			String cmd = sc.next();

			if (cmd.equals("push"))
				q.add(sc.nextInt());
			else if (cmd.equals("pop"))
				System.out.println(q.poll());
			else if (cmd.equals("size"))
				System.out.println(q.size());
			else if (cmd.equals("empty")) {
				if (q.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
			} else if (cmd.equals("front"))
				System.out.println(q.peek());

		}

		System.out.println();
	}

}