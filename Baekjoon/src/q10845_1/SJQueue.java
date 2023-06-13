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
		if (front == -1) {
			front++;
			ar[++back] = x;
		} else {
			ar[++back] = x;
		}
	}

	public void pop() {
		if (size() == 0) {
			System.out.println("-1");
		} else if (size() == 1) {
			System.out.println(ar[front++]);
			front = -1;
			back = -1;
		} else {
			System.out.println(ar[front++]);
		}
	}

	public int size() {
		if (front == -1 && back == -1) {
			return 0;
		} else
			return back - front + 1;
	}

	public boolean empty() {
		if (size() == 0) {
			System.out.println("1");
			return true;
		} else {
			System.out.println("0");
			return false;
		}
	}

	public void front() {
		if (size() == 0) {
			System.out.println("-1");
		} else {
			System.out.println(ar[front]);
		}
	}

	public void back() {
		if (size() == 0) {
			System.out.println("-1");
		} else {
			System.out.println(ar[back]);
		}
	}
}
