import java.util.Scanner;

public class Main {

    

    public static int F(int n1, int n2, int k) {
        if(k == 0) {
            return n2;
        }

        return F(n2, n1 * n2 % 100, k - 1);
        
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        int ans = 0;
        if(N == 1) ans = 2;
        else if(N == 2) ans = 4;
        else ans = F(2, 4, N - 2);

        System.out.println(ans);
    }
}