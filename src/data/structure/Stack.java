package data.structure;

import java.util.Iterator;

public class Stack {
	private int top;
	private int arr[];
	private int maxSize ;

	public Stack(int maxSize) {
		top = -1;
		this.maxSize=maxSize;
		arr = new int[maxSize];
		
	}

	public void push(int value) {
		if (top >maxSize)
			System.out.println("Stack is full");
		else {
		++top;
		arr[top] = value;
		}
	}

	public int pop() {
		if (!isEmpty())
			return arr[top--];
		else
			return 0;
	}

	public boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;

	}
	public void prinStack() {
		System.out.print("[");
		for (int i = top; i >= 0; i--) {
			System.out.print(" "+arr[i]);
			
		}
		System.out.print(" ]");
	}
}
