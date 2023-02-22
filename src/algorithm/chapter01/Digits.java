package algorithm.chapter01;

import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no;

		System.out.println("2자리 정수 입력바람니당");

		do {
			System.out.print("val : ");
			no = stdIn.nextInt();
		} while (no < 10 || no > 99);

		System.out.println("val = " + no);
	}
}
