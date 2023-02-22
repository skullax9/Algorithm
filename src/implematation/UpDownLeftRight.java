package implematation;

import java.util.Scanner;

public class UpDownLeftRight {
	static int count = 0;                               // 전역 변수 카운트 초기화 (N 비교용)

	static int coordinate(int size, int n, String s) {  // 입력값에 따른 좌표 변화 함수
		if (s.equals("U") || s.equals("L")) {           // 현재 좌표에서 올라가거나 왼쪽 조건문
			if (n - 1 > 0) count++;                     // X 또는 Y 좌표에서 1을 뺀 수가 0 보다 크다면 카운트 증가
			return n - 1 <= 0 ? n : n - 1;              // X 또는 Y 좌표에서 1을 뺀 수가 0보다 작거나 같다면 n, 크다면 n-1 반환
		} else if (s.equals("D") || s.equals("R")) {    // 현재 좌표에서 내려가거나 오른쪽 조건문
			if (n + 1 <= size) count++;                 // X 또는 Y 좌표에서 1을 더한 수가 전체 사이즈 보다 작거나 같다면 카운트 증가
			return n + 1 > size ? n : n + 1;            // X 또는 Y 좌표에서 1을 더한 수가 전체 사이즈 보다 크면 n, 작다면 n+1 반환
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();                                   // 지도 전체 사이즈 입력 받기

		int X = 1;                                              // 시작점의 X 좌표
		int Y = 1;                                              // 시작점의 Y 좌표

		do {                                                    // 반복문 시작
			String word = sc.next();                            // 이동할 방향 입력 받기

			if (word.equals("U") || word.equals("D")) {         // 이동할 방향 조건문
				X = coordinate(N, X, word);                     // X 좌표를 업데이트
			} else if (word.equals("L") || word.equals("R")){   // 이동할 방향 조건문
				Y = coordinate(N, Y, word);                     // Y 좌표를 업데이트
			}
		} while (N != count);                                   // 전체 사이즈와 이동한 횟수(무시된 이동 제외)가 같아 질때 까지 반복
		
		System.out.println(X + " " + Y);                        // 정답 출력

	}
}
