import java.util.*;

public class Main {

    static int OFFSET = 1000000;
    static int MAX_R = 2000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] a = new int[MAX_R + 1];       
        
        int at = 0;
        int apos = 0;
        for(int i = 1; i <= N; ++i){
            char c = sc.next().charAt(0);
            int x = sc.nextInt();

            if(c == 'L') {
                while(x-- > 0){
                    a[++at] = --apos;
                }
            } else {
                while(x-- > 0){
                    a[++at] = ++apos;
                }
            }

        }        

        int[] b = new int[MAX_R + 1];       
        
        int bt = 0;
        int bpos = 0;
        for(int i = 1; i <= M; ++i){
            char c = sc.next().charAt(0);
            int x = sc.nextInt();

            if(c == 'L') {
                while(x-- > 0){
                    b[++bt] = --bpos;
                }
            } else {
                while(x-- > 0){
                    b[++bt] = ++bpos;
                }
            }

        }

        int ans = -1;
        for(int i = 1; i <= Math.min(at, bt); ++i){
            if(a[i] == b[i]) {
                ans = i;
                break;
            }            
        }

        System.out.print(ans);

    }

}