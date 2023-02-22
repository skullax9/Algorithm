package euclidean;

import java.util.Scanner;

public class RecursiveEuclidean {

	static int euclidean(int i, int k) {
		// 입력받은 수 中 큰 수를 작은 수로 나눈 나머지를 구함
		int r = Math.max(i, k) % Math.min(i, k);

		if (r == 0) {
			return k;
		} else {
			// 나머지가 0이 아니라면 작은 수, 나머지를 파라미터로 다시 호출
			return euclidean(k, r);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("최대 공약수를 구합니다");
		System.out.print("첫 번째 수 : ");
		int first = sc.nextInt();
		System.out.print("두 번째 수 : ");
		int second = sc.nextInt();

		int i = euclidean(first, second);

		System.out.println("두 수의 최대 공약수는 " + i + "입니다.");
	}
}
