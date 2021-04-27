package tree;

import java.util.ArrayList;

public class FizzNode <T>{
  T value;
  ArrayList<FizzNode<T>> children;

  public FizzNode(T value) {
    this.value = value;
  }

  public FizzNode(T value, ArrayList<FizzNode<T>> children) {
    this.value = value;
    this.children = children;
  }
  public void printNodeTree(FizzNode<T> node, int height ){
    for (int i = 0; i < height; ++i) {
      System.out.print("   ");
    }

    System.out.println(node.value);
    if( node.children !=null)
      for (FizzNode<T> child : node.children) {
        printNodeTree(child, height + 1);
      }
  }



}
