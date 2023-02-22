package binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MakingRiceCake {
	public static int binary_search(int[] arr, int target, int start, int end){
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		ArrayList<Integer> arr = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			arr.add(sc.nextInt());
		}

		Collections.sort(arr);



	}
}
