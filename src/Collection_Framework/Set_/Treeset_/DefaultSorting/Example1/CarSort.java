package Collection_Framework.Set_.Treeset_.DefaultSorting.Example1;

import java.util.TreeSet;

public class CarSort {

  public static void main(String[] args) {
    Car c1 = new Car(400);
    Car c2 = new Car(300);
    Car c3 = new Car(100);
    TreeSet<Car> t = new TreeSet<Car>();
    t.add(c1);
    t.add(c2);
    t.add(c3);
    for (Car car : t) {
      System.out.println(car);
    }

    

  }
}
