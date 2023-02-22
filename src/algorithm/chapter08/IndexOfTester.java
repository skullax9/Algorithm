package algorithm.chapter08;

import java.util.Scanner;

public class IndexOfTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("텍스트 : ");
		String text = sc.next();

		System.out.print("패턴 : ");
		String pattern = sc.next();

		int idx1 = text.indexOf(pattern);
		int idx2 = text.lastIndexOf(pattern);

		if (idx1 == -1) System.out.println("텍스트 안에 패턴이 없습니다.");
		else {
			int len1 = 0;
			for (int i = 0; i < idx1; i++) {
				len1 += text.substring(i, i + 1).getBytes().length;
			}
			len1 += pattern.length();

			int len2 = 0;
			for (int i = 0; i < idx2; i++) {
				len2 += text.substring(i, i + 1).getBytes().length;
			}
			len2 += pattern.length();

			System.out.println("텍스트 : " + text);
			System.out.printf(String.format("패턴 : %%%ds\n",len1),pattern);
			System.out.println("텍스트 : " + text);
			System.out.printf(String.format("패턴 : %%%ds\n",len2),pattern);
		}
	}
}
