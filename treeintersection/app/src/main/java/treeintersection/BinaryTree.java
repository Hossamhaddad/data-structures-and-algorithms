package treeintersection;

import sun.misc.Queue;


import java.util.ArrayList;
import java.util.List;

public class BinaryTree <T> {
  Node<T> root;
  List <Integer> preOrderList=new ArrayList<>();
  List <Integer> inOrderList=new ArrayList<>();
  List <Integer> postOrderList=new ArrayList<>();
  Integer sum=0;
  public BinaryTree(Node root) {
    this.root = root;
  }
  public BinaryTree() {

  }
  public List preOrder(Node node) {

preOrderList.add((Integer) node.value);
 if(node.left!=null){
   preOrder(node.left);
 }
  if(node.right!=null){
    preOrder(node.right);
  }

return preOrderList;
}
public List inOrder(Node node){

    if(node.left!=null){
      inOrder(node.left);
    }
    inOrderList.add((Integer) node.value);
    if(node.right!=null){
      inOrder(node.right);
    }

return inOrderList;
}

  public List postOrder(Node node){
  if(node.left!=null){
  postOrder(node.left);

  }
    if(node.right!=null){
      postOrder(node.right);
    }
    postOrderList.add((Integer) node.value);
    return postOrderList;
  }
//  public List BreadthFirst(Node root){
//    List <Integer> breadthFirst=new ArrayList<>();
//    Queue<Node> breadth=new Queue<>();
//    breadth.enqueue(root);
//    while (!breadth.isEmpty()){
//      Node front=breadth.dequeue();
//      breadthFirst.add((Integer) front.value);
//      if(front.left!=null){
//        breadth.enqueue(front.left);
//      }
//      if(front.right!=null){
//        breadth.enqueue(front.right);
//      }
//    }
//  return breadthFirst;
//    }


//    public int maxValue(){
//      if(root == null){
//        return 0;
//      }
//      Queue<Node> queue = new Queue<>();
//      queue.enqueue(root);
//      int max = -1;
//      while(!queue.isEmpty()) {
//        Node temp = queue.dequeue();
//        if((Integer)temp.value > max)
//          max = (Integer) temp.value;
//        if(temp.left != null)
//          queue.enqueue(temp.left);
//        if(temp.right != null)
//          queue.enqueue(temp.right);
//      }
//
//      return max;
//    }

  public Integer suM(Node node) {
    if((Integer) node.value%2!=0){
sum+=(Integer) node.value;

    }
    if(node.left!=null){
      if((Integer) node.left.value%2!=0){
        sum+=(Integer) node.left.value;
      }
      preOrder(node.left);
    }
    if(node.right!=null){
      if((Integer) node.right.value%2!=0){
        sum+=(Integer) node.right.value;
      }
      preOrder(node.right);
    }
    return sum;
  }
    }

