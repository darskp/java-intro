// String is pre-defined final class present in java.lang
//Immutable in nature
//Collection/set of characters
//non primitive datatypes

package String;


public class notes {

  public static void main(String[] args) {
    // Strings object can be created in 2 ways
    // 1. using new operator
    // 2. literal

    String s = new String("Darshan");
    String s1 = "Darshan";
    System.out.println(s1);
    System.out.println(s1.indexOf("o"));
    // String objects are stored inside a memory location
    // called as String pool.
    // String pool is divided into 2 types
    // 1. Constant pool
    // 2. non-constant pool

    //! 1. Constant pool
    // literal objects are stored inside constant pool
    // constant pool does n't allow duplicates

    //! 2. non-constant pool
    // String objects created using new operator are stored inside the non-constant pool
    //allows duplicates

    // String class has automatically override 3 methods from object class
    // 1. toString()
    // 2. hashCode() -
    // 3. equals()

    // -> toString() of the Object Class is Overridden in String
    // Class to return the actual data passed to the Constructor
    // during object creation.
    // sout(s) // we will get string data not the string representation

    // -> hashCode() of the Object Class is overridden in String
    // class to return a number based on the ASCII value.

    // -> equals() of the Object Class is Overridden in String
    // Class to compare the contents of both the objects.
  }
}

// Methods Present in String class

//! String s = "Software Developer"; 
// String a = "java";
//  String b = "JavA";
//  String c = "java"; 
// 1. s.length(); //18
// 2. s.toUpperCase();
// 3. s.toLowerCase();
// 4. s.startsWith("soft"); //t
// 5. s.endsWith("Per"); //t //case sensitive
// 6. s.contains("dev") //t
// 7. s.charAt(2) //f  - index oout of bound - if index is greated than the s.length
// 8. s.indexOf('e') //return 1st element -left right search - if it not present - -1
// 9. s.subString(3,7) //
// 10. a.equalsIgnoreCase(b); //true
// 11. s.toCharArray(); 




