package oops.Interface_intro.Example3;

public class Emp extends Wipro implements Jc,NIE{
    @Override
    public void study(String name){
    System.out.println(name);
    }

    public static void main(String[] args) {
        System.out.println(NIE.name);
        System.out.println(Jc.name);
        Emp e=new Emp();
        e.study(NIE.name);
        e.study(Jc.name);
    }
}
