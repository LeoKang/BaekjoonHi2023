package q10845_1;

public class SJQueue {
	private int[] ar;
	private int front;
	private int back;

	public SJQueue(int size) {
		ar = new int[size];
		front = -1;
		back = -1;
	}

	public void push(int x) {
		if (front == -1 && back == -1) {
			ar[++back] = x;
			front++;
		} else {
			ar[++back] = x;
		}

	}

	public void pop() {
		if (back - front + 1 == 0) {
			System.out.println("-1");
		} else {
			System.out.println(ar[front++]);
		}
	}

	public void size() {
		System.out.println(back - front + 1);
	}

	public void empty() {
		if (back - front + 1 == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

	public void front() {
		System.out.println(front + 1);
	}

	public void back() {
		System.out.println(back + 1);
	}
}
