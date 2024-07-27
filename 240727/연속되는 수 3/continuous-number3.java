import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] a = new int[N+1];
        a[0] = -1;

        for(int i = 1; i <= N; ++i){
            a[i] = sc.nextInt();
        }

        int cnt = 0;
        int max = 0;
        
        for(int i = 1; i <= N; i++) {
            if(i == 1 || !(isPN(a[i]) ^ isPN(a[i - 1]))){
                cnt++;
            } else {
                cnt = 1;
            }
            max = Math.max(max, cnt);
        }
        System.out.print(max);

    }

    public static boolean isPN(int n){
        if(n > 0) return true;
        return false;
    }
}