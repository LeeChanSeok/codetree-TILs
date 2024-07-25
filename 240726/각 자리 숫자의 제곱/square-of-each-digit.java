import java.util.Scanner;

public class Main {
    public static int f(int n) {
        if(n == 0)
            return 0;        

        int num = n % 10;
        return f(n / 10) + num * num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(f(sc.nextInt()));
    }
}