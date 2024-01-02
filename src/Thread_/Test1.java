package Thread_;

public class Test1 {

    public static void main(String[] args) {
        Thread t= new Thread();
        System.out.println(t.getId());
        System.out.println(t.getName());
        System.out.println(t.getPriority());

        System.out.println("-----------");
        t.setName("DarshanThread");
        t.setPriority(10);
        System.out.println(t.getId());
        System.out.println(t.getName());
        System.out.println(t.getPriority());


        System.out.println("---------------");
        Thread t1=new Thread("Car thread");
        t1.setPriority(1);
        System.out.println(t1);

        //current thread
        Thread cr=Thread.currentThread();
        System.out.println(cr);


    }
    
}
