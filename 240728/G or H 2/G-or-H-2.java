import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int MAX_R = 100;
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();		
		char[] arr = new char[MAX_R + 1];
		Arrays.fill(arr, '\0');
		for (int i = 0; i < n; ++i) {
			int pos = sc.nextInt();
			char c = sc.next().charAt(0);
			
			arr[pos] = c;
		}

		int ans = 0;
		for (int i = 0; i <= MAX_R; i++) {
            if(arr[i] == '\0') continue;
            int gCnt = 0, hCnt = 0;
			for (int j = i; j <= MAX_R; ++j) {
				if(arr[j] != '\0') {
					if(arr[j] == 'G') ++gCnt; 
					else if(arr[j] == 'H') ++hCnt;
					if(gCnt == hCnt) {
						ans = Math.max(ans,  j - i);
					}
				}
			}
			
		}

		System.out.println(ans);
	}
}