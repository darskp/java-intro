package oops.Casting.Primitive.Widening;
//small to large data type - implicitly
public class Test {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a);
        double b=a;
        System.out.println(b+" "+a);

        System.out.println("-----");
        short c=50;
        float d=c;
        System.out.println(d+" "+c);
        System.out.println("--------");
        char character='A';
        int chard=character;
        System.out.println(chard+" "+character);

    }
}
