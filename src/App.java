// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//     }
// }

// public class App{
// public static void main(String[] args){
//     String name="Darshan";
//     int a=10;

// System.out.println("Check the concat");
// }
// }

// public class App {

//     public static void main(String[] args) {
//         int a = 5;
//  int b = 10;
//  int sum = a+b;
//  System.out.println("Sum: "+sum);//15
//  System.out.println(a-2);//3
//  System.out.println(4*b);//40
//  System.out.println(10/5);//2
//  System.out.println(10%2); //0
//     }
// }

// public class App {

//     public static void main(String[] args) {
//         System.out.println("hai");
//  System.out.print("hai");
//  System.out.print(" bye"+10);
//  System.out.println("java");
//  System.out.print("hai"+" hello");
//  System.out.print("hai");
//  System.out.println("bye");
//     }
// }

// public class App{
// public static void main(String[] args) {
//     int a=10;
//     float b=10.0f;
//     System.out.println(a==b);
//     String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//     for (String i : cars) {
//         System.out.print(i+" ");
//     }
// System.out.println(cars.length);
// String name="DARSHAN";
// System.out.println(name.length());

// }
// }

import java.util.Scanner;

public class App {

  public static long cal(int num) {
    if (num == 0) {
      return 1;
    }
    return num * cal(num - 1);
  }

  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter the number to calculate the factorial");
    int number = myScanner.nextInt();
    System.out.println("Entered number is " + number);
    System.out.println("Result is " + cal(number));
    myScanner.close();
  }
}
