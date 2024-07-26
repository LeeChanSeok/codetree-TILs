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
        char[] arr = sc.next().toCharArray();
        int num = 0;

        for(int i = 0; i < arr.length; i++)
            num = num * 2 + (arr[i] - '0');
        
        num *= 17;
        if(num == 0) System.out.println(0);
        else binary(num);
    }
}