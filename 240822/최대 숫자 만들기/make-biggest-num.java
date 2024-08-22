import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String[] arr = new String[n];
		for (int i = 0; i < n; ++i) {
			arr[i] = sc.next();
		}

		Arrays.sort(arr, (a1, a2) -> {
			long a = Long.parseLong(a1 + "" + a2);
			long b = Long.parseLong(a2 + "" + a1);

			return Long.compare(b, a);
		});

		for (String num : arr) {
			System.out.print(num);
		}

	}

}