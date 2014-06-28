class Stack {
  class EmptyStackError extends RuntimeException {
  }

  private boolean empty = true;
  private Object item = null;

  public void push(Object item) {
    empty = false;
    this.item = item;
  }

  public Object pop() {
    return item;
  }

  public boolean isEmpty() {
    return empty;
  }

  private static void assertTrue(boolean actual, String message) {
    if (!actual) {
      System.err.println(message);
    }
  }

  private static void assertFalse(boolean actual, String message) {
    if (actual) {
      System.err.println(message);
    }
  }

  private static void assertEqual(Object expected, Object actual, String message) {
    if (!expected.equals(actual)) {
      System.err.println(message + "(expected " + expected + ", got " + actual + ")");
    }
  }

  public static void main(String[] args) {
    Stack stack = new Stack();
    assertTrue(stack.isEmpty(), "A new stack should be empty");

    stack = new Stack();
    stack.push("foo");
    assertFalse(stack.isEmpty(), "A stack that's been pushed to should not be empty");

    stack = new Stack();
    stack.push("foo");
    assertEqual("foo", stack.pop(), "Popping a stack after pushing an item should return the item");

    stack = new Stack();
    try {
      stack.pop();
      System.err.println("Popping an empty stack should raise a Stack::EmptyStackError");
    } catch(Stack.EmptyStackError e) {
    }
  }
}
