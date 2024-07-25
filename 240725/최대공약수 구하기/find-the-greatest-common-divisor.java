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

        while(m != 0){
            int tmp = n % m;
            n = m;
            m = tmp;
        }

        System.out.println(n);
    }
}