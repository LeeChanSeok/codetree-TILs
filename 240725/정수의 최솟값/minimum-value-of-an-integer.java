import java.util.*;

public class Main {

    public static int min(int a, int b , int c){
        return Math.min(a, Math.min(b, c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int ans = min(a, b, c);
        System.out.println(ans);
    }
}