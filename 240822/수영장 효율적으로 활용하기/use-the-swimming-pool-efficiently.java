import java.util.Scanner;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i < n; ++i) {
			arr[i] = sc.nextInt();
		}
		
		int l = 0, r = (int)2e9;
		int res = Integer.MAX_VALUE;;		
		while(l <= r) {
			int mid = (l + r) / 2;

			int cnt = 1;
			int sum = 0;
			int max = 0;
			boolean isGroup = true;
			for(int i = 0; i < n; ++i) {
				if(arr[i] > mid) {
					isGroup = false;
					break;
				}				
				
				sum += arr[i];
				if(sum >= mid) {
					++cnt;
					max = Math.max(sum - arr[i], max);
					sum = arr[i];
				}
			}
			max = Math.max(sum, max);
			
			if(cnt <= m && isGroup) {
				res = Math.min(res, max);
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		
		System.out.println(res);

	}

}