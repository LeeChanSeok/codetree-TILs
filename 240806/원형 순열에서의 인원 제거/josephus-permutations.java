import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static int n;
	public static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i <= N; ++i) {
			q.offer(i);
		}
		
		while(!q.isEmpty()) {
			for(int i = 0; i < K - 1; ++i) {
				q.offer(q.poll());
			}
			System.out.print(q.poll() + " ");
		}

	}

}