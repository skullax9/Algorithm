package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class QuickSort {
	public static void quickSort(int[] arr, int start, int end) {
		if (start >= end) return;
		int pivot = start;

		int left = start + 1;
		int right = end;

		while (left <= right) {
			while (left <= end && arr[left] <= arr[pivot]) left++;
			while (right > start && arr[right] >= arr[pivot]) right--;

			if (left > right) {
				int temp = arr[pivot];
				arr[pivot] = arr[right];
				arr[right] = temp;
			} else {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}
		quickSort(arr, start, right - 1);
		quickSort(arr, right + 1, end);
	}


	public static void main(String[] args) {
		int[] array = {5,7,9,0,3,1,6,2,4,8};

		quickSort(array, 0, array.length - 1);

		for (int i : array) {
			System.out.println(i);
		}

	}
}
