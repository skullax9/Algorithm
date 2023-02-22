package algorithm.chapter04;

import java.util.Scanner;

public class IntStackXTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntStackX s = new IntStackX(64);

		IntStackX.AorB ab = IntStackX.AorB.valueOf(change(sc));

		while (true) {
			System.out.println("현재 데이터 수 : " + s.size(ab) + " / " + s.capacity());
			System.out.print("(1)푸시 (2)팝 (3)피크 (4)덤프 (5)초기화 (6)비었는가? (7)가득찼는가? (8)데이터 검색 (9)스택 변경 (0)종료 : ");
			int menu = sc.nextInt();
			if (menu == 0) break;
			sc.nextLine();
			int x;

			switch (menu) {
				case 1:
					System.out.print("데이터 : ");
					x = sc.nextInt();
					try {
						s.push(ab, x);
					} catch (IntStack.OverflowIntStackException e) {
						System.out.println("스택이 가득 찼습니다.");
					}
					break;
				case 2:
					try {
						x = s.pop(ab);
						System.out.println("팝한 데이터는 " + x + "입니다.");
					} catch (IntStack.EmptyIntStackException e) {
						System.out.println("스택이 비어있습니다.");
					}
					break;
				case 3:
					try {
						x = s.peek(ab);
						System.out.println("피크한 데이터는 " + x + "입니다.");
					} catch (IntStack.EmptyIntStackException e) {
						System.out.println("스택이 비어있습니다.");
					}
					break;
				case 4:
					s.dump(ab);
					break;
				case 5:
					s.clear(ab);
					System.out.println("데이터가 초기화 되었습니다.");
					break;
				case 6:
					boolean isEmpty = s.isEmpty(ab);
					System.out.println(isEmpty ? "비어있습니다." : "비어있지 않습니다.");
					break;
				case 7:
					boolean isFull = s.isFull();
					System.out.println(isFull ? "가득 차있습니다." : "가득 차있지 않습니다.");
					break;
				case 8:
					System.out.print("검색할 데이터 : ");
					x = sc.nextInt();
					int index = s.indexOf(ab, x);
					System.out.println(index != -1 ? "해당 데이터는 " + index + "에 있습니다." : "데이터가 존재하지 않습니다.");
				case 9:
					change(sc);
			}
		}
	}

	public static String change(Scanner sc) {
		boolean change = true;
		String AB = "";
		while (change) {
			System.out.print("어떤 스택? (StackA / StackB) : ");
			AB = sc.nextLine();
			if (AB.equals("StackA") || AB.equals("StackB")) change = false;
		}
		return AB;
	}
}
