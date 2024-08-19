import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for (int i = 0; i < n; ++i) {
			int num = sc.nextInt();
			if (num > 0)
				pq.add(num);
			else {
				if(pq.isEmpty()) System.out.println(0);
				else System.out.println(pq.poll());

			}
		}

	}

}