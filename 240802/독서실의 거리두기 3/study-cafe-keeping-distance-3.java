import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		String str = sc.next();
		int[] X = new int[N + 1];
		int[] Y = new int[N + 1];
		int[] Dist = new int[N];

		int idx = 0;
		int max = 0;
		for (int i = 0; i < N; ++i) {
			if (str.charAt(i) == '1') {
				Y[idx] = X[idx+1] = i;
				Dist[idx] = Y[idx] - X[idx];
				max = Math.max(max, Dist[idx]);
				++idx;
			}
		}

		boolean isDivide = false;
		int min = Integer.MAX_VALUE;
		for(int i = 1; i < idx; ++i) {
			int d = Dist[i];
			if(d == max && !isDivide) {
				isDivide = true;
				d /= 2;
			}
			
			min = Math.min(min, d);
		}
		
		
		System.out.println(min);
	}

}