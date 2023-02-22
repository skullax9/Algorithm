package prime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ErastothenesSieve {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		boolean[] arr = new boolean[N + 1];
		List<Integer> prime = new ArrayList<>();

		makePrime(arr , N);

		for (int i = 0; i < arr.length; i++) {
			if (!arr[i]) prime.add(i);
		}

		for (int i : prime) {
			System.out.println(i);
		}
	}
	
	
	public static void makePrime(boolean[] arr,int N) {
		if (N < 2) return;

		arr[0] = arr[1] = true;
		
		for (int i = 2; i <= Math.sqrt(N); i++) {
			if (arr[i]) continue;

			for (int j = i * i; j < arr.length; j = j + i) {
				arr[j] = true;
			}
		}
	}
}
