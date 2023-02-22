package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class BigNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();               // 자연수의 개수 (배열에 들어갈 숫자)
		int M = sc.nextInt();               // 더할 횟수
		int K = sc.nextInt();               // 연속으로 초과할 수 없는 수

		int answerV1 = 0;                   // 만들어질 큰 수 (1번 솔루션)
		int answerV2 = 0;                   // 만들어질 큰 수 (2번 솔루션)

		int[] nums = new int[N];            // 숫자를 입력받을 배열

		for (int i = 0; i < N; i++) {       // 배열 크기 만큼 반복문 
			nums[i] = sc.nextInt();         // 입력받은 숫자 배열 삽입
		}

		Arrays.sort(nums);                  // 입력받은 배열 오름차순 정렬
		
		int bigNum = nums[N-1];             // 배열 중 제일 큰 수
		int nextNum = nums[N-2];            // 배열 중 두 번째로 큰 수

		/* 1번 솔루션 */
		for (int i = 1; i <= M; i++) {
			if ((i % K) + 1 == 1) {         // K초과 조건문 (초과가 아닌 이상이라면 -> i % k == 0)
				answerV1 += nextNum;        // 정답 변수에 두번째로 큰 수를 더하기
			} else {                        // 아니라면
				answerV1 += bigNum;         // 제일 큰 수 더하기
			}
		}

		/* 2번 솔루션 */
		int count = (M / (K + 1)) * K;      // 큰 수가 더해지는 횟수
		count += M % (K + 1);               // 두 번째로 큰 수가 더해지는 횟수
		answerV2 += count * bigNum;         // 큰 수가 더해지는 횟수 x 제일 큰수
		answerV2 += (M - count) * nextNum;  // 두 번째로 큰 수가 더해지는 횟수 x 두 번째로 큰 수

		System.out.println(answerV1);       // 정답 출력 (1번 솔루션)
		System.out.println(answerV2);       // 정답 출력 (2번 솔루션)
	}
}
