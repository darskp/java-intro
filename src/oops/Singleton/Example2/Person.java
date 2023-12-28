package oops.Singleton.Example2;

public class Person {
    public static void main(String[] args) {
        AadhaarCard c= AadhaarCard.CreateObject();
        System.out.println(c.number);
    }
}
