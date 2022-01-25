package chapter01;

import java.util.Scanner;

public class sumForPos {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a, b;

		System.out.print("a val : ");
		a = stdIn.nextInt();

		b = String.valueOf(a).length();

		System.out.println("a length = " + b);

//        int sum = 0;
//
//        System.out.print("a val : ");
//        a = stdIn.nextInt();
//
//        do {
//            System.out.print("b val : ");
//            b = stdIn.nextInt();
//
//            if ( b <= a ) {
//                System.out.println("b must bigger than a");
//            }
//        } while (b <= a);
//
//        sum = b - a;
//
//        System.out.println("b - a val : "+sum);


	}
}
