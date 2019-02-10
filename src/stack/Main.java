package stack;

public class Main {
  public static void main(String[] args) {
    System.out.println();

    // Make a new stack
    Stack stack = new Stack();

    // Report number of items on the stack
    System.out.println(stack.numOfItems());
    
    // Push first
    stack.push("first");

    // Push second
    stack.push("second");

    // Push third
    stack.push("third");

    // Report number of items on the stack
    System.out.println(stack.numOfItems());

    // Print the stack
    stack.print();

    for (int i = 0; i < 3; i++) {
      // Pop the stack
      stack.pop();

      // Print the stack
      stack.print();
    }

    // Report number of items on the stack
    System.out.println(stack.numOfItems());
  }
}
