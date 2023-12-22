package oops.blocks;

public class blocks {
  static {
    System.out.println("Static block 1");
  }

  static {
    System.out.println("Static block 2");
  }

  public static void main(String[] args) {
    System.out.println("I am inside the main");
  }

  static {
    System.out.println("Static block 3");
  }
}
