package oops.Interface_intro.Example1;

public class Emp implements Person{
    //override the abstract method
    //access specifier should be same -- interface abstract method - public
    @Override
    public void work(){
    System.out.println("Hi i am inside a emp class");
    }
    public static void main(String[] args) {
        //static so we can access using dot operator 
        System.out.println(Person.name);

        //create obj to access work method
        Emp e=new Emp();
        e.work();
        
    }
}
