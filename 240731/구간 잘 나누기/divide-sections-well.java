import java.util.Scanner;

public class Main {

	static int N, M;
	static int[] arr;
	static int ans;
	static boolean[] used;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[N + 1];
		used = new boolean[N + 1];
		
		ans = Integer.MAX_VALUE;
		for(int i = 1; i <= N; ++i) {
			arr[i] = sc.nextInt();
		}
		recursive(0, 0);
		System.out.println(ans);
	}

	private static void recursive(int num, int cnt) {
		
		if(cnt == M - 1) {
			int max = 0;
			int sum = 0;
			for(int i = 1; i <= N; ++i) {
				sum += arr[i];
				if(used[i]) {
					max = Math.max(max, sum);
					sum = 0;
				}
			}
			max = Math.max(max, sum);
			ans = Math.min(ans, max);
			return;
		}
		
		for(int i = num + 1; i < N; ++i) {
			used[i] = true;
			recursive(i, cnt + 1);
			used[i] = false;
		}
	}

	

}