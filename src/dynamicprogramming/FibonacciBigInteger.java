package dynamicprogramming;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciBigInteger {
	static BigInteger fibonacci(int i) {
		if (i == 0) return BigInteger.ZERO;

		if (i == 1 || i == 2) {
			return BigInteger.ONE;
		}

		BigInteger mOne = fibonacci(i - 1);
		BigInteger mTwo = fibonacci(i - 2);

		return mTwo.add(mOne);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("피보나치 수를 구합니다.");
		System.out.print("수를 입력하세요 : ");
		int N = 10;

		BigInteger result = fibonacci(N);

		System.out.println(N + " -> " + result);

		System.out.println("REMAINDER -> " + result.remainder(BigInteger.valueOf(1234567L)) );
	}
}
