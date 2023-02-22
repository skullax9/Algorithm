package algorithm.chapter08;

import java.util.Scanner;

public class BFmatch {

	static int bfMatch(String txt, String pattern) {
		int pt = 0;
		int pp = 0;

		while (pt != txt.length() && pp != pattern.length()) {
			if (txt.charAt(pt) == pattern.charAt(pp)) {
				pt++;
				pp++;
			} else {
				pt = pt - pp + 1;
				pp = 0;
			}
		}
		if (pp == pattern.length()) return pt - pp;
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("텍스트 : ");
		String text = sc.next();

		System.out.print("패턴 : ");
		String pattern = sc.next();

		int idx = bfMatch(text, pattern);

		if (idx == -1) System.out.println("텍스트에 패턴이 없습니다.");
		else {
			int len = 0;
			for (int i = 0; i < idx; i++) {
				len += text.substring(i, i + 1).getBytes().length;
			}
			len += pattern.length();

			System.out.println((idx + 1) + "번째 문자(인덱스 "+idx+")부터 일치합니다.");
			System.out.println("텍스트 : " + text);
			System.out.printf(String.format("패턴 : %%%ds\n",len),pattern);
		}
	}

}
