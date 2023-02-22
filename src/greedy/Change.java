package greedy;

import java.util.Scanner;

public class Change {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();           // 잔돈을 입력받는다.
		int count = 0;                  // 잔돈을 줘야 하는 횟수 0 초기화

		int[] money = {500,100,50,10};  // 거스름돈 유형

		for (int i = 0; i < 4; i++) {
			int coin = money[i];        // 코인 변수 생성 500 -> 100 -> 50 -> 10
			count += N / coin;          // count 변수에 (거스름돈 / 현재 코인 가격)의 몫을 넣는다.
			N %= coin;                  // 입력받은 거스름돈을 현재 코인 가격으로 나눈 나머지로 저장한다 (ex. 1260 % 500 -> N = 260)
		}

		System.out.println(count);      // 거슬러준 횟수 출력
	}

}
