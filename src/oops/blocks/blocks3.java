//instance block - non static bllock

package oops.blocks;

public class blocks3 {
    int id;
    static int m=10;

  {
    System.out.println(blocks3.m);
    System.out.println("I am inside the block - 1");
    id=10;
    System.out.println(id);
  }

  public static void main(String[] args) {
    System.out.println("Start");
    blocks3 test = new blocks3();
    System.out.println(test.id);
    System.out.println("end");
  }

  static{
    blocks3.m=90;
System.out.println(m);
}

  {
    id=30;
    System.out.println("I am inside the block - 2 "+id);
        System.out.println(blocks3.m);

  }


  {
    id=0;
    blocks3.m=100;
    System.out.println("I am inside the block - 3 "+id);
        System.out.println(blocks3.m);

  }
}
