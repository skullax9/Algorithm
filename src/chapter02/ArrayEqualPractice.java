package chapter02;

import java.util.Random;
import java.util.Scanner;

public class ArrayEqualPractice {

	static void copy(int[] a, int[] b) {
		for (int i = 0; i < b.length; i++) {
			a[i] = b[i];
		}
	}

	static void rcopy(int[] a, int[] b) {
		for (int i = 0; i < b.length; i++) {
			a[i] = b[b.length - i - 1];
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int num = sc.nextInt();
		int[] b = new int[num];

		for (int i = 0; i < b.length; i++) {
			b[i] = rd.nextInt(10);
			System.out.print(b[i] + " ");
		}
		System.out.print("\n");

		int[] a = new int[num];

		copy(a, b);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("\n");

		rcopy(a, b);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
