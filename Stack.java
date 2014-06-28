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
    if (isEmpty()) {
      throw new EmptyStackError();
    }
    empty = true;
    return item;
  }

  public boolean isEmpty() {
    return empty;
  }

  private static void fail(String message) {
    System.err.println("FAILED: " + message);
  }

  private static void assertTrue(boolean actual, String message) {
    if (!actual) {
      fail(message);
    }
  }

  private static void assertFalse(boolean actual, String message) {
    if (actual) {
      fail(message);
    }
  }

  private static void assertEqual(Object expected, Object actual, String message) {
    if (!expected.equals(actual)) {
      fail(message + "(expected " + expected + ", got " + actual + ")");
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
      fail("Popping an empty stack should raise a Stack::EmptyStackError");
    } catch(Stack.EmptyStackError e) {
    }

    stack = new Stack();
    stack.push("foo");
    stack.pop();
    assertTrue(stack.isEmpty(), "A stack should be empty after popping the last item");

    stack = new Stack();
    stack.push("foo");
    stack.push("bar");
    assertEqual("bar", stack.pop(), "Popping a stack should return the last item pushed");
    assertEqual("foo", stack.pop(), "Popping a stack again should return the previous item pushed");
  }
}
