package oops.constructor;

public class Constructor2 {

  static int ageS;
  int age;

  static {
    System.out.println("I'm inside static1 " + ageS);
    ageS = 15;
    System.out.println("I'm inside static1 " + ageS);
  }

  {
    System.out.println("CALL ME ==> OBJECT and age is "+ ageS+" "+age);
  }

  Constructor2(int a) {
    int age = 10;
    System.out.println("AGE is " + age);
    age = a;
    System.out.println("AGE is " + age);
  }

  public static void main(String[] args) {
    ageS=35;
    System.out.println("START " + ageS);
    Constructor2 obj1 = new Constructor2(30);
    Constructor2 obj2 = new Constructor2(50);
    System.out.println("END");
  }

  static {
    System.out.println("I'm inside static2 " + ageS);
 int ageS;
    ageS=65;
    System.out.println("I'm inside static2 " + ageS);
  }
}
