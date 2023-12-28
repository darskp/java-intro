package libraries.StoringObjectsinsideArray.Example2;

public class Person {

  int age;
  String name;

  Person(int age, String name) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Age: " + age + " Name: " + name;
  }

  public static void main(String[] args) {
    Person p1 = new Person(21, "A");
    Person p2 = new Person(21, "B");
    Person p3 = new Person(21, "C");
    Person[] p = new Person[3];
    p[0] = p1;
    p[1] = p2;
    p[2] = p3;
    for (int i = 0; i < p.length; i++) {
      System.out.println(p[i]);
    }
  }
}
