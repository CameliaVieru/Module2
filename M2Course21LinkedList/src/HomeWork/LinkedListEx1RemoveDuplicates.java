package HomeWork;

public class LinkedListEx1RemoveDuplicates {
	public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        
        ListNode aux = head;
        while (aux != null && aux.next != null) {
            if (aux.val == aux.next.val) {
                aux.next = aux.next.next;
            } else {
                aux = aux.next;
            }
        }
        return head;
    }
}
