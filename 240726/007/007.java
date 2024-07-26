import java.util.*;

class ZZ7 {
    String code;
    char place;
    int time;

    public ZZ7(String code, char place, int time){
        this.code = code;
        this.place = place;
        this.time = time;
    }
    
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ZZ7 zz7 = new ZZ7(sc.next(), sc.next().charAt(0), sc.nextInt());

        System.out.println("secret code : " + zz7.code);
        System.out.println("meeting point : " + zz7.place);
        System.out.println("time : " + zz7.time);
        
    }
}