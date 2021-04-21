import java.util.Stack;

public class MultiBracketValidation {
  public static void main(String[] args) {
    multiBracketValidation("({[");
    System.out.println(multiBracketValidation("{}(){}"));
  }

  public static boolean multiBracketValidation(String str) {
    Stack<Character> brack = new Stack<>();
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
        brack.push(str.charAt(i));
      } else if (brack != null && (str.charAt(i) == ']' && brack.peek() == '[') || (str.charAt(i) == '}' && brack.peek() == '{') || (str.charAt(i) == ')' && brack.peek() == '(')) {
        brack.pop();
      }
    }
    if (brack.isEmpty()) {
      return true;
    } else {
      return false;
    }
  }

}
