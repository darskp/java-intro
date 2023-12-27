package oops.Abstract.ContractOfAbstract;
// Can a class inherit an abstract class? -> YES
//abstract method can be inhreited

// need to follow any one of the 2 rules
// 1. use abstract keyword in the sub class
// 2. use Override


// but the end class should be concrete method

// public abstract class SubClass extends SuperClass{
public class SubClass extends SuperClass{
    @Override
    void work(){
    System.out.println("WORKING - Subclass");
    }
    public static void main(String[] args) {
        SubClass s=new SubClass();
        s.work();
    }

}
