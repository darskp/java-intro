package libraries.StoringObjectsinsideArray.Example3;

public class Customer {

  public static void main(String[] args) {
    Laptop l1 = new Laptop("HP", 2000, "4GB");
    Laptop l2 = new Laptop("Dell", 3000, "4GB");
    Laptop l3 = new Laptop("Lenovo", 2400, "4GB");
    Laptop l4 = new Laptop("Acer", 2500, "4GB");

    // System.out.println(l1);
    // System.out.println(l2);
    // System.out.println(l3);
    // System.out.println(l4);

    // Laptop[] l = new Laptop[4];
    // l[0] = l1;
    // l[1] = l2;
    // l[2] = l3;
    // l[3] = l4;

    // for (int i = 0; i < l.length; i++) {
    // System.out.println(l[i]);
    // }

    Laptop[] l = { l1, l2, l3, l4 };
    for (int i = 0; i < l.length; i++) {
      System.out.println(l[i]);
    }
  }
}
