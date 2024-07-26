import java.util.Scanner;

class Data {
    char c;
    int v;

    public Data(){
        this.c = '\0';
        this.v = 1000;
        
    }

    public Data(char c, int v){
        this.c = c;
        this.v = v;
        
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        Data ans = new Data();

        Data[] datas = new Data[5];
        for(int i = 0; i < 5; i++) {
            char c = sc.next().charAt(0);            
            int v = sc.nextInt();
            datas[i] = new Data(c, v);

            if(ans.v > v) ans = datas[i];
        }
        
        System.out.print(ans.c + " " + ans.v);
        
    }
}