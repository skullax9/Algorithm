package dynamicprogramming;

import java.util.Scanner;

public class RepetitiveFibonacci {

	static int[] storage = new int[100];

	static int fibonacci(int i) {
		storage[1] = 1;
		storage[2] = 1;

		for (int n = 3; n < i + 1; n++) {
			storage[n] = storage[n - 1] + storage[n - 2];
		}

		return storage[i];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("피보나치 수를 구합니다.");
		int N = 0;

		while (N < 3 || N > 99) {
			System.out.print("수를 입력하세요 : ");
			N = sc.nextInt();
		}

		int result = fibonacci(N);

		System.out.println(N + " -> " + result);
	}
}
