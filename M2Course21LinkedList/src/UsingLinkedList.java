
public class UsingLinkedList {
 
  // helper method to create a list from an array of values
  private static Node<Double> makeList(double[] values) {
    Node<Double> head = new Node<>(); // empty node to use as first node
    Node<Double> it = head; // copy reference to empty node
    for (double el : values) { //iterate through list
      Node<Double> newNode = new Node<>(el); // new node which has the value of the el element
      it.next(newNode); // it takes reference from newNode
      it = it.next(); // it takes reference from the next node
    }
    return head.next(); // returns second node (as the first node is an empty one, head.next will be the first elem in values which
    					//has the reference to the next element and so on for the entire list; 
  }
 
  // iterate over all elements of a linked list
  public static void iterate(Node<Double> listHead) {
    Node<Double> it = listHead; // The iterator points to the first element in the list
    while (it != null) { // while we have not reached the end of the list
      double crtElement = it.value(); // accessing the element in the Node indicated by the iterator
      System.out.println(crtElement); // for demo purpose: printing the element
      it = it.next(); // updating the iterator to point to the next node
    }
  }
 
  public static void main(String[] args) {
    double[] values = {24.15, 24.15, 3.33, 1.01, 19.30, 16.11};
    Node<Double> list = makeList(values);
    iterate(list);
    double searchKey = 12.45;
    System.out.println("Element " + searchKey + " exists? Answer: " + find(list, searchKey));
  }
  
  private final static double EPS = 0.0000001; // maximum accepted error for comparison

 
  // search for a certain key in a linked list 
  public static boolean find(Node<Double> listHead, double searchKey) {
 
    // using a for loop for iteration
    for (Node<Double> it = listHead; it != null; it = it.next()) {
      if (Math.abs((it.value() - searchKey)) < EPS) { // comparing 2 double values
        return true;
      }
    }
    return false;
  }
}