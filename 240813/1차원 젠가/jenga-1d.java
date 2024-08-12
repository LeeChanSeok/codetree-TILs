import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i < n; ++i) {
			arr[i] = sc.nextInt();
		}
		
		int endOfArray = n -1;
		int s = sc.nextInt() - 1;
		int e = sc.nextInt() - 1;
		
		int len = e - s;
		for(int i = s, j = i + len + 1; i <= e && j <= endOfArray; ++i, ++j) {
			arr[i] = arr[j];
		}
		
		endOfArray -= (len + 1);
		s = sc.nextInt() - 1;
		e = sc.nextInt() - 1;
		
		len = e - s;
		for(int i = s, j = i + len + 1; i <= e && j <= endOfArray; ++i, ++j) {
			arr[i] = arr[j];
		}
		
		endOfArray -= (len + 1);
		System.out.println(endOfArray + 1);
		for(int i = 0; i <= endOfArray; ++i) {
			System.out.println(arr[i]);
		}
		
	}

}