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
//      Node leftt = new Node(10, null, null);
//      Node lefet = new Node(6, leftt, null);
//      Node rightt = new Node(8, null, null);
//
//      Node right = new Node(15, null, rightt);
//      Node root = new Node(5, lefet, right);
//      BinaryTree test = new BinaryTree();
//      System.out.println(lefet.value);
//      System.out.println(test.preOrder(root));
//      System.out.println(test.inOrder(root));
//      System.out.println(test.postOrder(root));

      BinarySearchTree test1=new BinarySearchTree();
      test1.add(6);
      test1.add(3);
      test1.add(8);
      test1.add(10);
      test1.add(5);
      System.out.println(test1.root.left.right.value);
    }

    }

