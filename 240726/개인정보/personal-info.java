import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

// 학생들의 정보를 나타내는 클래스 선언
class Student {
    String name;
    int height;
    double weight;

    public Student(String name, int height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력:
        int n = 5;
        Student[] students = new Student[n];
        for(int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();

            // Student 객체를 생성해 리스트에 추가합니다.
            students[i] = new Student(name, height, weight);
        }

        // custom comparator를 활용한 정렬
        Arrays.sort(students, new Comparator<Student>() {  
            @Override
            public int compare(Student a, Student b) { // 키를 기준 오름차순 정렬합니다.
                return a.name.compareTo(b.name);
                
            }
        });

        System.out.println("name");
        for (int i = 0; i < n; i++){
            System.out.print(students[i].name + " ");
            System.out.print(students[i].height + " ");
            System.out.println(students[i].weight);
        }
        System.out.println();
        // custom comparator를 활용한 정렬
        Arrays.sort(students, new Comparator<Student>() {  
            @Override
            public int compare(Student a, Student b) { // 키를 기준 오름차순 정렬합니다.
                return b.height - a.height;
                
            }
        });

        System.out.println("height");
        for (int i = 0; i < n; i++){
            System.out.print(students[i].name + " ");
            System.out.print(students[i].height + " ");
            System.out.println(students[i].weight);
        }
    }
}