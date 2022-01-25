package chapter01;

import java.util.Scanner;

public class TriangleLB {

	static void triangleLB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void triangleLU(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void triangleRU(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 2; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= n - i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void triangleRB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void spira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (i - 1) * 2 + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void npira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (i - 1) * 2 + 1; k++) {
				System.out.print(i % 10);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 5;

//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j<b; i++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        System.out.println(a + b);

//        triangleLB(n);
//        triangleLU(n);
		triangleRU(n);
		triangleRB(n);
		spira(n);
		npira(n);
//
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
	}
}
