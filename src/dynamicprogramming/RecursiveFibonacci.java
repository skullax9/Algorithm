package dynamicprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class RecursiveFibonacci {

	static int[] storage = new int[100];

	static int fibonacci(int i) {
		if (i == 1 || i == 2) {
			return 1;
		}

		if (storage[i] != 0) {
			return storage[i];
		}

		storage[i] = fibonacci(i - 1) + fibonacci(i - 2);
		return storage[i];
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
