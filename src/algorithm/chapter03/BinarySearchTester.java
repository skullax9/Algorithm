package algorithm.chapter03;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int[] x = new int[num];

		System.out.println("오름차순으로 입력하세요.");

		System.out.print("x[0] : ");
		x[0] = sc.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "] : ");
				x[i] = sc.nextInt();
			} while (x[i] < x[i - 1]);
		}

		System.out.print("검색할 값 : ");
		int key = sc.nextInt();

		int idx = Arrays.binarySearch(x, key);

		if (idx < 0) System.out.println("해당 요소 없음! 삽입 포인트(인덱스) : " + (idx + 1) * -1);
		else System.out.println(key + "는 x[" + idx + "]에 있습니다.");
	}
}
