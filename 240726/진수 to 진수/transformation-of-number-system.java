import java.util.*;

public class Main {

    static int a, b;

    public static void binary(int n){
        if(n == 0) {            
            return;
        }

        binary(n/b);
        System.out.print(n%b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        char[] arr = sc.next().toCharArray();
        int num = 0;

        for(int i = 0; i < arr.length; i++)
            num = num * a + (arr[i] - '0');
        
        if(num == 0) System.out.println(0);
        else binary(num);
    }
}