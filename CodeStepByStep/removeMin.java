/*
Jeremy Ward - AD325 Winter
Write a method removeMin that accepts a Stack of integers as a parameter and removes and returns the smallest value from the stack.

Your methods should remove all instances of the minimum value from the stack.

You may use an auxiliary stack, but otherwise should use only primitive Java variables. You may not solve the problem recursively.
*/
public int removeMin(Stack incomingStack) {
    Stack<Integer> tempStack = new Stack<Integer>();
    int minVal = (int)incomingStack.peek();
    while (!incomingStack.isEmpty()) {
        if ((int)incomingStack.peek() <= minVal) {
            minVal = (int)incomingStack.pop();
            tempStack.push(minVal);
        }
        else {
            tempStack.push((int)incomingStack.pop());
        }
    }
    while(!tempStack.isEmpty()) {
        if (tempStack.peek() != minVal) {
            incomingStack.push(tempStack.pop());
        }
        else {
            tempStack.pop();
        }
    }
    return minVal;
}
