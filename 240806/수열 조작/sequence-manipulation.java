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
		for(int i = 1; i <= N; ++i) {
			dq.add(i);
		}

		while(dq.size() != 1) {
			dq.poll();
			dq.addLast(dq.pollFirst());
		}
		
		System.out.println(dq.pop());
		
	}

}