import java.util.*;

public class Main {

    static int ans, m;
    static int[] arr;

    public static void f(){
        while(m != 1){
            ans += arr[m];

            if(m % 2 == 0) m /= 2;
            else m -= 1;

        }

        ans += arr[1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n+1];
        for(int i = 1; i <= n; ++i){
            arr[i] = sc.nextInt();
        }

        f();
        System.out.print(ans);
    }
}