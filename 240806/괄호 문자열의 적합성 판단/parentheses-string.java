import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	static char[] arr;
	static int N;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		arr = sc.next().toCharArray();
		N = arr.length;
		
		if(solution()) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

	private static boolean solution() {

		Stack<Character> s = new Stack<>();
		
		for(int i = 0; i < N; ++i) {
			if(arr[i] == '(') s.add('(');
			else {
				if(s.isEmpty() || s.peek() == ')') return false;
				s.pop();
				
			}
		}
		
		if(s.isEmpty()) return true; 
		return false;
	}

}