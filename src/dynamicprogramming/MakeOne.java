package dynamicprogramming;

import java.util.Scanner;

public class MakeOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] table = new int[30001];

		int X = sc.nextInt();

		for (int i = 2; i < X + 1; i++) {
			table[i] = table[i - 1] + 1;

			if (i % 2 == 0) table[i] = Math.min(table[i], table[i / 2] + 1);
			if (i % 3 == 0) table[i] = Math.min(table[i], table[i / 3] + 1);
			if (i % 5 == 0) table[i] = Math.min(table[i], table[i / 5] + 1);
		}

		System.out.println(table[X]);

	}
}
