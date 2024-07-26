import java.util.*;

class Data {
    String code;
    char color;
    int time;

    public Data(String code, char color, int time){
        this.code = code;
        this.color = color;
        this.time = time;
    }
    
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Data data = new Data(sc.next(), sc.next().charAt(0), sc.nextInt());

        System.out.println("code : " + data.code);
        System.out.println("color : " + data.color);
        System.out.println("second : " + data.time);
        
    }
}