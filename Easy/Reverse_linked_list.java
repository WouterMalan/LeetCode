package Easy;

/* 
* Definition for singly-linked list.
* public class ListNode {
*     int val;
*     ListNode next;
*     ListNode() {}
*     ListNode(int val) { this.val = val; }
*     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
* }
*/
public class Reverse_linked_list {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;// previous node of the current node
        while (head != null) {
            ListNode next = head.next;// next node of the current node 
            head.next = prev;// reverse the current node
            prev = head;// move the previous node to the current node
            head = next;// move the current node to the next node
        }
        return prev;
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {//  if the list is empty or has only one node
            return head;
        }
        ListNode p = reverseList(head.next);
        head.next.next = head;// reverse the current node and connect it to the reversed list 
        head.next = null;// set the next node of the current node to null 
        return p;
    }

    //for practice 
    public ListNode reverseList(ListNode head) {
        ListNode prev=  null;

        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
