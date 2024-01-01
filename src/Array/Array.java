package Array;

// An array is a container to store a group of data/elements.
// Syntax -

// Declaration
// DataType[] arrayName;

// Creation
// arrayName = new DataType[size];

// Array Declaration and Creation
// DataType[] arrayName = new DataType[size];

// Initialization
// arrayName[index] = value;

// Array initialization directly
// int[] arr = {5, 4, 50, 7};
// arr.length;


public class Array {

  public static void main(String[] args) {
    int[] a;
    a = new int[3];
    System.out.println(a[0]);
    a[0] = 10;
    System.out.println(a[0]);

    
    double[] x = new double[4];
    x[1] = 10;
    System.out.println(x[1]);
    System.out.println("Length: " + x.length);

    //directly
    String[] names = { "D1", "D2", "D3" };
    System.out.println(names[0]);
    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);
    }
  }
}
