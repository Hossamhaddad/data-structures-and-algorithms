package treeintersection;


public class BinarySearchTree {
  Node root;


  public BinarySearchTree() {

  }

  public BinarySearchTree(Integer value) {
    this.root.value = value;
  }

  public void add(Integer value) {
    Node newNode = new Node(value);
    Node current;
    Node parent;
    if (root == null) {
      root = newNode;
    } else {
      current = root;
      parent = null;
      while (true) {
        parent = current;
        if (value <(Integer) parent.value) {
          current = current.left;
          if (current == null) {
            parent.left = newNode;
            return;
          }
        } else {
          current = current.right;
          if (current == null) {
            parent.right = newNode;
            return;
          }
        }
      }
    }

  }

  public boolean contains(Integer value) {
    Node current = root;

    while (current != null) {

      if (current.value == value) {
        return true;
      } else if ((Integer)current.value > value) {
        current = current.left;
      } else if ((Integer)current.value < value) {
        current = current.right;
      }
    }
    return false;
  }
}








