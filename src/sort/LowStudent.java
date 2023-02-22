package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student> {
	private String name;
	private int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return this.name;
	}

	public int getScore() {
		return this.score;
	}

	@Override
	public int compareTo(Student other) {
		if (this.score < other.score) {
			return -1;
		}
		return 1;
	}
}

public class LowStudent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		List<Student> students = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			String name = sc.next();
			int score = sc.nextInt();
			students.add(new Student(name, score));
		}

		Collections.sort(students);

		for (int i = 0; i < students.size(); i++) {
			System.out.print(students.get(i).getName() + " ");
		}
	}
}
