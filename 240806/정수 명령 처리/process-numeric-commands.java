import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static int n;
	public static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		Stack<Integer> s = new Stack<>();
		for (int i = 0; i < N; ++i) {
			String cmd = sc.next();

			if (cmd.equals("push"))
				s.add(sc.nextInt());
			else if (cmd.equals("pop"))
				System.out.println(s.pop());
			else if (cmd.equals("size"))
				System.out.println(s.size());
			else if (cmd.equals("empty")) {
				if (s.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
			} else if (cmd.equals("top"))
				System.out.println(s.peek());

		}

		System.out.println();
	}

}