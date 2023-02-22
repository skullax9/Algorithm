package binarysearch;

import java.util.HashSet;
import java.util.Scanner;

public class FindPartBySet {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < n; i++) {
			set.add(scanner.nextInt());
		}

		int m = scanner.nextInt();
		int[] target = new int[m];

		for (int i = 0; i < m; i++) {
			if (set.contains(target[i])) {
				System.out.print("yes ");
			} else {
				System.out.print("no ");
			}
		}

	}
}
