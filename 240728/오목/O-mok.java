import java.util.Scanner;

public class Main {

	static int n;
	static int[][] arr;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = 19;
		arr = new int[n+1][n+1];

		for (int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; ++j) {
				arr[i][j] = sc.nextInt();
			}
		}

		baduk();
	}

	private static void baduk() {
	
		// 가로
		for(int i = 1; i <= n; ++i) {
			for(int j = 1; j <= n - 5; ++j) {
				if(arr[i][j] == 1 && arr[i][j+1] == 1 && arr[i][j+2] == 1 && arr[i][j+3] == 1 && arr[i][j+4] == 1) {
					System.out.println(1);
					System.out.println(i + " " + (j + 2));
					return;
				}
				if(arr[i][j] == 2 && arr[i][j+1] == 2 && arr[i][j+2] == 2 && arr[i][j+3] == 2 && arr[i][j+4] == 2) {
					System.out.println(2);
					System.out.println(i + " " + (j + 2));
					return;
				}
			}
		}
		
		// 세로
		for(int i = 1; i <= n - 5; ++i) {
			for(int j = 1; j <= n; ++j) {
				if(arr[i][j] == 1 && arr[i+1][j] == 1 && arr[i+2][j] == 1 && arr[i+3][j] == 1 && arr[i+4][j] == 1) {
					System.out.println(1);
					System.out.println((i + 2) + " " + j);
					return;
				}
				if(arr[i][j] == 2 && arr[i+1][j] == 2 && arr[i+2][j] == 2 && arr[i+3][j] == 2 && arr[i+4][j] == 2) {
					System.out.println(2);
					System.out.println((i + 2) + " " + j);
					return;
				}
			}
		}
		
		
		//대각선
		for(int i = 1; i <= n-5; ++i) {
			for(int j = 1; j <= n - 5; ++j) {
				if(arr[i][j] == 1 && arr[i+1][j+1] == 1 && arr[i+2][j+2] == 1 && arr[i+3][j+3] == 1 && arr[i+4][j+4] == 1) {
					System.out.println(1);
					System.out.println((i + 2) + " " + (j + 2));
					return;
				}
				if(arr[i][j] == 2 && arr[i+1][j+1] == 2 && arr[i+2][j+2] == 2 && arr[i+3][j+3] == 2 && arr[i+4][j+4] == 2) {
					System.out.println(2);
					System.out.println((i + 2) + " " + (j + 2));
					return;
				}
			}
		}		
		
	}

	
}