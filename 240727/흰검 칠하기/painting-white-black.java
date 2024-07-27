import java.util.Scanner;

public class Main {    
    public static final int OFFSET = 100000;
    public static final int MAX_R = 200000; 
    public static final int MAX_N = 1000;
    
    public static int n;
    public static int[] b = new int[MAX_R + 1];
    public static int[] w = new int[MAX_R + 1];
    public static int[] g = new int[MAX_R + 1];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        n = sc.nextInt();
        
        // 현재 위치
        int cur = OFFSET;
        
        for(int i = 0; i < n; i++) {
            int distance = sc.nextInt() - 1;
            char direction = sc.next().charAt(0);
            
            if(direction == 'L') {
                ++w[cur];
                isGray(1, cur);
                for(int j = 0; j < distance; ++j){
                    ++w[--cur];
                    isGray(1, cur);
                }
                
            }
            else {
                ++b[cur];
                isGray(2, cur);
                for(int j = 0; j < distance; ++j){
                    ++b[++cur];
                    isGray(2, cur);
                }
            }           
        }
        
        int bcnt = 0;
        int wcnt = 0;
        int gcnt = 0;
        for(int i = 0; i <= MAX_R; i++){
            if(g[i] == 1) ++wcnt;
            else if(g[i] == 2) ++bcnt;
            else if(g[i] == 3) ++gcnt;

        }
        
        System.out.print(wcnt + " " + bcnt + " " + gcnt);
    }

	private static void isGray(int c, int cur) {

		if(w[cur] >= 2 && b[cur] >= 2) g[cur] = 3;
		else g[cur] = c;		
		
	}


}