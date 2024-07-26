import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

// 학생들의 정보를 나타내는 클래스 선언
class Point {
    int x ,y, id;
    int dist;

	public Point(int x, int y, int id) {
		super();
		this.x = x;
		this.y = y;
		this.id = id;
		this.dist = Math.abs(x) + Math.abs(y);
	}

    
    
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력:
        int n = sc.nextInt();
        Point[] points = new Point[n];
        for(int i = 0; i < n; i++) {
            
            int x = sc.nextInt();
            int y = sc.nextInt();

            // Student 객체를 생성해 리스트에 추가합니다.
            points[i] = new Point(x, y, i + 1);
        }

        // custom comparator를 활용한 정렬
        Arrays.sort(points, new Comparator<Point>() {  
            @Override
            public int compare(Point a, Point b) { // 키를 기준 오름차순 정렬합니다.
                
                if(a.dist == b.dist) return a.id - b.id;
            	return a.dist - b.dist;
                
            }
        });

        
        for (int i = 0; i < n; i++){
            System.out.println(points[i].id);
        }
    
    }
}