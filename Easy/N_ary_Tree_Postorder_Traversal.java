import java.util.*;

import org.w3c.dom.Node;

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
public class N_ary_Tree_Postorder_Traversal {
    public List<Integer> postorder(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();// use linkedlist to add element to the head

        if(root == null) return output;// if root is null, return empty list

        stack.add(root);// add root to the stack

        while(!stack.isEmpty()){
            Node node = stack.pollLast();// get the last element from the stack
            output.addFirst(node.val);
            for(Node child: node.children){
                stack.add(child);
            }
        }

        return output;
    }

//another method
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {// base case 
            return result;
        }
        Stack<Node> stack = new Stack<>();// use stack to store the nodes
        stack.push(root);// push the root node into the stack
        while (!stack.isEmpty()) {// while the stack is not empty
            Node node = stack.pop();// pop the node from the stack and add it to the result
            result.add(node.val);// add the node to the result
            for (Node child : node.children) {// push the children of the node into the stack 
                stack.push(child);
            }
        }
        Collections.reverse(result);// reverse the result to get the postorder traversal
        return result;
    }
}
