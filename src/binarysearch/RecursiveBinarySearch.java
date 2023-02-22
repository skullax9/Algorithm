package binarysearch;

import java.util.Scanner;

public class RecursiveBinarySearch {
	public static int binary_search(int[] array, int target, int start, int end) {
		if (start > end) return -1;
		int mid = (start + end) / 2;

		if (array[mid] == target) return mid;
		else if (array[mid] > target) return binary_search(array, target, start, mid - 1);
		else return binary_search(array, target, mid + 1, end);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int target = sc.nextInt();

		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		int result = binary_search(array, target, 0, n - 1);
		if (result == -1) {
			System.out.println("원소가 존재하지 않습니다.");
		} else {
			System.out.println(result + 1);
		}
	}
}
