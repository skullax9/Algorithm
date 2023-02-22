package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class NumberCard {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();                   // 배열의 열
		int N = sc.nextInt();                   // 배열의 행

		int[][] card = new int[M][N];           // 2차원 배열 생성
		int[] small = new int[M];               // 행의 제일 작은 수를 담을 배열 생성

		int num = 10001;                        // 최소값 설정 (최대 10,000 이하 자연수)

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				card[i][j] = sc.nextInt();      // 2차원 배열에 숫자 카드 입력
				if (card[i][j] < num) {         // 입력 받은 수가 num 보다 작다면
					num = small[i] = card[i][j];// num, small 배열에 입력받은 수 저장
				}
			}
			num = 10001;                        // 각 행의 반복이 끝나면 다시 초기화
		}

		Arrays.sort(small);                     // 각 행의 작은 수 배열을 오름차순 정렬

		System.out.println(small[M-1]);         // 작은 수의 모임중 제일 큰 수 출력
	}
}
