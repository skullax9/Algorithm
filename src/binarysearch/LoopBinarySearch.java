package binarysearch;

import java.util.Scanner;

public class LoopBinarySearch {
	public static int binary_search(int[] array, int target, int start, int end) {
		while (start <= end) {
			int mid = (start + end) / 2;

			if (array[mid] == target) {
				return mid;
			} else if (array[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 요솟수 : ");
		int n = sc.nextInt();
		System.out.print("찾고자 하는 수 : ");
		int target = sc.nextInt();

		int[] array= new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		int result = binary_search(array, target, 0, n - 1);

		if (result == -1) {
			System.out.println("찾는 요소가 없습니다.");
		} else {
			System.out.println("index : " + result + ", 몇 번째 ? " + (result + 1));
		}
	}
}
