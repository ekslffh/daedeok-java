package sec03.exam01;

// rear로 들어가고 front로 나온다.
public class Queue {
	
	int front = 0;
	int rear = 0;
	String[] queue = new String[10];
	
	public void push(String data) {
		if (rear >= queue.length) {
			System.out.println("queue overflow");
			return;
		}
		queue[rear++] = data;
	}
	
	public String pop() {
		if ((front == rear) || (front >= queue.length)) {
			System.out.println("queue underflow");
			System.exit(0);
		}
		return queue[front++];
	}
	
	public boolean isEmpty() {
		if ((front == rear) || (front >= queue.length)) {
			return true;
		}
		return false;
	}

}
