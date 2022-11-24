import java.util.ArrayList;
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
public class N_ary_Tree_Preorder_Traversal {
    public List<Integer> preorder(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();// use linkedlist to add element to the head

        if(root == null) return output;// if root is null, return empty list

        stack.add(root);// add root to the stack

        while(!stack.isEmpty()){
            Node node = stack.pollLast();// get the last element from the stack
            output.add(node.val);
            Collections.reverse(node.children);// reverse the children list
            for(Node child: node.children){
                stack.add(child);
            }
        }

        return output;
    }
}
