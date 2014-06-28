class Stack {
  public boolean isEmpty() {
    return false;
  }

  public static void main(String[] args) {
    Stack stack = new Stack();
    if (!stack.isEmpty()) {
      System.err.println("Expected a new stack to be empty");
    }
  }
}
