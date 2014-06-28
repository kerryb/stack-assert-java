class Stack {
  public boolean isEmpty() {
    return true;
  }

  public static void main(String[] args) {
    Stack stack = new Stack();
    if (!stack.isEmpty()) {
      System.err.println("A new stack should be empty");
    }
  }
}
