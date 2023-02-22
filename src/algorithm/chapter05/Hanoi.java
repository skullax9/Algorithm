package algorithm.chapter05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hanoi {
	static int count = 0;
	static List<String> stringList = new ArrayList<>();

	static void move(int no, int x, int y) {
		count++;
        String[] abc = {"A","B","C"};

		if (no > 1) {
			move(no - 1, x, 6 - x - y);
		}

        System.out.println("원반["+no+"]을 "+abc[x-1]+"기둥에서 "+abc[y-1]+"기둥으로 옮김");

		if (no > 1) {
			move(no - 1, 6 - x - y, y);
		}
	}

	static void move2(int no, int x, int y) {
		count++;

		if (no > 1) {
			move2(no - 1, x, 6 - x - y);
		}

		stringList.add(x + " " + y);

		if (no > 1) {
			move2(no - 1, 6 - x - y, y);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("하노이의 탑");
		System.out.print("원반 개수 : ");
		int n = sc.nextInt();

//		move(n, 1, 3);
		move2(n, 1, 3);
		System.out.println(count);
		stringList.forEach(System.out::println);
	}
}
