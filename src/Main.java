import data.structure.Stack;
import data.structure.linked.stack.LinkedStack;

public class Main {

	public static void main(String[] args) {
		Stack st = new Stack(5);
		st.push(45);
		st.push(4);
		st.push(5);
		st.push(6);
		st.push(1);
		st.prinStack();
		System.out.println();
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		LinkedStack obj = new LinkedStack();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		obj.push(16);

		obj.push(7);
		System.out.println("Top element is " + obj.peek());
		///////////////////////
		obj.display();
		////////////////////
		obj.pop();
		obj.pop();
		System.out.println("Top element is " + obj.peek());
		///////////////////
		obj.display();

	}

}
