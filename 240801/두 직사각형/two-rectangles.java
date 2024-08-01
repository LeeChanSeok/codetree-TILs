import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isOverlapping = true;

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();        
        int y2 = sc.nextInt();

        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();        
        int b2 = sc.nextInt();


        if(a2 < x1 || x2 < a1) isOverlapping = false;
        if(b2 < y1 || y2 < b1) isOverlapping = false;
        

        if(isOverlapping) System.out.println("overlapping");
        else System.out.println("nonoverlapping");
    }
}