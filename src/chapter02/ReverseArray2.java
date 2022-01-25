package chapter02;

import java.util.Scanner;

public class ReverseArray2 {
	static int sumOf(int[] a) {
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}

		return sum;
	}

	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	static void reverse(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		for (int i = 0; i < a.length / 2; i++) {
			int idx = a.length - i - 1;
			System.out.println("\na[" + i + "]와 a[" + idx + "]를 교환합니다.");
			swap(a, i, idx);
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j] + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("요솟수 : ");
		int num = sc.nextInt();

		int[] x = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}

		reverse(x);

		System.out.println("\n역순 정렬을 마쳤습니다.");

		System.out.println(sumOf(x));
	}
}
