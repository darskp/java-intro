package libraries.hashCode;

// public class Employee {
//     public static void main(String[] args) {
//         Employee e=new Employee();
//         System.out.println(e.hashCode()); //798154996
//     }
// }

public class Employee {

    @Override
    public int hashCode(){
    return 123;
    }
    public static void main(String[] args) {
        Employee e=new Employee();
        System.out.println(e.hashCode()); 
    }
}
