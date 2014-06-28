class Stack {
  public void push(Object item) {
  }

  public boolean isEmpty() {
    return true;
  }

  public static void main(String[] args) {
    Stack stack = new Stack();
    if (!stack.isEmpty()) {
      System.err.println("A new stack should be empty");
    }

    stack = new Stack();
    stack.push("foo");
    if (stack.isEmpty()) {
      System.err.println("A stack that's been pushed to should not be empty");
    }
  }
}
