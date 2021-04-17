package stackandqueues;

public class Queue<T> {
  Node<T> front;
  Node<T> back;


  public void enqueue(T value){
 if(front==null){
 front=new Node<T>(value,back);
 back=front;
 } else {
   back=new Node<T>(value,back);
 }
  }

  public void dequeue() {
    if (front == null) {
      back = null;
      System.out.println("Queue is empty");
    } else {
      System.out.println("the removed value is "+front.value);
      front =front.next;
    }
  }

  public String peek () {
      try {
        System.out.println(front.value);
        return "peek value is : " + front.value;
      } catch (Exception ex) {
        return "The queue is empty";
      }
    }

    public boolean isEmpty () {
      if (front == null) {
        return true;
      } else {
        return false;
      }
    }
}
