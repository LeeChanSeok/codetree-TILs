import java.util.Scanner;

public class Main {
    public static int F(int n) {
        if(n == 1 || n == 2) {
            return 1;
        }
        
        return F(n - 1) + F(n - 2);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        System.out.println(F(N));
    }
}