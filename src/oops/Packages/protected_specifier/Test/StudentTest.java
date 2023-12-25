package oops.Packages.protected_specifier.Test;

public class StudentTest {
    public static void main(String[] args) {
        System.out.println("START I am Test");
        Student s1=new Student("Darshan_test_obj");
        System.out.println(Student.name_static);
        Student.display_static();
        s1.display();
    }
}
