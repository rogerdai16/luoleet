class MyQueue {
    private Stack<Integer> first = new Stack<Integer>();
    private Stack<Integer> second = new Stack<Integer>();
    
    // Push element x to the back of queue.
    public void push(int x) {
        first.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if(second.size() == 0) while(first.size() != 0) second.push(first.pop());
        second.pop();
    }

    // Get the front element.
    public int peek() {
        if(second.size() == 0) while(first.size() != 0) second.push(first.pop());
        return second.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return first.size() == 0 && second.size() == 0;
    }
}