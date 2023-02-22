package algorithm.chapter06;

public class SelectionSort {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	static void selectionSort(int[] a, int n) { // 비교횟수는 (n^2 - n) / 2, 불안정 정렬
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
				swap(a, i, min);
			}
		}
	}

	public static void main(String[] args) {

	}
}
