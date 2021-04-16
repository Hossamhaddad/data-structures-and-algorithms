/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedList;

import org.junit.Test;

import java.net.PortUnreachableException;

import static org.junit.Assert.*;

public class LinkedListTest {

@Test public void testEmptyList(){
  LinkedList empty=new LinkedList();
  assertNull(empty.head);
}
@Test public void testInsert(){
  LinkedList insert=new LinkedList("hi");
  insert.insert("hello");
  assertEquals("The value should be hello ","hello",insert.head.next.value);
}
@Test public void testHead() {
  LinkedList head=new LinkedList("hi");
  head.insert("hello");
  assertEquals("The head should be hi","hello",head.head.next.value);
}
@Test public void testMulInsert(){
  LinkedList multInsert=new LinkedList("hello");
  multInsert.insert("hi");
  multInsert.insert("nice");
  assertEquals("The result should be nice","nice",multInsert.head.next.next.value);
}
@Test public void testInculdes(){
  LinkedList listIncludes=new LinkedList("1");
  listIncludes.insert("2");
  listIncludes.insert("3");
  assertEquals("the result should be True ",true,listIncludes.includes("2"));
}
  @Test public void testNotInculdes(){
    LinkedList listNotIncludes=new LinkedList("1");
    listNotIncludes.insert("2");
    listNotIncludes.insert("3");
    assertEquals("the result should be false ",false,listNotIncludes.includes("24"));
  }
  @Test public void testReturn(){
    LinkedList returnList=new LinkedList("1");
    returnList.insert("2");
    returnList.insert("3");
    assertEquals("the result should be {1}->{2}->{3}->NULL","{1}->{2}->{3}->NULL",returnList.tostring());
  }
  @Test public  void testAppend(){
    LinkedList returnList=new LinkedList("1");
    returnList.insert("2");
    returnList.insert("3");
    returnList.append("5");
    assertEquals("the result should be {1}->{2}->{3}->{5}->NULL","{1}->{2}->{3}->{5}->NULL",returnList.tostring());
  }
  @Test public  void testAppendMult(){
    LinkedList returnList=new LinkedList("head");
    returnList.insert("2");
    returnList.insert("3");
    returnList.append("5");
    returnList.append("8");
    assertEquals("the result should be {head}->{2}->{3}->{5}->{8}->NULL","{head}->{2}->{3}->{5}->{8}->NULL",returnList.tostring());
  }
  @Test public void testInsertBefMid(){
    LinkedList returnList=new LinkedList("head");
    returnList.insert("2");
    returnList.insert("3");
    returnList.append("5");
    returnList.append("8");
    returnList.insertBefore("3","9");
    assertEquals("the result should be {head}->{2}->{9}->{3}->{5}->{8}->NULL","{1}->{2}->{9}->{3}->{5}->{8}->NULL",returnList.tostring());
  }
  @Test public void testInsertBef1st(){
    LinkedList returnList=new LinkedList("head");
    returnList.insert("2");
    returnList.insert("3");
    returnList.append("5");
    returnList.append("8");
    returnList.insertBefore("2","9");
    assertEquals("the result should be {head}->{9}->{2}->{3}->{5}->{8}->NULL","{head}->{9}->{2}->{3}->{5}->{8}->NULL",returnList.tostring());
  }
  @Test public void testInsertAftMid(){
    LinkedList returnList=new LinkedList("head");
    returnList.insert("2");
    returnList.insert("3");
    returnList.append("5");
    returnList.append("8");
    returnList.insertAfter("3","9");
    assertEquals("the result should be {head}->{2}->{3}->{9}->{5}->{8}->NULL","{head}->{2}->{3}->{9}->{5}->{8}->NULL",returnList.tostring());
  }
  @Test public void testInsertAftLast(){
    LinkedList returnList=new LinkedList("head");
    returnList.insert("2");
    returnList.insert("3");
    returnList.append("5");
    returnList.append("8");
    returnList.insertAfter("8","9");
    assertEquals("the result should be {head}->{2}->{3}->{5}->{8}->{9}->NULL","{head}->{2}->{3}->{5}->{8}->{9}->NULL",returnList.tostring());
  }
@Test public void testKGreaterthan(){
  LinkedList returnList=new LinkedList("head");
  returnList.insert("2");

}


}
