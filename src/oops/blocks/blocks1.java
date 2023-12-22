package oops.blocks;

public class blocks1 {

  static String name;

  static {
    System.out.println("1.1. Initialized to " + name);
    blocks1.name = "Darshan";
    System.out.println("1.2 Initialized to " + name);
    System.out.println("-----------------------------------------");
  }

  public static void main(String[] args) {
    System.out.println("I am main " + name);
    blocks1.name = "Darshan2";
    System.out.println("I am main " + name);
  }

  static {
    System.out.println("2.1 Initialized to " + name);
    blocks1.name = "Darshan1";
    System.out.println("2.2 Initialized to " + name);
    System.out.println("-----------------------------------------");
  }
}
