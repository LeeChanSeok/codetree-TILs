import java.util.*;

public class Main {

    public static int[] dx = new int[]{0, 1, -1,  0};
    public static int[] dy = new int[]{1, 0,  0, -1};
    
	static int n;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
				
		int ans = -1;
		int t = 0;
		int r = 0, c = 0;
		while(n-- > 0) {
			
			int dir = getDir(sc.next().charAt(0));
			int v = sc.nextInt();
			
			for(int i = 1; i <= v; ++i) {
				r += dx[dir];
				c += dy[dir];
				
				++t;
				if(r == 0 && c == 0) ans = t;
				
			}
			
		}
		System.out.println(ans);
		

	}


    public static int getDir(char a) {
        if(a == 'E')
            return 0;
        else if(a == 'S')
            return 1;
        else if(a == 'N')
            return 2;
        else
            return 3;
    }
	
}