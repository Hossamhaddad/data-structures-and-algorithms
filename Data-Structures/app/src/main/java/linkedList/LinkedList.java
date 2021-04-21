/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedList;

import java.util.ArrayList;
import java.util.Arrays;

public class LinkedList {
  Node head=null;
   LinkedList(){

}
  public LinkedList(String item) {
    head = new Node(item);
  }


  public static void main(String[] args) {
    LinkedList newList = new LinkedList("husam");
    newList.insert("2");
    LinkedList second=new LinkedList("hello");
    second.insert("3");
    second.insert("4");
    zipList(newList,second);


  }

  public void insert(String value) {

    Node newHead = new Node(value);
    newHead.next = head;
    head = newHead;
  }
  public boolean includes(String search) {
 Node current = head;
 try {


    while (current != null) {
      if (current.value == search) {
        return true;
      } else {
        current=current.next;
      }
    }
 }catch (Exception ex){
   System.out.println(ex);
 }
    return  false;
  }
public String tostring(){
    String allValues="";
  Node current = head;
 while (current!=null){
   allValues+="{"+current.value+"}"+"->";
   current=current.next;

 }
    allValues+="NULL";
 return allValues;
}

  public void append(String value) {
    Node newHead = new Node(value);
    Node current = head;
    while (current.next != null) {
      current = current.next;
    }
    current.next=newHead;
  }
  public void insertBefore(String value,String newValue) {
    Node newVal = new Node(newValue);
    Node current = head;
    Node before = null;
    try {
      while (current.next != null) {
        if (current.value == value) {
          before.next = newVal;
          newVal.next = current;
          return;
        } else {
          before = current;
          current = current.next;
        }
      }throw (new Exception());
    } catch (Exception ex ) {
      System.out.println("The value you try to insert before doesn't exist");
    }
  }
  public void insertAfter(String value,String newValue){
    Node newVal= new Node(newValue);
    Node current = head;
    Node after=current.next;
    try {
      while (current.next != null) {
        if (current.value == value) {
          current.next = newVal;
          newVal.next = after;
          return;
        } else {
          after = after.next;
          current = current.next;
        }
      }throw(new Exception());
    }catch (Exception ex){
      System.out.println("the value you want to insert after doesn't exist ");
    }
  }
  public void nodesValue(int k){
  int listLength=0;
    Node current = head;
    while(current != null){
      current = current.next;
      listLength++;
    }

      if(k<0){
        System.out.println("null");
      }

    try {
      if(k<listLength){
        current = head;
        for (int i = 1; i < listLength - k ;i++){
          current = current.next;
        }
        System.out.println(current.value);
      }else {
        throw new Exception();
      }
    }catch (Exception ex){

      System.out.println("this value exceeded the linkedlist length ");
    }
  }
  public static LinkedList zipList(LinkedList a,LinkedList b){
     Node first=a.head;
     Node second=b.head;
     while (first.next!=null&&second.next!=null) {
       Node current = second.next;

       second.next = first.next;
       first.next = second;
       first = second.next;
       second = current;
     }
     if(first.next!=null){
       first.next=first;
     }else {
       first.next=second;
     }
    System.out.println(a.tostring());
return  a;

  }

 }



