import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] a = new int[N+1];       

        for(int i = 1; i <= N; ++i){
            a[i] = sc.nextInt();
        }
        
        int[] D = new int[N+1];
        for(int i = 1; i <= N; i++) {
            for(int j = i - 1; j >= 0; --j){
                if(a[i] > a[j]){
                    D[i] = Math.max(D[i], D[j] + 1);
                }
            }
        }

        int max = 0;
        for(int i = 1; i <= N; ++i){
            max = Math.max(max, D[i]);
        }
        System.out.print(max);

    }

}