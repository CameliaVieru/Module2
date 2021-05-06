package HomeWork;

public class RotateLinkedList {
	 public ListNode rotateRight(ListNode head, int k) {
	        	//counter to check sieze
		        int counter = 1;
		        
		        if(head == null || k == 0){
		           return head;
		        }
		        
		        ListNode it = head;
		        //rotate list
		        while(it.next != null){
		            it = it.next;
		            counter++;
		        }
		        it.next = head;
		        //we see where the list should be broken -> at position
		        k = k % counter;
		        int position = counter - k;
		        // it back at the head to iterate again for breaking;
		        it = head;
		        counter = 1;
		        
		        // when we reach counter == position, the iteration stops and it -> position;
		        while(counter < position){
		            it = it.next;
		            counter++;
		        }
		        // new node to return the first element -> which would be the next element after iteration stops
		        ListNode toReturn = it.next;
		        // the element before toReturn will be the end of the list. So - toReturn va indica catre elementul imediat urmator al lui it
		        // iar legatura dintre it si toReturn se va rupe, iar it.next va trimite astfel catre null. ToReturn - head, it.next - null;
		        it.next = null;
		        
		        return toReturn;
		    }
}
