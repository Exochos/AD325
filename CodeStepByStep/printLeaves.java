/*
Write a method named printLeaves that outputs the leaves of a binary tree of integers from right to left. 
Your method accepts as its parameter a TreeNode that refers to the root of the tree. 
*/
public void printLeaves(TreeNode root) {
    if(root == null)
        System.out.println("no leaves");
    else {
        System.out.print("leaves: ");
        printLeafs(root);
    }
}

private void printLeafs(TreeNode node) {
    if(node == null)
        return;
        
    if(node.left == null && node.right == null) {
        System.out.print(node.data + " ");
        return;
    }
  
    printLeafs(node.right);
    printLeafs(node.left);
}



