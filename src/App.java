public class App {

  public static void main(String[] args) throws Exception {
    System.out.println("Hello, World!");
    System.out.print("Hello");
    System.out.println("--");
    System.out.printf("k  l   ");
    System.out.println("--");
    int[][] a = { { 1, 2, 2 }, { 3, 4, 3 }, { 5, 6, 4 } };

    for(int[] innerArray:a){
    for(int ab:innerArray){
    System.out.println(ab);
    }
    }
  }
}
