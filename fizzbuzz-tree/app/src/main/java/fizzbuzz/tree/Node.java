package fizzbuzz-tree.;

public class Node {
  public Integer value;
  public Node left ;
  public Node right ;



  public Node(Integer value) {
    this.value = value;
  }



  public Node() {

  }

  public Node(Integer value, Node left, Node right) {
    this.value = value;
    this.left = left;
    this.right = right;
  }

}

