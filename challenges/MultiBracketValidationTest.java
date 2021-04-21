import org.junit.Test;

import java.util.Stack;
import static org.junit.Assert.*;


class MultiBracketValidationTest {
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
  @Test public void checkifreturnfalse () {
    assertEquals("it should return false ",false,multiBracketValidation("{{))}))"));
  }
  @Test public void checkifreturntrue () {
    assertEquals("it should return true ",true,multiBracketValidation("{}(){}"));
  }

}
