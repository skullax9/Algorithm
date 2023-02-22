package greedy;

import java.util.Scanner;

public class UntilOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();           // 대상 숫자 입력 받기
		int K = sc.nextInt();           // 나눌 숫자 입력 받기
		int count = 0;                  // N을 1로 만들 때 증가할 횟수

		while (N != 1) {                // N이 1이 아니라면 반복
			if (N % K != 0) {           // N이 K로 나누어 떨어지지 않는다면
				N -= 1;                 // 나누어 떨어질 때 까지 1을 뺀다.
			} else {                    // 나누어 떨어진다면
				N /= K;                 // N을 K로 나눈다.
			}
			count++;                    // 반복문이 돌 때 마다 1씩 후위 증가.
		}

		System.out.println(count);      // 정답 출력

	}

}
