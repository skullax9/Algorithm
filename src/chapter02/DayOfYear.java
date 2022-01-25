package chapter02;

import java.util.Scanner;

public class DayOfYear {

	static int[][] mdays = {
		{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
		{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};

	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}

	static int dayOfYear(int y, int m, int d) {
		int days = d;

		for (int i = 1; i < m; i++) {
			days += mdays[isLeap(y)][i - 1];
		}
		return days;
	}

	static int dayOfYear2(int y, int m, int d) {
		while (--m != 0) {
			d += mdays[isLeap(y)][m - 1];
		}
		return d;
	}

	static int leftDayOfYear(int y, int m, int d) {
		int leftDays = dayOfYear(y, m, d);

		if (isLeap(y) == 1) {
			return 366 - leftDays;
		}

		return 365 - leftDays;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int retry;

		System.out.println("그 해 경과 일수를 구합니다.");

		do {
			System.out.print("년 : ");
			int year = sc.nextInt();
			System.out.print("월 : ");
			int month = sc.nextInt();
			System.out.print("일 : ");
			int day = sc.nextInt();

			System.out.printf("그 해 %d일째입니다. \n", dayOfYear2(year, month, day));
			System.out.printf("남은 일수는 %d일 입니다. \n", leftDayOfYear(year, month, day));

			System.out.print("함 더 고? (1:예/2:아니오)");
			retry = sc.nextInt();
		} while (retry == 1);
	}

}
