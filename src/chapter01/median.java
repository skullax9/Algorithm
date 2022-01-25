package chapter01;

import java.util.Scanner;

public class median {

	static int med3(int a, int b, int c) {
		if (a >= b) {
			if (b >= c) {
				return b;
			} else if (a <= c) {
				return a;
			} else {
				return c;
			}
		} else if (a > c) {
			return a;
		} else if (b > c) {
			return c;
		} else {
			return b;
		}
	}

	public static void main(String[] args) {
		System.out.println("세 정수의 중앙값은 " + med3(3, 2, 1) + "입니다.");
		System.out.println("세 정수의 중앙값은 " + med3(3, 1, 1) + "입니다.");
		System.out.println("세 정수의 중앙값은 " + med3(3, 1, 2) + "입니다.");
		System.out.println("세 정수의 중앙값은 " + med3(3, 1, 3) + "입니다.");
		System.out.println("세 정수의 중앙값은 " + med3(2, 1, 3) + "입니다.");
		System.out.println("세 정수의 중앙값은 " + med3(3, 3, 2) + "입니다.");
		System.out.println("세 정수의 중앙값은 " + med3(3, 3, 3) + "입니다.");
		System.out.println("세 정수의 중앙값은 " + med3(2, 2, 3) + "입니다.");
		System.out.println("세 정수의 중앙값은 " + med3(2, 3, 1) + "입니다.");
		System.out.println("세 정수의 중앙값은 " + med3(2, 3, 2) + "입니다.");
		System.out.println("세 정수의 중앙값은 " + med3(1, 3, 2) + "입니다.");
		System.out.println("세 정수의 중앙값은 " + med3(1, 2, 3) + "입니다.");
		System.out.println("세 정수의 중앙값은 " + med3(2, 3, 3) + "입니다.");
	}

}
