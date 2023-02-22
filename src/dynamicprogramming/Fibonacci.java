package dynamicprogramming;

import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci {
	static int fibonacci(int i) {
		if (i == 0) return 0;

		if (i == 1 || i == 2) {
			return 1;
		}
		return fibonacci(i - 1) + fibonacci(i - 2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("피보나치 수를 구합니다.");
		System.out.print("수를 입력하세요 : ");
		int N = sc.nextInt();

		int result = fibonacci(N);

		System.out.println(N + " -> " + result);
	}
}
