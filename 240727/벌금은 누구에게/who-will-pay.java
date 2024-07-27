import java.util.*;

public class Main {

    static int OFFSET = 1000000;
    static int MAX_R = 2000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        int ans = -1;
        int[] arr = new int[N+1];
        for(int i = 1; i <= M; ++i){
            int num = sc.nextInt();
            ++arr[num];
            if(arr[num] >= K) {
                ans = num;
                break;
            }
        }

        System.out.print(ans);

    }

}