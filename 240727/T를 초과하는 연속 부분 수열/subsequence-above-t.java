import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int t = sc.nextInt();

        int[] a = new int[N+1];
        a[0] = 0;

        for(int i = 1; i <= N; ++i){
            a[i] = sc.nextInt();
        }

        int cnt = 0;
        int max = 0;
        for(int i = 1; i <= N; i++) {
            
            if(a[i] > t){
                cnt++;
            } else {
                cnt = 0;
            }
            max = Math.max(max, cnt);
        }
        System.out.print(max);

    }
}