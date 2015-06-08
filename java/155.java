class MinStack {
	private Stack<Integer> minValues = new Stack<Integer>();
	private Stack<Integer> myStack = new Stack<Integer>();
	    public void push(int x) {
		    myStack.push(x);
		    if (minValues.isEmpty() || x <= minValues.peek()) minValues.push(x);
	    }

	    public void pop() {
	        if(myStack.peek() <= minValues.peek()) minValues.pop();
	        myStack.pop();
	    }

	    public int top() {
	        return myStack.peek();
	    }

	    public int getMin() {
	        return minValues.peek();
	    }
}