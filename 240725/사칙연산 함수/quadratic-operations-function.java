import java.util.Scanner;

public class Main {

    public static String f(int a, char o, int b){
        String ans = "";
        if(o == '+') ans = String.format("%d + %d = %d", a, b, a + b);
        else if(o == '-') ans = String.format("%d - %d = %d", a, b, a - b);
        else if(o == '/') ans = String.format("%d / %d = %d", a, b, a / b);
        else if(o == '*') ans = String.format("%d * %d = %d", a, b, a * b);
        else ans = "False";

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int b = sc.nextInt();

        System.out.println(f(a, o, b));

    }
}