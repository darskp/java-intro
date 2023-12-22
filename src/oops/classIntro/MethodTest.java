package oops.classIntro;

// public class MethodTest {
//     static int[] b;
//     public static void main(String[] args) {
//         int a=10;
//         System.out.println(((Object)(a)).getClass().getSimpleName());
//         System.out.println(b);
//     }
// }

// public class MethodTest {
//     char character='d';

//     void display(){
//     System.out.println("I am method now");
//     }
//     public static void main(String[] args) {
//        MethodTest obj1=new MethodTest();
//        System.out.println("Before===> "+ obj1.character);
//        obj1.display();
//        obj1.character='a';
//        System.out.println("After==> "+ obj1.character);

//     }
// }

//sum of 2 numbers
// public class MethodTest {

//   void add(int a, int b) {
//     int sum = a + b;
//     System.out.println("Sum of " + a + " and " + b + " is " + sum);

//   }

//   public static void main(String[] args) {
//     MethodTest Add=new MethodTest();
//     Add.add(0, 0);
//     Add.add(10, 30);
//   }
// }

class Runner {

  int m1() {
    return 10 + 10;
  }

  double m2() {
    return 10 + 10.7;
  }

  String m3() {
    return "hai" + 10;
  }

  String a = "java";
}

public class MethodTest {
  public static void main(String[] args) {
    Runner test=new Runner();
    System.out.println(test.m1());
    System.out.println(test.m2());
    System.out.println(test.m3());
    System.out.println(test.a);
  }
}
