import java.util.*;

class Data {
    String id;
    int level;

    public Data(){
        this.id = "codetree";
        this.level = 10;
        
    }

    public Data(String id, int level){
        this.id = id;
        this.level = level;
        
    }
};

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String id = sc.next();
        int level = sc.nextInt();

        Data data = new Data();
        System.out.println("user " + data.id + " lv " + data.level);

        data.id = id;
        data.level = level;

        System.out.println("user " + data.id + " lv " + data.level);
        
    }
}