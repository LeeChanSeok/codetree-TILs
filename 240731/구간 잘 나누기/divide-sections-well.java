import java.util.Scanner;

public class Main {

	static int N, M;
	static int[] arr;
	static int ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[N];

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < N; ++i) {
			arr[i] = sc.nextInt();
			min = Math.min(min, arr[i]);
		}
		int max = 10000;
		int ans = solution(min, max);
		System.out.println(ans);
	}

	private static int solution(int min, int max) {

		for(int a = min; a <= max; ++a) {
			
			int sum = 0;
			int block = 0;
			int i = 0;
			boolean isBlock = true;
			while(i < N) {
				if(sum + arr[i] > a) {
					if(sum == 0) {
						isBlock = false;
						break;
					}
					++block;
					sum = 0;
				}
				else sum += arr[i++];
			}
			
			if(block >= M) isBlock = false;
			if(isBlock) return a;
			
		}
		
		return 0;
	}


}