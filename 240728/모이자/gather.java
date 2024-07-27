import java.util.Scanner;

public class Main {
	public static final int INT_MIN = Integer.MIN_VALUE;
	public static final int INT_MAX = Integer.MAX_VALUE;

	public static int n;
	public static int[] arr;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		arr = new int[n];
		
		for(int i = 0; i < n; ++i) {
			arr[i] = sc.nextInt();
		}
		

		int minVal = INT_MAX;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for(int j = 0; j < n; ++j) {
				sum += Math.abs(i - j) * arr[j];
			}
			minVal = Math.min(minVal, sum);
		}

		System.out.println(minVal);
	}
}