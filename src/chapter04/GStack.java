package chapter04;

import java.lang.reflect.Array;

public class GStack<E> {
	private int max;
	private int ptr;
	private E[] stk;

	public static class EmptyGStackException extends RuntimeException {
		public EmptyGStackException() {
		} // 스택이 비어 있음
	}

	public static class OverflowGStackException extends RuntimeException {
		public OverflowGStackException() {
		} // 스택이 가득참
	}

	public GStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = (E[]) new Object[max];
		} catch (OutOfMemoryError error) {
			max = 0;
		}
	}

	public E push(E e) throws OverflowGStackException { // 스택에 X push
		if (ptr >= max) throw new OverflowGStackException();
		return stk[ptr++] = e;
	}

	public E pop() throws EmptyGStackException {
		if (ptr <= 0) throw new EmptyGStackException();
		return stk[--ptr];
	}

	public E peek() throws EmptyGStackException {
		if (ptr <= 0) throw new EmptyGStackException();
		return stk[ptr - 1];
	}

	public int indexOf(int x) {
		for (int i = ptr - 1; i >= 0; i--) {
			if (stk[i].equals(x)) return i;
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
