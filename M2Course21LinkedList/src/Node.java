
public class Node<E> {
  private E value; // first value with any type of element (String, int etc)
  private Node<E> next; //node to the next element
 
  public Node(E value, Node<E> next) { //constructor
    this.value = value;
    this.next = next;
  }
 
  public Node(E value) { // constructor
    this(value, null);
  }
 
  public Node() {} //constructor
 
  public void value(E value) { // setter
    this.value = value;
  }
 
  public E value() { // getter
    return value;
  }
 
  public Node<E> next() { //getter for node - returning the next element
    return next;
  }
 
  public void next(Node<E> next) { // setter - setting the next element
    this.next = next;
  }
}