import java.util.Scanner;

public class Main {
    public static int F(int n) {
        if(n == 1) {
            return 0;
        }

        if(n % 2 == 0) n /= 2;
        else n /= 3;
        
        return F(n) + 1;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        System.out.println(F(N));
    }
}