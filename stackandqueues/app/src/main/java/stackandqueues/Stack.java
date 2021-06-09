package stackandqueues;

public class Stack <T>{
  Node<T> top;


  public void push(T value){
    Node item=new Node(value,top);
    top=item;
  }
  public Object pop(){
    Node current=top;
    try {
      top=top.next;

    }catch (Exception ex){
      System.out.println("The stack is empty");
    }
    return current.value;
  }

  public String peek() {
    try {
      return "Top value is : "+top.value;
    }catch (Exception ex){
      return "The stack is empty";
    }
  }
  public boolean isEmpty() {
    if (top == null) {
      return true;
    } else {
      return false;
    }
  }
  @Override
  public String toString(){

    System.out.println("this top is "+top.value);
    return "hi";
  }

  }
