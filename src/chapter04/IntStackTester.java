package chapter04;

import java.util.Scanner;

public class IntStackTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntStack s = new IntStack(64);

		while (true) {
			System.out.println("현재 데이터 수 : " + s.size() + " / " + s.capacity());
			System.out.print("(1)푸시 (2)팝 (3)피크 (4)덤프 (5)초기화 (6)비었는가? (7)가득찼는가? (8)데이터 검색 (0)종료 : ");
			int menu = sc.nextInt();
			if (menu == 0) break;

			int x;
			switch (menu) {
				case 1:
					System.out.print("데이터 : ");
					x = sc.nextInt();
					try {
//                        s.rpush(x);
						s.push(x);
					} catch (IntStack.OverflowIntStackException e) {
						System.out.println("스택이 가득 찼습니다.");
					}
					break;
				case 2:
					try {
						x = s.pop();
						System.out.println("팝한 데이터는 " + x + "입니다.");
					} catch (IntStack.EmptyIntStackException e) {
						System.out.println("스택이 비어있습니다.");
					}
					break;
				case 3:
					try {
						x = s.peek();
						System.out.println("피크한 데이터는 " + x + "입니다.");
					} catch (IntStack.EmptyIntStackException e) {
						System.out.println("스택이 비어있습니다.");
					}
					break;
				case 4:
					s.dump();
					break;
				case 5:
					s.clear();
					System.out.println("데이터가 초기화 되었습니다.");
					break;
				case 6:
					boolean isEmpty = s.isEmpty();
					System.out.println(isEmpty ? "비어있습니다." : "비어있지 않습니다.");
					break;
				case 7:
					boolean isFull = s.isFull();
					System.out.println(isFull ? "가득 차있습니다." : "가득 차있지 않습니다.");
					break;
				case 8:
					System.out.print("검색할 데이터 : ");
					x = sc.nextInt();
					int index = s.indexOf(x);
					System.out.println(index != -1 ? "해당 데이터는 " + index + "에 있습니다." : "데이터가 존재하지 않습니다.");
			}
		}
	}
}
