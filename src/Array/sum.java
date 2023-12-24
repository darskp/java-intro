package Array;

import java.util.Scanner;

public class sum {

  public static int cal(int[] a, int n) {
    int res = 0;
    for (int i = 0; i < n; i++) {
      res += a[i];
    }
    return res;
  }

  public static void main(String[] args) {
    Scanner s1 = new Scanner(System.in);
    System.out.println("Enter the number of the elements : ");
    int n = s1.nextInt();
    System.out.println("Enter the elements : ");
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = s1.nextInt();
    }
    System.out.println("Entered the elements are: ");
    for (int i = 0; i < n; i++) {
      System.out.println(a[i]);
    }
    System.out.println("Sum: "+cal(a, n));
    System.out.println("Average: "+(cal(a, n)/n));
  }
}
