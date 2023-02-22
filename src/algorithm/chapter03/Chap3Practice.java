package algorithm.chapter03;

import java.util.Arrays;
import java.util.Scanner;

public class Chap3Practice {

	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int count = 0;

		for (int i = 0; i < n; i++) {
			if (a[i] == key) {
				idx[count] = i;
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[] array = new int[num];

		for (int i = 0; i < num; i++) {
			array[i] = sc.nextInt();
		}

//        int key = sc.nextInt();
//        int[] idx = new int[num];
//
//        int count = searchIdx(array,num,key,idx);
//
//        System.out.println(count);
		System.out.println("정렬 전");
		for (int i = 0; i < num; i++) {
			System.out.print(array[i] + " ");
		}


		int key = sc.nextInt();
		Arrays.sort(array);

		System.out.println("정렬 후");
		for (int i = 0; i < num; i++) {
			System.out.print(array[i] + " ");
		}

	}
}
