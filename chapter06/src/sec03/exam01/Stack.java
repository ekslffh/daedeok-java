package sec03.exam01;

public class Stack {
	
	String[] stack = new String[10];
	int top = 0;
	
	public void push(String data) {
		if (top >= stack.length) {
			System.out.println("stack overflow");
			return;
		}
		stack[top++] = data;
	}
	
	public String pop() {
		if (top == 0) {
			System.out.println("stack underflow");
			System.exit(0);
		}
		return stack[--top];
	}
	
	public boolean isEmpty() {
		if (top == 0) {
			return true;
		}
		return false;
	}

}
