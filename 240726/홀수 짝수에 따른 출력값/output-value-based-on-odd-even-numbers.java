import java.util.Scanner;

public class Main {
    public static int E(int n) {
        if(n == 0) {
            return 0;
        }
        
        int num = 0;
        if(n % 2 == 0) num = n;

        return E(n - 1) + num;
    }
    public static int O(int n) {
        if(n == 0) {
            return 0;
        }
        
        int num = 0;
        if(n % 2 != 0) num = n;

        return O(n - 1) + num;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int ans = 0;
        if(N % 2 == 0) ans = E(N);
        else ans = O(N);
        System.out.println(ans);
    }
}