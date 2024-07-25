import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        if(n < m){
            int tmp = n;
            n = m;
            m = tmp;
        }

        int x = n;
        int y = m;
        while(y != 0){
            int tmp = x % y;
            x = y;
            y = tmp;
        }


        System.out.println(n * m / x);
    }
}