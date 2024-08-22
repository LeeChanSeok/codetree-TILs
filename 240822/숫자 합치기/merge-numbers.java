import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int n = sc.nextInt();
		for (int i = 0; i < n; ++i) {
			pq.offer(sc.nextInt());
		}

		int ans = 0;
		while (pq.size() != 1) {
			int a = pq.poll();
			int b = pq.poll();

			ans += (a + b);
			pq.offer(a + b);
		}

		System.out.println(ans);

	}

}