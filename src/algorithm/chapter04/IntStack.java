package algorithm.chapter04;

public class IntStack {
	private int max; // 스택 용량
	private int ptr; // 스택 포인터
	private int ptr2; // 스택 포인터
	private int[] stk; // 스택 본체

	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {
		} // 스택이 비어 있음
	}

	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {
		} // 스택이 가득참
	}

	public IntStack(int capacity) { // 생성자
		ptr = 0;
		ptr2 = capacity - 1;
		max = capacity;
		try {
			stk = new int[max]; // 스택 본체용 배열 생성
		} catch (OutOfMemoryError E) { // 생성 예외처리
			max = 0;
		}
	}

	public int push(int x) throws OverflowIntStackException { // 스택에 X push
		if (ptr >= max) throw new OverflowIntStackException(); // 스택이 가득 참
		return stk[ptr++] = x;
	}

	public int rpush(int x) throws OverflowIntStackException { // 스택에 X push
		return stk[63] = 56;
	}

	public int pop() throws EmptyIntStackException { // 스택에서 데이터 pop (정상에 있는 데이터)
		if (ptr <= 0) throw new EmptyIntStackException(); // 스택이 비어있음
		return stk[--ptr];
	}

	public int peek() throws EmptyIntStackException { // 스택에서 데이터를 peek (정상에 있는 데이터를 들여다봄)
		if (ptr <= 0) throw new EmptyIntStackException(); //스택이 비어있음
		return stk[ptr - 1];
	}

	public int indexOf(int x) {
		for (int i = ptr - 1; i >= 0; i--) {
			if (stk[i] == x) return i;
		}
		return -1;
	}

	public void clear() {
		ptr = 0;
	}

	public int capacity() {
		return max;
	}

	public int size() {
		return ptr;
	}

	public boolean isEmpty() {
		return ptr <= 0;
	}

	public boolean isFull() {
		return ptr >= max;
	}

	public void dump() {
		if (ptr <= 0) System.out.println("스택이 비어 있습니다.");
		else {
			for (int i = 0; i < ptr; i++) {
				System.out.println(stk[i] + " ");
			}
		}
	}
}
