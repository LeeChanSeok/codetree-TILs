import java.util.Scanner;

public class Main {

	static int[] X;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		X = new int[3];
		X[0] = sc.nextInt();
		X[1] = sc.nextInt();
		X[2] = sc.nextInt();
		
		int move = 0;
		if(isContinue()) move = 0;
		
		if(X[0] + 1 == X[1]) {
			if(X[1] + 2 == X[2]) move = 1;
			else move = 2;
		}
		else if(X[1] + 1 == X[2]) {
			if(X[0] + 2 == X[1]) move = 1;
			else move = 2;
		}else {
			if(X[0] + 2 == X[1] || X[1] + 2 == X[2]) move = 1;
			else move = 2;
		}
		
		System.out.println(move);
	}
	private static boolean isContinue() {

		if(X[0] + 1 == X[1] && X[1] + 1 == X[2]) return true;
		return false;
	}

}