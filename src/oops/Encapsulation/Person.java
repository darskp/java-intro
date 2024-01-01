// Process of binding variables and functions in a single entity.
// Java Bean Class

// Rules:
// 1. Public class
// 2. Data members/variables should be private.
// 3. Respective variables should have getter and setter methods.

// Using a constructor, we can initialize the value only once. If we want to change the value later, we need getter and setter methods.


package oops.Encapsulation;

public class Person {

  private int id;
  private String name;

  public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public static void main(String[] args) {}
}
