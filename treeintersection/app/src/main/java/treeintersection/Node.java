package treeintersection;

public class Node <T>{
  public T value;
  public Node left ;
  public Node right ;



  public Node(T value) {
    this.value = value;
  }



  public Node() {

  }

  public Node(T value, Node left, Node right) {
    this.value = value;
    this.left = left;
    this.right = right;
  }

}

