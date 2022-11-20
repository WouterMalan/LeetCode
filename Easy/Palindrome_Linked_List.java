public class Palindrome_Linked_List {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        slow = reverse(slow);
        fast = head;

        while(slow != null){
            if(slow.val != fast.val){
                return false;
            }
            slow = slow.next;
            
            fast = fast.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode next = null;

        while(head != null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    //another method
    public ListNode isPalindrome2(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        ListNode temp = null;

        while(fast != null && fast.next != null){// find the middle of the list and reverse the first half
            fast = fast.next.next;// fast pointer moves 2 steps
            temp = slow.next;// temp pointer points to the next node of slow pointer
            slow.next = prev;// reverse the first half of the list
            prev = slow;// prev pointer points to the current node of slow pointer
            slow = temp;// slow pointer points to the next node of temp pointer
        }

        if(fast != null){// if the number of nodes is odd, skip the middle node
            slow = slow.next;// slow pointer points to the next node of the middle node
        }

        while(slow != null){// compare the first half and the second half of the list
            if(slow.val != prev.val){// if the values are not equal, return false
                return false;
            }
            slow = slow.next;// slow pointer points to the next node of the second half of the list
            prev = prev.next;// prev pointer points to the next node of the first half of the list
        }
        return true;
    
    }
}
