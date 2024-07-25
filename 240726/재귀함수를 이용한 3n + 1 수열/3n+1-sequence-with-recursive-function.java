import java.util.Scanner;

public class Main {

    static int[] arr;

    public static int F(int n) {
        if(n == 1) {
            return 0;
        }
        
        if(n % 2 == 0) return F(n / 2) + 1;
        else return F(n * 3 + 1) + 1;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        
        System.out.println(F(N));
    }
}