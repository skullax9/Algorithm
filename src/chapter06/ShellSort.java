package chapter06;

import java.util.Scanner;

public class ShellSort {

	static void shellSort(int[] a, int n) {
		for (int h = n / 2; h > 0; h /= 2) {
			for (int i = h; i < n; i++) {
				int j;
				int temp = a[i];
				for (j = i - h; j >= 0 && a[j] > temp; j -= h) {
					a[j + h] = a[j];
				}
				a[j + h] = temp;
			}
		}
	}

	static void shellSort2(int[] a, int n) {
		int h;
		for (h = 1; h < n / 9; h = h * 3 + 1) ;

		for (; h > 0; h /= 3) {
			for (int i = h; i < n; i++) {
				int j;
				int temp = a[i];
				for (j = i - h; j >= 0 && a[j] > temp; j -= h) {
					a[j + h] = a[j];
				}
				a[j + h] = temp;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("셸 정렬(버전 1");
		System.out.print("요솟수 : ");

		int nx = sc.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}

		int[] xx = x.clone();

		shellSort(x, nx);
		System.out.println("오름차순으로 정렬했습니다. V1");

		for (int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "] : " + x[i]);
		}

		shellSort2(xx, nx);
		System.out.println("오름차순으로 정렬했습니다. V2");

		for (int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "] : " + xx[i]);
		}
	}
}
