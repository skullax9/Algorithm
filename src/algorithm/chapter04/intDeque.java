package algorithm.chapter04;

public class intDeque {
	private int max;
	private int front;
	private int rear;
	private int num;
	private int[] que;

	public class EmptyIntDequeException extends RuntimeException {
		public EmptyIntDequeException() {
		}
	}

	public class OverflowIntDequeException extends RuntimeException {
		public OverflowIntDequeException() {
		}
	}

	public intDeque(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}

	public int enqueFront(int x) throws OverflowIntDequeException {
		if (num >= max) throw new OverflowIntDequeException();
		num++;
		if (--front < 0) front = max - 1;
		que[front] = x;
		return x;
	}

	public int enqueRear(int x) throws OverflowIntDequeException {
		if (num >= max) throw new OverflowIntDequeException();
		que[rear++] = x;
		num++;
		if (rear == max) rear = 0;
		return x;
	}

	public int dequeFront() throws EmptyIntDequeException {
		if (num <= 0) throw new OverflowIntDequeException();
		int x = que[front++];
		num--;
		if (front == max) front = 0;
		return x;
	}

	public int dequeRear() throws EmptyIntDequeException {
		if (num <= 0) throw new EmptyIntDequeException();
		num--;
		if (--rear < 0) rear = max - 1;
		return que[rear];
	}

	public int peekFront() throws EmptyIntDequeException {
		if (num <= 0) throw new EmptyIntDequeException();
		return que[front];
	}

	public int peekRear() throws EmptyIntDequeException {
		if (num <= 0) throw new EmptyIntDequeException();
		return que[rear == 0 ? max - 1 : rear - 1];
	}

	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {
			if (que[(i + front) % max] == x) return i + front;
		}
		return -1;
	}

	public int search(int x) {
		for (int i = 0; i < num; i++) {
			if (que[(i + front) % max] == x) return i + 1;
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
			System.out.println("덱이 비어있습니다.");
		} else {
			for (int i = 0; i < num; i++) {
				System.out.print(que[(i + front) % max] + " ");
			}
			System.out.println();
		}
	}

}
