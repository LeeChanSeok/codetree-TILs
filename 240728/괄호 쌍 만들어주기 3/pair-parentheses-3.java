import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char[] arr = sc.next().toCharArray();
		int n = arr.length;
		
		int ans = 0;
		for (int i = 0; i < n - 1; i++) {
			if(arr[i] == ')') continue;
			for(int j = i + 1; j < n; ++j) {
				if(arr[j] == ')') ++ ans;
			}
		}

		System.out.println(ans);
	}
}