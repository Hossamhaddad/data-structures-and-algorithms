package stackandqueues;

public class Stack <T>{
  Node<T> top;
  Node<T> maxNum;

public void push(Object value){
Node item=new Node(value,top);
  top=item;
  if(Math.max((int) maxNum.getValue() , (int)value) !=(int) maxNum.getValue()){
    Node maxitem=new Node(value,maxNum);
    maxNum=maxitem;
  }
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

  public T peek() {
//  try {
    return top.value;
//  }catch (Exception ex){
//   return "The stack is empty";
//  }
  }
  public boolean isEmpty() {
    if (top == null) {
      return true;
    } else {
      return false;
    }
  }
  public T maxValue() {
  return maxNum.value;
  }











  @Override
public String toString(){

  System.out.println("this top is "+top.value);
 return "hi";
  }

  }
