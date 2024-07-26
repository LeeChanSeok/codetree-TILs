import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student> {
	int h, w, id;

	public Student(int h, int w, int id) {
		super();
		this.h = h;
		this.w = w;
		this.id = id;
	}

	@Override
	public int compareTo(Student student) {
		if(this.h == student.h) return student.w - this.w; 
		return student.h - this.h;
	}
};

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		Student[] students = new Student[N];

		for (int i = 0; i < N; ++i) {
			students[i] = new Student(sc.nextInt(), sc.nextInt(), i + 1);
		}
		Arrays.sort(students);

		for (int i = 0; i < N; i++)
			System.out.println(students[i].h + " " + students[i].w + " " + students[i].id);
	}
}