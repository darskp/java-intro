package String;

public class ConstructorsinStringClass {

  public static void main(String[] args) {
    //empty representation of string object
    String s1 = new String();
    System.out.println(s1);

    //passing string object
    String s2 = new String("Hello");
    System.out.println(s2);

    char[] ch = { 'j', 'a', 'v', 'a' };
    String s3 = new String(ch);
    System.out.println(s3);
  }
}
