import java.util.Arrays;

public class MyIntArrayList {
	private int[] elements;
	private int size;
	private int capacity;

	public MyIntArrayList() {
		this(10);
	}

	public MyIntArrayList(int initialCapacity) {
		this.elements = new int[initialCapacity];
		this.capacity = initialCapacity;
	}
	
	public MyIntArrayList(MyIntArrayList c) {
		this.size = c.size;
		elements = new int[size];
		
		for(int i = 0; i < this.size; i++) {
			this.elements[i] = c.elements[i];
		}
	}
	
	public void add(int index, int e) {	
		if (this.size == this.elements.length) {
			this.elements = Arrays.copyOf(this.elements, this.size * 2);
		}

		for(int i = this.size; i > 0; i--) {
			this.elements[i] = this.elements[i-1];
			if(i == index) {
				this.elements[i] = e;
				break;
			}
		}
	}

	public boolean add(int e) {
		if (this.size == this.elements.length) {
			this.elements = Arrays.copyOf(this.elements, this.size * 2);
		}

		this.elements[size] = e;
		this.size++;

		return true;
	}
	
	public boolean contains(int e) {
		for (int i = 0; i < this.size; i++) {
			if(this.elements[i] == e) {
				return true;
			}
		}
		
		return false;
	}
	
	public int get(int index) {
		return this.elements[index];
	}

	public int size() {
		return this.size;
	}

	public int indexOf(int e) {
		for (int i = 0; i < this.size; i++) {
			if (this.elements[i] == e) {
				return i;
			}
		}
		return -1;
	}
	
	public int lastIndexOf(int e) {
		
		for(int i = this.size-1; i >= 0; i--) {
			if(e == this.elements[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean remove(int e) {
		for(int i = 0; i < this.size; i++) {
			if(this.elements[i] == e) {
				for(int j = i; j < this.size-1; j++) {
					this.elements[j] = this.elements[j+1];
				}
				return true;

			}
		}
		return false;
	}

	public int removeElementAtIndex(int index) {
		if (index < 0 || index >= this.size) {
			System.out.println("Throwing IndexOutOfBoundsException when trying to" +
					" remove element at position " + index);
			return -1;
		}

		int removedElement = this.elements[index];
		for (int i = index; i < this.size-1; i++) {
			this.elements[i] = this.elements[i+1];
		}
		this.size--;

		return removedElement;
	}

	public void clear() {
		this.size = 0;
	}

	public int set(int index, int e) {
		if (index < 0 || index >= this.size) {
			System.out.println("Throwing IndexOutOfBoundsException when trying to set" +
					" the element " + e + " at position " + index);
			return -1;
		}

		int replacedElement = this.elements[index];
		this.elements[index] = e;
		return replacedElement;
	}
	
	public boolean addAll(MyIntArrayList c) {
		if(c == null) {
			return false;
		}
		
		if((this.size + c.size) > this.capacity) {
			this.elements = Arrays.copyOf(this.elements, (this.size + c.size)*2);
			this.capacity = (this.size + c.size)*2;
		}
		
		for(int i = 0; i <= c.size; i++) {
			this.elements[size] = c.elements[i];
			this.size++;
		}
		return true;
	}
	
	public boolean addAll(int index, MyIntArrayList c) {
		if(c == null) {
			return false;
		}
		
		if((this.size + c.size) > this.capacity) {
			this.elements = Arrays.copyOf(this.elements, (this.size + c.size)*2);
			this.capacity = (this.size + c.size)*2;
		}
		
		for(int i = 0; i < c.size; i++) {
			add(index, c.elements[i]);
			index++;
			this.size++;
		}
		return true;
	}
	
	public int[] toArray() {
		int[] myArray = new int[this.size];
		
		for(int i = 0; i < this.size; i++) {
			myArray[i] = this.elements[i];
		}
		
		return myArray;
	}
	
	public void ensureCapacity(int minCapacity) {
		if(this.capacity < minCapacity) {
			this.elements = Arrays.copyOf(this.elements, minCapacity);
			this.capacity = minCapacity;
		}
	}
	
	public void display() {
		for(int i = 0; i < this.size; i++) {
			System.out.print(this.elements[i] + " ");
		}
	}
	
	public void trimToSize() {
		this.capacity = this.size;
		this.elements = Arrays.copyOf(this.elements, this.capacity);
		
	}
	
}

