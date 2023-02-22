package implematation;

import java.util.Scanner;

public class Time {
	static String str(int n) {      // 숫자 -> 문자열 함수 선언
		return String.valueOf(n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();                           // 현재 시(hour) 입력 받기
		int count = 0;                                  // 3이 포함된 시간 갯수
		String time = "";                               // 시간 문자열 초기화

		for (int i = 0; i <= N; i++) {                  // 현재 시
			for (int j = 0; j < 60; j++) {              // 현재 분
				for (int k = 0; k < 60; k++) {          // 현재 초
					time = str(i)+str(j)+str(k);        // 시간 문자열에 변환한 시+분+초 입력
					if (time.contains("3")) count += 1; // 문자열에 3이 포함되면 갯수 +1;
				}
			}
		}

		System.out.println(count);                      // 정답 출력
	}
}
