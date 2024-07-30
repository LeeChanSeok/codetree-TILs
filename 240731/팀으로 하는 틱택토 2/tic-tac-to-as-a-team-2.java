import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static final int MAX = 9;

	static int N;
	static char[][] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = 3;
		arr = new char[N][N];

		for (int i = 0; i < N; ++i) {
			arr[i] = sc.next().toCharArray();
		}

		int ans = 0;
		for(int i = 1; i <= MAX - 1; ++i) {
			for(int j = i + 1; j <= MAX; ++j) {
				
				char a = (char)(i + '0');
				char b = (char)(j + '0');
				
				
				if(solution(a, b)) ++ans;
			}
		}


		System.out.println(ans);
	}

	private static boolean solution(char a, char b) {
		
		
		for(int i = 0; i < 3; ++i) {
			int aCnt = 0, bCnt = 0;
			for(int j = 0; j < 3; ++j) {
				if(arr[i][j] == a) ++aCnt;
				else if(arr[i][j] == b) ++bCnt;
			}
			
			if(aCnt + bCnt == 3 && aCnt != 0 && bCnt != 0) return true;
		}
		
		for(int j = 0; j < 3; ++j) {
			int aCnt = 0, bCnt = 0;
			for(int i = 0; i < 3; ++i) {
				if(arr[i][j] == a) ++aCnt;
				else if(arr[i][j] == b) ++bCnt;
			}
			
			if(aCnt + bCnt == 3 && aCnt != 0 && bCnt != 0) return true;
		}
		
		int aCnt = 0, bCnt = 0;
		for(int i = 0; i < 3; ++i) {
			if(arr[i][i] == a) ++aCnt;
			else if(arr[i][i] == b) ++bCnt;
		}
		if(aCnt + bCnt == 3 && aCnt != 0 && bCnt != 0) return true;
		
		aCnt = bCnt = 0;
		for(int i = 0; i < 3; ++i) {
			if(arr[i][2-i] == a) ++aCnt;
			else if(arr[i][2-i] == b) ++bCnt;
		}
		if(aCnt + bCnt == 3 && aCnt != 0 && bCnt != 0) return true;
		
		
		return false;
	}

	
}