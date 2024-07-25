import java.util.Scanner;

public class Main {
    public static boolean contain369(int n) {

        while(n != 0){
            int digit = n % 10;
            if(digit == 3 || digit == 6 || digit == 9) return true;
            n /= 10;
        }

        return false;
    }

    public static boolean isMagicNumber(int n) {
        return n % 3 == 0 || contain369(n);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;
        for(int i = a; i <= b; i++)
            if(isMagicNumber(i))
                cnt++;

        System.out.println(cnt);
    }
}