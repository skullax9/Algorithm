package algorithm.chapter01;

public class max3m {

	static int max3(int a, int b, int c) {
		int max = a;

		if (b > max) max = b;

		if (c > max) max = c;

		return max;
	}

	static int max4(int a, int b, int c, int d) {
		int max = a;

		if (b > max) max = b;

		if (c > max) max = c;

		if (d > max) max = d;

		return max;
	}

	static int min3(int a, int b, int c) {
		int max = a;

		if (b < max) max = b;

		if (c < max) max = c;

		return max;
	}

	static int min4(int a, int b, int c, int d) {
		int max = a;

		if (b < max) max = b;

		if (c < max) max = c;

		if (d < max) max = d;

		return max;
	}

	public static void main(String[] args) {
		System.out.println("a b c中 최댓값은 : " + max3(3, 5, 7));
		System.out.println("a b c d中 최댓값은 : " + max4(3, 5, 7, 11));
		System.out.println("a b c中 최솟값은 : " + min3(3, 5, 7));
		System.out.println("a b c d中 최솟값은 : " + min4(3, 5, 7, 887));

	}

}
