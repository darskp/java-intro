package String.ObjectReference_vs_String;

public class ObjectReference {

    public static void main(String[] args) {
        ObjectReference obj=new ObjectReference();
        System.out.println(obj);
        System.out.println(obj.toString());

        System.out.println(obj.hashCode());

        ObjectReference obj1=new ObjectReference();
        ObjectReference obj2=new ObjectReference();
        System.out.println(obj1.equals(obj2));
    }
    
}
