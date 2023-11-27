//3. Write program to implement linear queue in which front and rear starts at 0.

public class Queue {
	private int arr[];
	private int front;
	private int rear;
	private final int SIZE;
	
	public Queue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = rear = 0;
	}
	
	public void push(int value) {
		arr[rear] = value;
		rear++;
	}
	
	public int pop() {
		int value = arr[front];
		front++;
		return value;
	}
	
	public int peek() {
		return arr[front];
	}
	
	public boolean isEmpty() {
		return front==rear;
	}
	
	public boolean isFull() {
		return rear==SIZE;
	}
}
