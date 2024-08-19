import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();

		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for (int i = 0; i < n; ++i) {
			pq.offer(-sc.nextInt());
		}

		for (int i = 0; i < m; ++i) {
			pq.offer(pq.poll() + 1);
		}
		System.out.println(-pq.peek());
	}

}