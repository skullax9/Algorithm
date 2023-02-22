package dynamicprogramming;

import java.math.BigInteger;
import java.util.Objects;

public class FiboTest {
	static BigInteger[] storage = new BigInteger[1001];

	static BigInteger fibonacci(int i) {
		if (i == 1 || i == 2) {
			return new BigInteger(String.valueOf(1));
		}

		if (Objects.equals(storage[i], BigInteger.ZERO)) {
			return storage[i];
		}

		storage[i] = fibonacci(i - 1).add(fibonacci(i - 2));
		return storage[i];
	}

	static int solution(int n) {
		int answer = 0;

		BigInteger fibonacci = fibonacci(n);

		answer = fibonacci.divide(BigInteger.valueOf(1234567)).intValue() <= 0 ? fibonacci.intValue() : fibonacci.remainder(BigInteger.valueOf(1234567)).intValue();

		return answer;
	}

	public static void main(String[] args) {
		int ok = solution(100);

		System.out.println(ok);
	}
}
