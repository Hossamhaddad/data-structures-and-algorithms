/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package treeintersection;


import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args){
      Node root=new Node<>("5",null,null);
      Node root3=new Node<>("5",root,null);
      BinaryTree first=new BinaryTree(root);
      Node root1=new Node("6",root,null);
      BinaryTree second=new BinaryTree(root1);
   TreeIntersection(first,second);
    }
    public static void TreeIntersection(BinaryTree first, BinaryTree second){

        List  firstTree=first.inOrder(first.root);
        firstTree=first.inOrderList;
      if(second!=null) {

      }
    }
}
