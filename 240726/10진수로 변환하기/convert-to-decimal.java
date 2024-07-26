import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        int num = 0;

        for(int i = 0; i < arr.length; i++)
            num = num * 2 + (arr[i] - '0');
        
        System.out.print(num);
    }
}