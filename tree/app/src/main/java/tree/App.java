/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tree;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
//      System.out.println(new App().getGreeting());
      Node leftt = new Node(10, null, null);
      Node lefet = new Node(6, leftt, null);
      Node rightt = new Node(8, null, null);
      Node right = new Node(15, null, rightt);
      Node root = new Node(5, lefet, right);
 BinaryTree test=new BinaryTree(root);
      System.out.println(test.maxValue());

    }

    }

