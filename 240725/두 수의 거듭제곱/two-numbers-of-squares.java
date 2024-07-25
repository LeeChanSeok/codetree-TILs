import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = 1;
        for(int i = 0; i < b; ++i){
            ans *= a;
        }

        System.out.println(ans);
    }
}