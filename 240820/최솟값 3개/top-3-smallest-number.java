import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for (int i = 0; i < n; ++i) {
			int x = sc.nextInt();
			pq.offer(x);

			if (pq.size() < 3)
				System.out.println(-1);
			else {
				int a = pq.poll();
				int b = pq.poll();
				int c = pq.poll();
				long sum = (long) a * (long) b * (long) c;
				System.out.println(sum);
				pq.offer(a);
				pq.offer(b);
				pq.offer(c);
			}
		}

	}

}