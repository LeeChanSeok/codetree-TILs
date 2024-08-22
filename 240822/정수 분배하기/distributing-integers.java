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
		
		int l = 1, r = 100000;
		int res = 1;
		while(l <= r) {
			int mid = (l + r) / 2;
			
			int cnt = 0;
			for(int i = 0; i < n; ++i) {
				cnt += (arr[i]) / mid;
				if(cnt >= m);
			}
			
			if(cnt >= m) {
				res = Math.max(res, mid);
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		
		System.out.println(res);

	}

}