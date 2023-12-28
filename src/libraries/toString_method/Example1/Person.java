package libraries.toString_method.Example1;

// public class Person extends Object{
//     public static void main(String[] args) {
//         Person P =new Person();
//         System.out.println(P); //libraries.Example1.Person@2f92e0f4
//         System.out.println(P.toString());//libraries.Example1.Person@2f92e0f4

//?How do you prove that Object is Super class and Person is sub class?
//upcasting
// Object ob=new Person()
//     }
// }

// public class Person extends Object {

//   @Override
//   public String toString() {
//     //need to change the implmentation of the toString method
//     return "I am changing the hashcode to this stmt";
//   }

//   public static void main(String[] args) {
//     // when object is created - it is automatically create the string representatioon of the object
//     Person P = new Person();
//     System.out.println(P);
//     System.out.println(P.toString());
//   }
// }

public class Person extends Object {

  String name;

  Person(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    //need to change the implmentation of the toString method
    return this.name;
  }

  public static void main(String[] args) {
    // when object is created - it is automatically create the string representatioon of the object
    Person P = new Person("Darshan");
    System.out.println(P);
    System.out.println(P.toString());
  }
}
