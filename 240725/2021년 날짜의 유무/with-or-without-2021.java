import java.util.*;

public class Main {

    public static String f(int M , int D){
        int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        return (M >= 1 && M <= 12 && D <= day[M])?"Yes":"No";
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int D = sc.nextInt();

        System.out.print(f(M, D));
    }
}