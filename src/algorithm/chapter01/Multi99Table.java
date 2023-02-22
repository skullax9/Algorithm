package algorithm.chapter01;

import java.util.Scanner;

public class Multi99Table {
	public static void main(String[] args) {
//        for (int i = 1; i <=9; i++) {
//            for (int j = 1; j <= 9; j++) {
//                System.out.printf("%3d", i * j);
//            }
//            System.out.println();
//        }

//        System.out.print("  |");
//        for (int i =1; i<= 9; i++) {
//            System.out.printf("%3d", i);
//        }
//        System.out.println("\n--+---------------------------");
//        for (int i = 1; i <=9; i++) {
//            System.out.printf("%d |", i);
//            for (int j = 1; j <= 9; j++) {
//                System.out.printf("%3d", i * j);
//            }
//            System.out.println();
//        }

		Scanner sc = new Scanner(System.in);

		int a;
		int b;

		System.out.println("사각형을 출력합니당");

		System.out.print("단 수: ");
		a = sc.nextInt();
		System.out.print("단 수: ");
		b = sc.nextInt();

		for (int i = 1; i <= b; i++) {
			System.out.print("*");
			for (int j = 1; j <= a - 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
