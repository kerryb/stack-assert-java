class Stack {
  private boolean empty = true;

  public void push(Object item) {
    empty = false;
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

  public static void main(String[] args) {
    Stack stack = new Stack();
    assertTrue(stack.isEmpty(), "A new stack should be empty");

    stack = new Stack();
    stack.push("foo");
    assertFalse(stack.isEmpty(), "A stack that's been pushed to should not be empty");
  }
}
