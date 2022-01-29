/* 
Write a method named height that returns the height of a tree.
Your method accepts as its parameter a TreeNode that refers to the root of the tree.
The height is defined to be the number of levels (i.e., the number of nodes along the longest path from the root to a leaf).
The empty tree has height 0, a tree of one node has height 1, a root node with one or two leaves as children has height 2, and so on. 
*/

public int height(TreeNode temp) {
    if (temp == null) {
        return 0;
    }
    else {
        int leftHeight = height(temp.left);
        int rightHeight = height(temp.right);
        if (leftHeight > rightHeight) return leftHeight +1;
        else return rightHeight + 1;
    }
}
