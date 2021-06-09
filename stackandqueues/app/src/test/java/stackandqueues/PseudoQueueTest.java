package stackandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {
  @Test
  public void test_dequeue() {
    PseudoQueue instanceForTest = new PseudoQueue();
    instanceForTest.enqueue(5);
    instanceForTest.enqueue(10);
    instanceForTest.enqueue(15);
    instanceForTest.enqueue(20);
assertEquals("the value should be 20",20,instanceForTest.dequeue());

  }

}
