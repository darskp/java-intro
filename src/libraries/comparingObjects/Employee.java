package libraries.comparingObjects;

public class Employee {
    int id;
    double height;

    public Employee(int id, double height) {
        this.id = id;
        this.height = height;
    }

    public boolean equals(Object obj){
    Employee emp=(Employee) obj;
    return this.id==emp.id;
    }

    public static void main(String[] args) {
        Employee e1=new Employee(101,5.8);
        Employee e2=new Employee(101,5.7);
        System.out.println(e1.equals(e2));
        //current object is e1 
        //without overide the quals it compairs the hash

        
    }

}
