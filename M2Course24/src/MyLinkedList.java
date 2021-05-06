
public class MyLinkedList<E> {
	private DoubleLinkedListNode<E> head;
	private DoubleLinkedListNode<E> tail;
	public int size;
	
	
	public void addElement(E element) {
		if(this.head == null && this.tail == null) {
			DoubleLinkedListNode<E> node = new DoubleLinkedListNode<E>(element);
			this.tail = node;
			this.head = node;
			this.tail.prev(head);
			this.head.prev(tail);
		} else {
			DoubleLinkedListNode<E> node = new DoubleLinkedListNode<E>(element);
			this.tail.next(node);
			node.prev(tail);
			this.tail = node;
			
		}
		
		this.size++;
	}
	
	public E getElement(int n) {
		if(n > this.size) {
			return null;
		}
		
		DoubleLinkedListNode<E> it = this.head;
		int counter = 0;
		
		while(counter < n) {
			it = it.next();
			counter++;
		}
		return it.value();
	}
	
	public E removeElement(int index) {
		if(index > this.size) {
			return null;
		}
		
		this.size -= 1;
		
		if(index == 0) {
			E value = this.head.value();
			this.head = this.head.next();
			this.head.prev(null);
			return value;
		}
		
		if(index == this.size) {
			E value = this.tail.value();
			this.tail = this.head.prev();
			this.head.next(null);
			return value;
		}
		
		DoubleLinkedListNode<E> it = this.head;
		int counter = 1;
		while(counter < index) {
			it = it.next();
			counter++;
		}
		
		DoubleLinkedListNode<E> aux = it.next();

		it.next(it.next().next());
		it.next().prev(it);
		
		return aux.value();
		
	}

	public DoubleLinkedListNode<E> getHead() {
		return head;
	}

	public void setHead(DoubleLinkedListNode<E> head) {
		this.head = head;
	}
	
}
