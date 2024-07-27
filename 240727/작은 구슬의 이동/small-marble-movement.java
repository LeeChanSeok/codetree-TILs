import java.util.*;

public class Main {

    public static int[] dx = new int[]{0, 1, -1,  0};
    public static int[] dy = new int[]{1, 0,  0, -1};
    
	static int n;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		int t = sc.nextInt();
		
		int r = sc.nextInt() - 1;
		int c = sc.nextInt() - 1;
		int d = getDir(sc.next().charAt(0));		
		
		while(t-- > 0) {
			int nr = r + dx[d];
			int nc = c + dy[d];
			
			if(inRange(nr, nc)) {
				r = nr;
				c = nc;
			}else {
				d = 3 - d;
			}
		}
		System.out.println((r + 1) + " " + (c + 1));
		

	}

	private static boolean inRange(int x, int y) {
		if(x >= 0 && x < n && y >= 0 && y < n) return true;
		return false;
	}

    public static int getDir(char a) {
        if(a == 'R')
            return 0;
        else if(a == 'D')
            return 1;
        else if(a == 'U')
            return 2;
        else
            return 3;
    }
	
}