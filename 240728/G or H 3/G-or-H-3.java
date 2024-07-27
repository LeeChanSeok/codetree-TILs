import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int MAX_R = 10000;
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		char[] arr = new char[MAX_R + 1];
		
		for (int i = 0; i < n; ++i) {
			int pos = sc.nextInt();
			char c = sc.next().charAt(0);
			
			arr[pos] = c;
		}

		int ans = Integer.MIN_VALUE;
		for (int i = 1; i <= MAX_R - k; i++) {
            int sum = 0;
			for (int j = i; j <= i + k; ++j) {
				if(arr[j] == 'G') sum += 1; 
				else if(arr[j] == 'H')sum += 2;
			}
            ans = Math.max(ans, sum);
		}

		System.out.println(ans);
	}
}