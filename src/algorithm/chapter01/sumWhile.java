package algorithm.chapter01;

import java.util.Scanner;

public class sumWhile {

	static int toN(int n) {
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += i;
		}

		return sum;
	}

	static int gaus(int n) {
		int sum = (int) ((1 + n) * (n / 2.0f));
		return sum;
	}

	static int between(int a, int b) {
		int sum = 0;

		if (a < b) {
			for (int i = a; i <= b; i++) {
				sum += i;
			}
		} else if (a > b) {
			for (int i = b; i <= a; i++) {
				sum += i;
			}
		} else {
			return 0;
		}

		return sum;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값 = ");
		int n = stdIn.nextInt();

		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += i;
			if (i < n) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i + " ");
			}

		}
		System.out.println("= " + sum);

		System.out.println("가우스의 합은 : " + gaus(n));

		System.out.println(between(10, 15));
		System.out.println(between(14, 12));
		System.out.println(between(11, 11));
	}
}
