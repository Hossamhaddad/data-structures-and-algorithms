package stackandqueues;

public class Stack <T>{
  Node<T> top;


public void push(T value){
Node item=new Node(value,top);
  top=item;
}
  public T pop(){
  try {
    System.out.println("Top removed value  is : "+top.value);
    top=top.next;
    return top.value;

  }catch (Exception ex){
    System.out.println("The stack is empty");
  }
  return top.value;
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
