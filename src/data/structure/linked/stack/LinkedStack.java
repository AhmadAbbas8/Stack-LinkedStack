package data.structure.linked.stack;

public class LinkedStack {
	Node top;

	public LinkedStack() {
		super();
		this.top = null;
	}

	public void push(int value) {
		Node newItem = new Node();
		if (newItem == null)
		{
			System.err.println("Stack push can not allocate memory");
			return;
		}
		else {
			newItem.data = value;
			newItem.link = top;
			top = newItem;
		}
	}
	public void pop() 
    {
       
        if (top == null) {
            System.err.println("Stack pop can not allocate memory");
            return;
        }
 
      
        top = (top).link;
    }
			
	
	boolean isEmpty() {

		return top ==null;
		
	}

	 public int peek()
	    {
	        
	        if (!isEmpty()) {
	            return top.data;
	        }
	        else {
	            System.out.println("Stack is empty");
	            return -1;
	        }
	    }
	 public void display()
	    {
	       
	        if (top == null) {
	            System.err.println(" Stack Underflow");
	            //exit(1);
	        }
	        else {
	            Node temp = top;
	            System.out.print("[ ");
	            while (temp != null) {
	 
	              
	                System.out.print( temp.data+" ");
	 
	               
	                temp = temp.link;
	            }
	            System.out.print("] \n");
	        }
	    }

}
