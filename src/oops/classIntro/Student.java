package oops.classIntro;

public class Student {
    //non static
    int age=18;
    String name="xyz";
    public static void main(String[] args) {
        Student stuObj1=new Student();
        System.out.println(stuObj1.age);
        System.out.println(stuObj1.name);
    }
}
