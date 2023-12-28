package libraries.StoringObjectsinsideArray.Example3;

public class Laptop {

  String brand;
  int cost;
  String ramSize;

  Laptop(String brand, int cost, String ramSize) {
    this.brand = brand;
    this.cost = cost;
    this.ramSize = ramSize;
  }

  @Override
  public String toString() {
    return "brand : " + brand + ", cost : " + cost + ", Ram Size :" + ramSize;
  }
}
