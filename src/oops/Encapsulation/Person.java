//process of binding variable and function in single entity.
// Java bean class

// Rules - 
// 1. public class
// 2. data members/variable should be private
// 3. respective varibales should have getter and setter

//using constructor we can intialize the value only once if we want to change the value later  -  we need getter & setter

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
