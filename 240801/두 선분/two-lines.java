import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isIntersecting = true;

        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();        
        int x4 = sc.nextInt();

        if(x4 < x1 || x2 < x3) isIntersecting = false;

        if(isIntersecting) System.out.println("intersecting");
        else System.out.println("nonintersecting");
    }
}