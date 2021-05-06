package HomeWork;

public class MergeTwoLinkedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		if(l1 == null && l2 == null){
			return null;
		}
		if(l2 == null){
			return l1;
		}
		if(l1 == null){
			return l2;
		}

		ListNode toReturn = new ListNode(0);
		ListNode newHead = toReturn;

		while(l1 != null && l2 != null){
			if(l1.val < l2.val){
				newHead.next = l1;
				l1 = l1.next;
			} else{
				newHead.next = l2;
				l2 = l2.next;
			}
			newHead = newHead.next;

		}

		if(l1 == null){
			newHead.next = l2;
		} 

		if(l2 == null){
			newHead.next = l1;
		}

		return toReturn.next;
	}

}

