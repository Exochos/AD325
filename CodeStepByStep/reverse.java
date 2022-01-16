/* Jeremy Ward AD325 Winter
Write a method named reverse that accepts as a parameter a stack of integers and modifies it so that the integers are sorted in reverse order. 
For example, if a queue variable named s stores the following elements:
  front {1, 8, 4, 5, 3, 6} back
Then the call of reverse(s); should modify it to store the following values:

  front {6, 3, 5, 4, 8, 1} back
Constraints: You may use a single queue as auxiliary storage.
*/

public Stack reverse(Stack s) {
        Queue<Integer> q = new LinkedList<Integer>();
        while (!s.isEmpty()) {
            q.add((Integer) s.pop());
        }
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        return s;
    }
