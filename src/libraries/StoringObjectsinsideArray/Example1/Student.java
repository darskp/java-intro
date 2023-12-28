package libraries.StoringObjectsinsideArray.Example1;

public class Student {

  int age;
  String name;

  Student(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public static void main(String[] args) {
    Student s1 = new Student(21, "A");
    Student s2 = new Student(22, "B");

    Student[] s = new Student[2]; //Array oof type Student
    s[0] = s1;
    s[1] = s2;

    //without overriding string
    for (int i = 0; i < s.length; i++) {
      System.out.println(s[i]);
    }
    //toString is implicitly calling
    System.out.println("-------------");
  }
}
