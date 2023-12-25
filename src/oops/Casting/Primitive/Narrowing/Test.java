package oops.Casting.Primitive.Narrowing;
//  Converting Bigger type of data into Smaller type of data.
public class Test {
 public static void main(String[] args) {
    int a=10;
    short b=(short)a;
    System.out.println(a+" "+b);
    System.out.println("-----");
    double c=97.0;
    char d=(char)c;
    System.out.println(c+" "+d);
    System.out.println("-----");
    System.out.println('a'+10);
 }   
}
