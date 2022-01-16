/*
Jeremy Ward - AD325 Winter
Write a method named isSorted accepts a stack of integers as a parameter and returns true if the elements in the stack occur in ascending (non-decreasing) order
from top to bottom, else false. That is, the smallest element should be on top, growing larger toward the bottom. 
An empty or one-element stack is considered to be sorted. 
For example, if passed the following stack, your method should return true:
bottom {20, 20, 17, 11, 8, 8, 3, 2} top
The following stack is not sorted (the 15 is out of place), so passing it to your method should return a result of false:
bottom {18, 12, 15, 6, 1} top
When your method returns, the stack should be in the same state as when it was passed in. 
In other words, if your method modifies the stack, you must restore it before returning.

Constraints: You may use one queue or one stack (but not both) as auxiliary storage. 
Do not declare any other auxiliary data structures (e.g. arrays, Grids, ArrayLists, etc.), 
but you can have as many simple variables as you like. 
Your solution should run in O(N) time, where N is the number of elements of the stack.
*/

public Boolean isSorted(Stack stack1) {
    
    if (stack1.size() < 2)
        return true;
    
    Stack<Integer> stack2 = new Stack<Integer>();
    boolean sorted = true;
    int temp = (int)stack1.pop();
    stack2.push(temp);
    
    while(!stack1.isEmpty()) {
        int temp2 = (int)stack1.pop();
        if (temp2 < temp) {
            sorted = false;
        }
        temp = temp2;
        stack2.push(temp2);
    }
    while(!stack2.isEmpty()) {
        stack1.push(stack2.pop());
    }
    return sorted;
}
