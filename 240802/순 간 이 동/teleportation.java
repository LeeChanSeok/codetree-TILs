import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();

		int distAX = Math.abs(A - x);
		int distAY = Math.abs(A - y);
		int distBX = Math.abs(B - x);
		int distBY = Math.abs(B - y);

		int ans = Math.abs(A - B);

		ans = Math.min(ans, distAX + distBY);
		ans = Math.min(ans, distAY + distBX);

		System.out.println(ans);
	}

}