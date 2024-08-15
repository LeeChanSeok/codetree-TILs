import java.util.Scanner;

public class Main {

	static int ASCII = 100;
	static String str;
	static int ans, n;
	static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		str = sc.next();
		n = 6;
		arr = new int[n];
		ans = Integer.MIN_VALUE;
		recursive(0);
		System.out.println(ans);
	}

	private static void recursive(int idx) {

		if (idx == n) {
			int res = eval();
			ans = Math.max(ans, res);
			return;
		}

		for (int i = 1; i <= 4; ++i) {
			arr[idx] = i;
			recursive(idx + 1);
		}

	}

	private static int eval() {

		int total = arr[str.charAt(0) - 'a'];
		int len = str.length();
		
		for(int i = 1; i < len; i += 2) {
			total = calc(total, str.charAt(i), arr[str.charAt(i + 1) - 'a']);
		}
		
		return total;
	}

	private static int calc(int a, char c, int b) {

		int res = 0;
		if(c == '+') res = a + b;
		else if(c == '-') res = a - b;
		else if(c == '*') res = a * b;
		return res;
	}

}