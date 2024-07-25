import java.util.Scanner;

public class Main {

    static int[] arr;

    public static int F(int n) {
        if(n == 0) {
            return 0;
        }
        
        return F(n / 10) + n % 10;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        System.out.println(F(a*b*c));
    }
}