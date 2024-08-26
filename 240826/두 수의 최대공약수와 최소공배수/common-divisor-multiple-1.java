import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		if(a < b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		
		int gcd = gcd(a, b);
		int lcm = (a * b) / gcd;

		System.out.println(gcd + " " + lcm);
	}

	private static int gcd(int a, int b) {

		while (b != 0) {
			int tmp = b;
			b = a % b;
			a = tmp;
		}

		return a;
	}

}