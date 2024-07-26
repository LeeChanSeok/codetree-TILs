import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();        
        int[] arr = new int[201];

        for(int i = 0; i < N; ++i){
            int a = sc.nextInt() + 100;
            int b = sc.nextInt() + 100 - 1;

            for(int j = a; j <= b; ++j){
                ++arr[j];
            }
        }
        int max = 0;
        for(int i = 0; i <= 200; ++i){
            max= Math.max(max, arr[i]);
        }
        
        System.out.print(max);
    }
}