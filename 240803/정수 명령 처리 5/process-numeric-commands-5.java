import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < N; ++i) {
        	String cmd = sc.next();
        	
        	if(cmd.equals("push_back")) list.add(sc.nextInt());
        	else if(cmd.equals("get")) System.out.println(list.get(sc.nextInt() - 1));
        	else if(cmd.equals("pop_back")) list.remove(list.size() - 1);
        	else if(cmd.equals("size")) System.out.println(list.size());
        	
        }
    }
}