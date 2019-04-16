package stack;

import java.util.Arrays;

public class Stack {
  private static final int MAX = 1000;
  private int length = 0;
  private String[] stack = new String[MAX];

  public void print() {
    System.out.println(
      Arrays.toString(
        Arrays.stream(stack).filter(item -> item != null).toArray()
      )
    );
  }

  public String pop() {
    if (length == 0) {
      return null;
    }

    String removed = stack[--length];
    stack[length] = null;
    return removed;
  }

  public void push(String item) {
    if (length < MAX) {
      stack[length++] = item;
    }
  }

  public String numOfItems() {
    if (length == 0) {
      return "There are no items in your Stack.";
    }

    return Integer.toString(length);
  }
}
