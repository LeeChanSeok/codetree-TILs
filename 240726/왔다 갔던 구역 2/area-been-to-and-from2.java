import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();        
        int[] arr = new int[201];

        int pos = 100;
        for(int i = 0; i < N; ++i){
            int a = sc.nextInt();
            int b = (sc.next().charAt(0) == 'R')?1:-1;

            for(int j = 0; j < a; ++j){
                ++arr[pos + b];
                pos += b;
            }
        }
        int cnt = 0;
        for(int i = 0; i <= 200; ++i){
            if(arr[i] >= 2) ++cnt;
        }
        
        System.out.print(cnt);
    }
}