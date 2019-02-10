package stack;

public class Stack {
  private int length = 0;
  private String[] stack = new String[1000];

  public void print() {
    System.out.println(stack);
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
    stack[length++] = item;
  }

  public String numOfItems() {
    if (length == 0) {
      return "There are no items in your Stack.";
    }

    return Integer.toString(length);
  }
}
