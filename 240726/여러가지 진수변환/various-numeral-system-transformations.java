import java.util.*;

public class Main {
    static int b;

    public static void f(int n){
        if(n == 0) {            
            return;
        }

        f(n/b);
        System.out.print(n%b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        b = sc.nextInt();
        
        f(n);
    }
}