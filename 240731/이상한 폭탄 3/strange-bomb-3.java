import java.util.Scanner;

public class Main {

	static int N, K;
	static int[] arr;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		K = sc.nextInt();
		arr = new int[N];

		for(int i = 0; i < N - 1; ++i) {
			arr[i] = sc.nextInt();
		}
		
		
		int maxNum = 0;
		int maxCnt = 0;
		
		for(int i = 0; i < N - 1; ++i) {
			
			int cnt = 1;
			int num = arr[i];
			for(int j = i + 1; j < N && j <= i + K; ++j) {
				if(arr[j] == num) ++cnt;
			}
			
			if(cnt >= maxCnt) {
				maxNum = num;
				maxCnt = cnt;
			}
			
		}
		
		System.out.println(maxNum);
		
	}
	

}