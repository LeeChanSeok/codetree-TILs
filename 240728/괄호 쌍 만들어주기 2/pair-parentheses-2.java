import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char[] arr = sc.next().toCharArray();
		int n = arr.length;
		
		int ans = 0;
		for (int i = 0; i < n - 3; i++) {
			if(arr[i] == ')' || arr[i+1] == ')') continue;
			for(int j = i + 2; j < n - 1; ++j) {
				if(arr[j] == ')' && arr[j + 1] == ')') ++ ans;
			}
		}

		System.out.println(ans);
	}
}