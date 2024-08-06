import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static int n;
	public static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		Deque<Integer> dq = new ArrayDeque<>();
		for(int i = 0; i < N; ++i) {
			String cmd = sc.next();
			
			if(cmd.equals("push_front")) dq.addFirst(sc.nextInt());
			else if(cmd.equals("push_back")) dq.addLast(sc.nextInt());
			else if(cmd.equals("pop_front")) System.out.println(dq.pollFirst());
			else if(cmd.equals("pop_back")) System.out.println(dq.pollLast());
			else if(cmd.equals("size")) System.out.println(dq.size());
			else if(cmd.equals("empty")) {
				if(dq.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
			}
			else if(cmd.equals("front")) System.out.println(dq.peekFirst());
			else if(cmd.equals("back")) System.out.println(dq.peekLast());
			
		}

	}

}