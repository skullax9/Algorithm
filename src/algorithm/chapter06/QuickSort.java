package algorithm.chapter06;

import algorithm.chapter04.IntStack;

import java.util.Scanner;

public class QuickSort {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	static void quickSort(int[] a, int left, int right) { // 좌우 매개변수 입력값 받기
		int pl = left;
		int pr = right;
		int x = a[(pl + pr) / 2];

//        System.out.printf("a[%d] ~ a[%d] : {",left, right); //피벗 기준 좌우 그룹화 출력↓↓↓↓
//        for (int i = left; i < right; i++) {
//            System.out.printf("%d ", a[i]);
//        }
//        System.out.printf("%d}\n" , a[right]); // ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

		do {
			while (a[pl] < x) pl++;
			while (a[pr] > x) pr--;
			if (pl <= pr) swap(a, pl++, pr--);
		} while (pl <= pr);

		if (left < pr) quickSort(a, left, pr);
		if (pl < right) quickSort(a, pl, right);
	}

	static void quickSort1(int[] a, int n) { // 배열 a의 요솟수 n 입력받기
		int left = 0;
		int right = n - 1;

		int pl = left;
		int pr = right;
		int x = a[(pl + pr) / 2];

		do {
			while (a[pl] < x) pl++;
			while (a[pr] > x) pr--;
			if (pl <= pr) swap(a, pl++, pr--);
		} while (pl <= pr);

		if (left < pr) quickSort1(a, pr);
		if (pl <= right) quickSort1(a, pl);
	}

	static void quickSort2(int[] a, int left, int right) {
		IntStack lstack = new IntStack(right - left + 1);
		IntStack rstack = new IntStack(right - left + 1);

		lstack.push(left);
		lstack.push(right);

		while (!lstack.isEmpty()) {
			int pl = left = lstack.pop();
			int pr = right = rstack.pop();
			int x = a[(left + right) / 2];

			do {
				while (a[pl] < x) pl++;
				while (a[pr] > x) pr--;
				if (pl <= pr) swap(a, pl++, pr--);
			} while (pl <= pr);

			if (left < pr) {
				lstack.push(left);
				rstack.push(pr);
			}

			if (pl < right) {
				lstack.push(pl);
				rstack.push(right);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("퀵 정렬");
		System.out.print("요솟수 : ");
		int nx = sc.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}

		quickSort(x, 0, nx - 1);

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "] : " + x[i]);
		}

	}
}
