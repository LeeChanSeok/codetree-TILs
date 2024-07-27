import java.util.*;

public class Main {
    
    static int MAX_R = 1000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] a = new int[MAX_R + 1];       
        
        int at = 0;
        int apos = 0;
        for(int i = 1; i <= N; ++i){
            int v = sc.nextInt();
            int t = sc.nextInt();

            while(t-- > 0){
                a[++at] = apos + v;
                apos += v;
            }
            
        }        

        int[] b = new int[MAX_R + 1];       
        
        int bt = 0;
        int bpos = 0;
        for(int i = 1; i <= M; ++i){
            int v = sc.nextInt();
            int t = sc.nextInt();

            while(t-- > 0){
                b[++bt] = bpos + v;
                bpos += v;
            }
            
        }        

        int cnt = 0;
        int first = 0;
        for(int i = 1; i <= Math.min(at, bt); ++i){
            if(a[i] > b[i]) {
                if(first == 0) first = 1;
                else if(first ==2){
                    ++cnt;
                    first = 1;
                }
            }            
            if(a[i] < b[i]) {
                if(first == 0) first = 2;
                else if(first == 1){
                    ++cnt;
                    first = 2;
                }
            }            
        }

        System.out.print(cnt);

    }

}