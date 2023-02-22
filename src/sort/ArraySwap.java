package sort;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySwap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		int[] A = new int[N];
		int[] B = new int[N];

		int count = 0;

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}

		Arrays.sort(A);
		Arrays.sort(B);

		for (int i = 0; i < K; i++) {
			if (A[i] < B[N-(i+1)]) {
				A[i] = B[N-(i+1)];
			}
		}

		for (int i : A) {
			count+=i;
		}

		System.out.println(count);

	}
}
