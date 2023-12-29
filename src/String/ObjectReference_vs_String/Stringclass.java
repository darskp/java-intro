package String.ObjectReference_vs_String;

public class Stringclass {

  public static void main(String[] args) {
    String s = new String("B");
    //toString override
    System.out.println(s);
    System.out.println(s.toString());

    //hashCode
    System.out.println(s.hashCode());

    //equals
    String s1 = new String("B");
    String s2 = new String("B");
    System.out.println(s1.equals(s2));
  }
}
