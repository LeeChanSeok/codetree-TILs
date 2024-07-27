import java.util.Scanner;

public class Main {

	static int n;
	static int[] arr;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int ans = 0;
		for (int i = 0; i < n - 2; ++i) {
			for (int j = i + 1; j < n - 1; ++j) {
				for (int k = j + 1; k < n; ++k) {

					int sum = isCarry(i, j, k);

					ans = Math.max(ans, sum);
				}
			}
		}

		System.out.println(ans);
	}

	private static int isCarry(int i, int j, int k) {
		
		int a = arr[i];
		int b = arr[j];
		int c = arr[k];
		
		int p = 0;
		int sum = 0;
		while(a != 0 || b != 0 || c != 0) {
			int digit = a % 10 + b % 10 + c % 10;
			if(digit >= 10) return 0;
			sum = sum + (int)Math.pow(10, p) * digit; 
			
			a /= 10;
			b /= 10;
			c /= 10;
			++p;
		}
		
		return sum;
	}
}