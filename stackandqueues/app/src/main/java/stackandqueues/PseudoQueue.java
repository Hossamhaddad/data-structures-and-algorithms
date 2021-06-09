package stackandqueues;

public class PseudoQueue <T>{
  Stack <T> a=new Stack();
  Stack <T> b=new Stack();


  public PseudoQueue() {
    Stack a;
    Stack b;
  }

  public  void enqueue(T value){
  a.push(value);
  }

  public T dequeue() throws NullPointerException  {

    while (a!=null) {
      b.push((T)a.pop());
    }
    T result = (T)b.pop();
    while(b!=null) {
      a.push((T)b.pop());
    }
    return result;
  }

}
