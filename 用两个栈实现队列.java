class CQueue {
    //记得改size
    //push pop is Empty 后均有()
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    int size;
    public CQueue() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
        size = 0;


    }
    
    public void appendTail(int value) {
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack1.push(value);
        while(!stack2.isEmpty()){

            stack1.push(stack2.pop());
        }
        size++;
    }
    
    public int deleteHead() {
        if(stack1.isEmpty()){
            return -1;
        }
        size--;
        return stack1.pop();
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */