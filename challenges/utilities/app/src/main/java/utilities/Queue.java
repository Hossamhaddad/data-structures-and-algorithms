package utilities;

public class Queue<T> {

    Node<T> front;
    Node<T> back;



    public void enqueue(T value) {

      if (front == null) {
        front = new Node<T>(value, null);
        back = front;
      }else{
        Node<T> newNode=new Node<T>(value, null);
        back.next=newNode;
        back=newNode;
      }
    }

    public T dequeue() throws NullPointerException{
      if(back==null){

        throw new NullPointerException("Queue is Empty");
      }
      T value = front.value;
      front = front.next;
      if(front == null) {
        this.back = null;
      }
      return value;
    }
}
