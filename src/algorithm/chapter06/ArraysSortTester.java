package algorithm.chapter06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArraysSortTester {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("요솟수 : ");
		int num = Integer.parseInt(br.readLine());

		int[] x = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(x);

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < x.length; i++) {
			System.out.println("x[" + i + "] : " + x[i]);
		}
	}
}
