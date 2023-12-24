package oops.Constructor_Overloading;

// multiple constructors in the same class but difference in arguments

// Rules :
// a. There should be a change in the (length) No of Arguments.
// b. There should be a change in the Datatype of the Arguments.
// c. There should be a change in the Sequence/Order of Datatype.

public class Vehicle {

  int cost;
  String brand;

  Vehicle(int cost, String brand) {
    this.cost = cost;
    this.brand = brand;
    System.out.println("Brand: " + brand + "Cost:" + cost);
  }

  Vehicle(int cost) {
    this.cost = cost;
    System.out.println("Brand: " + brand + "Cost:" + cost);
  }

  Vehicle(String brand) {
    this.brand = brand;
    System.out.println("Brand: " + brand + "Cost:" + cost);
  }

  Vehicle() {
    System.out.println("No Argument Constructor");
  }

  Vehicle(String brand, int cost) {
    this.cost = cost;
    this.brand = brand;
    System.out.println("Brand: " + brand + "Cost:" + cost);
  }

  public static void main(String[] args) {
    Vehicle v1 = new Vehicle();
    Vehicle v2 = new Vehicle(1000000);
    Vehicle v3 = new Vehicle("BMW");
    Vehicle v4 = new Vehicle("BMW", 100000);
    Vehicle v5 = new Vehicle(200000, "BMW");
  }
}
