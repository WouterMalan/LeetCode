/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Binary_Tree_Inorder_Traversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> output = new ArrayList<>();

        if(root ==  null) return output;

        TreeNode curr = root;

        while(curr != null || !stack.isEmpty()){
            while(curr != null){// go to the left most node
                stack.push(curr);// push all the left nodes to the stack
                curr = curr.left;// go to the left node of the current node     
            }
            curr = stack.pop();// pop the left most node from the stack
            output.add(curr.val);// add the value of the left most node to the output
            curr = curr.right;// go to the right node of the left most node

        }
        return output;
    }
}
