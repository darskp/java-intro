package Collection_Framework.Set_.Treeset_.DefaultSorting.Example1;

// public class Car {

//   int cost;

//   Car(int cost) {
//     this.cost = cost;
//   }

//   public String toString() {
//     return "COST:" + cost;
//   }
// }

//! How can we compare User-Defined Object?

//classcast exception bcz of compareTo method will called
//and Car is user defined class

// so we have to use <<Comparable>>
// <<Comparable>> is used to compare objects and sort them.

// implements Comparable<Car>
//inside the < we need to methion the which objects want to compare>

// syntax : public int compareTo(Object o);

// when you add t.add(c2);
// internally it invoke compareTo method
// c2.compareTo(c1);

//public int compareTo(Car c) {
// return this.cost - c.cost;
//   }

// c2.compareTo(c1); ==> 200-100 => +ve = RHS


public class Car implements Comparable<Car> {

  int cost;

  Car(int cost) {
    this.cost = cost;
  }

  @Override
  public String toString() {
    return "COST:" + cost;
  }

  @Override
  public int compareTo(Car c) {
    return this.cost - c.cost;
  }
}
