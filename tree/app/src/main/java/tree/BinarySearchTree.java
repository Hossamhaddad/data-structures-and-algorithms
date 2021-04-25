package tree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
  Node root;


  public BinarySearchTree() {

  }

  public BinarySearchTree(Integer value) {
    this.root.value = value;
  }

  public void add(Integer value) {
Node newNode=new Node(value);
    Node current;
    Node parent;
    if (root == null) {
      root = newNode;
    }
    else {
  current=root;
  parent=null;
 while (true){
   parent=current;
   if(value< parent.value){
     current=current.left;
     if(current==null){
       parent.left=newNode;
       return;
     }
   }else {
     current=current.right;
     if(current==null) {
       parent.right = newNode;
       return;
     }
   }
 }
    }


    }


    }



