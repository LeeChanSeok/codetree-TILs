import java.util.*;

class Data {
    String name;    
    int code;

    public Data(){
        this.name = "codetree";
        this.code = 50;
        
    }

    public Data(String name, int code){
        this.name = name;
        this.code = code;
        
    }
    
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Data data = new Data();
        System.out.println("product " + data.name + " is " + data.code);

        data.name = sc.next();
        data.code = sc.nextInt();
        System.out.println("product " + data.name + " is " + data.code);
        
    }
}