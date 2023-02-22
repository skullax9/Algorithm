package implematation;

import java.util.Scanner;

public class KnightOfKingdom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String location = sc.nextLine();                // 현재 위치 입력 받기

		int column = location.charAt(0) - 'a' + 1;      // 소문자 순서대로 치환
		int row = location.charAt(1) - '0';             // 숫자 문자열을 정수형으로 변환

		int[] dx = {-1, -2, -2, -1, 1, 2, 2, 1};        // x 좌표에서 움직일 수 있는 범위
		int[] dy = {-2, -1, 1, 2, 2, 1, -1, -2};        // y 좌표에서 움직일 수 있는 범위

		int result = 0;                                 // 현 위치에서 움직일 수 있는 공간 수

		for (int i = 0; i < 8; i++) {
			int nextColumn = column + dy[i];            // 움직인 y 좌표
			int nextRow = row + dx[i];                  // 움직인 x 좌표

			if (nextRow > 0 && nextRow < 9              
				&& nextColumn > 0 && nextColumn < 9) {  // 움직인 곳이 범위(8 X 8) 내에 있다면
				result++;                               // 움직일 수 있는 공간 + 1;
			}
		}

		System.out.println(result);                     // 정답 출력
	}
}
