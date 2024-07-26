import java.util.*;

public class Main {

    public static void binary(int n){
        if(n == 1) {
            System.out.print("1");
            return;
        }

        binary(n/2);
        System.out.print(n%2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0) System.out.println(0);
        else binary(n);
    }
}