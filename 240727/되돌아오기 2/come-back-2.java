import java.util.*;

public class Main {

	static int[] dx = new int[]{0, 1, 0, -1};
	static int[] dy = new int[]{1, 0, -1, 0};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] arr = sc.next().toCharArray();
		
		int ans = -1;
		int t = 0;
		int x = 0, y = 0;
		int dir = 0;
		boolean isMove = false;
		for (char c : arr) {	
			++t;

			if(c == 'F') {
				x += dx[dir];
				y += dy[dir];
				isMove = true;
			}else if (c == 'L')
				dir = (dir - 1 + 4) % 4;
			else if (c == 'R')
				dir = (dir + 1) % 4;
			
			if(x == 0 && y == 0 && isMove) {
				ans = t;
				break;					
			}
		}
		
		System.out.println(ans);

	}

}