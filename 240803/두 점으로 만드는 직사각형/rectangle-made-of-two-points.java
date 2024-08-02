import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int a2 = sc.nextInt();
		int b2 = sc.nextInt();
		
		int i1 = Math.min(x1, a1);
		int j1 = Math.min(y1, b1);
		int i2 = Math.max(x2, a2);
		int j2 = Math.max(y2, b2);
		
		int ans = (i2 - i1) * (j2 - j1);
		System.out.println(ans);
		
	}
}