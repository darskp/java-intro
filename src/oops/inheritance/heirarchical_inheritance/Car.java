package oops.inheritance.heirarchical_inheritance;

public class Car extends Vehicle {

  int cost = 000;
  String carName = "Thar";

  void start() {
    System.out.println(this.carName + " Car Started");
  }
}
