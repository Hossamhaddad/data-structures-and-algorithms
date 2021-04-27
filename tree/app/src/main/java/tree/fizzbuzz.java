package tree;

import stackandqueues.Queue;

public class fizzbuzz<T> {

  public FizzNode fizzBuzzTree(FizzNode<T> oldroot){

    FizzNode<T> newRoot=new FizzNode<T>(null);
    FizzNode<T> tempNode=new FizzNode<>(null);
    Queue <FizzNode> breadth=new Queue();

   boolean trigger=true;
    breadth.enqueue(oldroot);

    while (!breadth.isEmpty()){

      FizzNode<T>front=breadth.dequeue();

      if((Integer) front.value%3==0&&(Integer) front.value%5==0){
      front.value=(T)"FizzBuzz";
        newRoot=front;
       newRoot.children=front.children;
      }else if((Integer) front.value%3==0){
        front.value=(T)"Fizz";
        newRoot=front;
        newRoot.children=front.children;
      }else if((Integer) front.value%5==0){
        front.value=(T)"Buzz";
        newRoot=front;
        newRoot.children=front.children;
      }else {
        newRoot=front;
      }

      if(front.children!=null) {
        for(FizzNode<T> child : front.children) {
          breadth.enqueue(child);
        }
      }
      if (trigger == true) {
        tempNode = newRoot;
        trigger = false;
      }

    }
return tempNode;
  }




//  public FizzNode fizzBuzzTree(FizzNode oldroot){
//    FizzNode<Node> newRoot=new FizzNode(null);
//    Queue <FizzNode> breadth=new Queue<>();
//    breadth.enqueue(oldroot);
//    while (!breadth.isEmpty()){
//      FizzNode front=breadth.dequeue();
//      if((Integer) front.value%3==0&&(Integer) front.value%5==0){
//        newRoot=new FizzNode("FizzBuzz");
//        System.out.println(newRoot.value);
//        newRoot.left=front.left;
//        newRoot.right=front.right;
//      }else if((Integer) front.value%3==0){
//        newRoot=new FizzNode("Fizz");
//        System.out.println(newRoot.value);
//        newRoot.left=front.left;
//        newRoot.right=front.right;
//      }else if((Integer) front.value%5==0){
//        newRoot=new FizzNode("Buzz");
//        System.out.println(newRoot.value);
//        newRoot.left=front.left;
//        newRoot.right=front.right;
//      }else {
//        newRoot=new FizzNode(front.value);
//        System.out.println(newRoot.value);
//        newRoot.left=front.left;
//        newRoot.right=front.right;
//
//      }
//
//      if(front.left!=null){
//        breadth.enqueue(front.left);
//      }
//      if(front.right!=null){
//        breadth.enqueue(front.right);
//      }
//
//    }
//    return newRoot;
//  }

}
