package oops.blocks;

public class blocks2 {

  String name;

  static {
    // System.out.println("1.1. Initialized to " + b1.name);
    blocks2 b1=new blocks2();
        System.out.println("1.1. Initialized to " + b1.name);

    b1.name = "Darshan";
    System.out.println("1.2 Initialized to " + b1.name);
    System.out.println("-----------------------------------------");
  }

  public static void main(String[] args) {
        blocks2 blocks2=new blocks2();

    System.out.println("I am main " + blocks2.name);
    blocks2.name = "Darshan2";
    System.out.println("I am main " + blocks2.name);
  }

  static {
        blocks2 b2=new blocks2();

    System.out.println("2.1 Initialized to " + b2.name);
    b2.name = "Darshan1";
    System.out.println("2.2 Initialized to " + b2.name);
    System.out.println("-----------------------------------------");
  }
}
