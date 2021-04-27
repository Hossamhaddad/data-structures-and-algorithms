package stackandqueues;

public class Queue<T> {
  Node<T> front;
  Node<T> back;


  public void enqueue(T value){
    if (front == null) {
      front = new Node<T>(value, null);
      back = front;
    }else{
      Node<T> newNode=new Node<T>(value, null);
      back.next=newNode;
      back=newNode;
    }
  }

  public T dequeue() {
    if (front == null)  {
      throw new NullPointerException("Queue is Empty");
    }
      T value=front.value;
      front=front.next;
      return value;
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
