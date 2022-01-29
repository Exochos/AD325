/* 
Write a method named isFull that returns whether or not a binary tree is full (true if it is, false if not). 
Your method accepts as its parameter a TreeNode that refers to the root of the tree.
A full binary tree is one in which every node has 0 or 2 children
*/
public boolean isFull(TreeNode temp) {
    if (temp == null) {
        return true;
    }
    else {
        TreeNode root = temp;
        boolean leftFull = true;
        boolean rightFull = true;
        while(temp.left != null) {
            if (temp.right != null) {
                temp = temp.left;
            }
            else {
                leftFull = false;
                break;
            }
        }
        while (root.right != null) {
            if (root.left != null) {
                root = root.right;
            }
            else {
                rightFull = false;
                break;
            }
        }
        if (leftFull && rightFull) return true;
        else return false;
    }
}
