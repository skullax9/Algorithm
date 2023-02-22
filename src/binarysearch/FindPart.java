package binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class FindPart {
	public static int binary_search(int[] arr, int target, int start, int end) {
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
		int[] nums = new int[N];

		for (int i = 0; i < N; i++) {
			nums[i] = sc.nextInt();
		}

		Arrays.sort(nums);

		int M = sc.nextInt();
		int[] targets = new int[M];
		String[] answer = new String[M];

		for (int i = 0; i < M; i++) {
			targets[i] = sc.nextInt();
		}

		for (int i = 0; i < M; i++) {
			int result = binary_search(nums, targets[i], 0, N-1);
			if (result == -1) {
				answer[i] = "no";
			} else {
				answer[i] = "yes";
			}
		}

		for (String s : answer) {
			System.out.print(s + " ");
		}



	}

}
