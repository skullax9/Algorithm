package dfsbfs;

import java.util.Stack;

public class StakExample {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();

		stack.push(5); // 값 삽입
		stack.push(2);
		stack.push(3);
		stack.push(7);
		stack.pop();         // 마지막에 넣은 값 꺼내기
		stack.push(1);
		stack.push(4);
		stack.pop();
		stack.peek();        // 제일 마지막 값 꺼내기
		stack.clear();       // 스택 초기화
		stack.empty();       // 스택이 비었는가 check
		stack.contains(1);   // 스택에 1이 포함 되었는가 check
		stack.size();        // 스택의 사이즈
		
	}
}
