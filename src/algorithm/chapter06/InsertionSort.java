package algorithm.chapter06;

import java.util.Scanner;

public class InsertionSort {

	static int binarySearch(int[] a, int key, int lo, int hi) {
		int mid;
		while (lo < hi) {
			mid = lo + ((hi - lo) / 2);

			if (key < a[mid]) {
				hi = mid;
			} else {
				lo = mid + 1;
			}
		}
		return lo;
	}

	static void insertionSort(int[] a, int n) { // 비교 횟수는 n^2/2회. =셔틀정렬, 안정적 정렬, (버블,선택,삽입) 시간복잡도 = O(n^2) 효율↓
		for (int i = 1; i < n; i++) {
			int j;
			int temp = a[i];
			for (j = 1; j > 0 && a[j - 1] > temp; j--) {
				a[j] = a[j - 1];
			}
			a[j] = temp;
		}
	}

	static void binaryInsertionSort(int[] a, int n) { // 이진 삽입 정렬 (시간복잡도 동일), 안정적 정렬
		for (int i = 1; i < n; i++) {
			int temp = a[i];

			int location = binarySearch(a, 0, i, temp);

			int j = i - 1;
			while (j >= location) {
				a[j + 1] = a[j];
				j--;
			}
			a[j] = temp;
		}
	}

	static void sentinelInsertionSort(int[] a, int n) {
		int i, j, temp;
		for (i = 1; i < n; i++) {
			temp = a[i];
			j = i;
			while (a[j - 1] > temp) {
				a[j] = a[j - 1];
				--j;
			}
			a[j] = temp;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("단순 삽입 정렬");
		System.out.print("요솟수 : ");

		int nx = sc.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}

		insertionSort(x, nx);

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] : " + x[i]);
		}

	}
}
