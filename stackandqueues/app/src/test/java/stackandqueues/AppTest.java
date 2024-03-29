///*
// * This Java source file was generated by the Gradle 'init' task.
// */
//package stackandqueues;
//
//import org.junit.Test;
//import static org.junit.Assert.*;
//
//public class AppTest {
//
//  @Test public void testEmptyStack(){
//      Stack test=new Stack();
//      Stack test1=new Stack();
//      test1.push("hi");
//     assertEquals("the result should be True",true,test.isEmpty());
//    assertEquals("the result should be False",false,test1.isEmpty());
//  }
//  @Test public void testStackPush(){
//    Stack test=new Stack();
//    test.push("hi");
//    assertEquals("the stack top should be hi ","hi",test.top.value);
//  }
//  @Test public void testStackPop(){
//    Stack test=new Stack();
//    test.push("hi");
//    test.push("hello");
//    test.pop();
//    assertEquals("the stack top should be hi ","hi",test.top.value);
//  }
//  @Test public void testStackPeek(){
//    Stack test=new Stack();
//    test.push("hi");
//    test.push("hello");
//    test.push("nice");
//    test.peek();
//    assertEquals("the stack  peek should be nice ","Top value is : nice",test.peek());
//  }
//  @Test public void testQueueEnqueue(){
//   Queue test=new Queue();
//   test.enqueue("hi");
//    assertEquals("the Queue front should be hi ","hi",test.front.value);
//    assertEquals("the Queue back should be hi ","hi",test.back.value);
//  }
//  @Test public void testQueueIsEmpty(){
//    Queue test=new Queue();
//    assertEquals("the Queue should be empty ",true,test.isEmpty());
//    Queue test1=new Queue();
//    test1.enqueue("hi");
//    assertEquals("the Queue should be empty ",false,test1.isEmpty());
//  }
//  @Test public void testQueuePeek(){
//    Queue test=new Queue();
//    test.enqueue("hi");
//    test.enqueue("hello");
//    test.enqueue("good");
//    assertEquals("the Queue should be empty ","peek value is : hi",test.peek());
//  }
//
//}
//
