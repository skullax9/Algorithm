package algorithm.chapter04;

public class GQueue<E> {
	private int max;
	private int num;
	private int front;
	private int rear;
	private E[] que;

	public static class EmptyGQueueException extends RuntimeException {
		public EmptyGQueueException() {
		} // 스택이 비어 있음
	}

	public static class OverflowGQueueException extends RuntimeException {
		public OverflowGQueueException() {
		} // 스택이 가득참
	}

	public GQueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = (E[]) new Object[max];
		} catch (OutOfMemoryError error) {
			max = 0;
		}
	}

	public E enque(E e) throws OverflowGQueueException { // 큐에 X push
		if (num >= max) throw new OverflowGQueueException();
		que[rear++] = e;
		num++;
		if (rear == max) rear = 0;
		return que[max++] = e;
	}

	public E deque() throws EmptyGQueueException {
		if (num <= 0) throw new EmptyGQueueException();
		E e = que[front++];
		num--;
		if (front == max) front = 0;
		return e;
	}

	public E peek() throws EmptyGQueueException {
		if (num <= 0) throw new EmptyGQueueException();
		return que[front];
	}

	public int indexOf(E e) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if (que[idx].equals(e)) return idx;
		}
		return -1;
	}

	public int search(E e) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if (que[idx].equals(e)) {
				int count = idx % rear + 1;
				return count;
			}
		}
		return 0;
	}

	public void clear() {
		num = front = rear = 0;
	}

	public int capacity() {
		return max;
	}

	public int size() {
		return num;
	}

	public boolean isEmpty() {
		return num <= 0;
	}

	public boolean isFull() {
		return num >= max;
	}

	public void dump() {
		if (num <= 0) {
			System.out.println("큐가 비어있습니다.");
		} else {
			for (int i = 0; i < num; i++) {
				System.out.print(que[(i + front) % max] + " ");
			}
			System.out.println();
		}
	}
}
