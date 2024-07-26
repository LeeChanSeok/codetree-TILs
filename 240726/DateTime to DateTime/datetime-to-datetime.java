import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        
        int ans = a * 24 * 60 + b * 60 + c - (11 * 24 * 60 + 11 * 60 + 11);
        if(ans < 0) ans = -1;
        System.out.println(ans);
    }
}