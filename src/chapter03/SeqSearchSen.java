package chapter03;

import java.util.Scanner;

public class SeqSearchSen {
	static int seqSearchSen(int[] a, int n, int key) {
		System.out.print("   |");
		for (int k = 0; k < n; k++)
			System.out.printf("%4d", k);
		System.out.println();

		System.out.print("---+");
		for (int k = 0; k < 4 * n + 2; k++)
			System.out.print("-");
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.print("   |");
			System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
			System.out.printf("%3d|", i);
			for (int k = 0; k < n; k++)
				System.out.printf("%4d", a[k]);
			System.out.println("\n   |");
			if (a[i] == key)
				return i; // 검색성공
		}
		return -1; // 검색실패
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("요솟수: ");
		int num = sc.nextInt();
		int[] x = new int[num + 1];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}

		System.out.print("검색할 값: ");
		int ky = sc.nextInt();

		int idx = seqSearchSen(x, num, ky);

		if (idx == -1) System.out.println("그 값의 요소가 없습니다.");
		else System.out.println(ky + "는 x[" + idx + "]에 있습니다.");
	}
}
