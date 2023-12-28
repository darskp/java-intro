package libraries.comparingObjects;

// public class Student {

//   int age;

//   Student(int age) {
//     this.age = age;
//   }

//   public static void main(String[] args) {
//     Student s1 = new Student(20);
//     Student s2 = new Student(22);
//     System.out.println(s1 == s2); //false
//     //compairing - 2 different address/hashcode - false
//     System.out.println(s1.equals(s2)); //false
//   }

// }

//how to solve, we need to compair the properties contents

// syntax - public boolean equals(Object obj){

// }
public class Student {

  int age;

  Student(int age) {
    this.age = age;
  }

  public boolean equals(Object obj) {//upcast and downcast
    Student s = (Student) obj;
    //compair the content
    return this.age==s.age;
  }

  public static void main(String[] args) {
    Student s1 = new Student(20);
    Student s2 = new Student(20);
    System.out.println(s1 == s2); //false
    //compairing - 2 different address/hashcode - false
    System.out.println(s1.equals(s2)); 

    // s1-- this
    // s2 -> obj -> s
  }
}
