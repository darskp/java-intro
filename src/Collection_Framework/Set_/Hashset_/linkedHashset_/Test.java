package Collection_Framework.Set_.Hashset_.linkedHashset_;

import java.util.LinkedHashSet;

public class Test {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs=new LinkedHashSet<String>();
        lhs.add("Java");
        lhs.add("Javascript");
        lhs.add("Java");
        for (Object object : lhs) {
            System.out.println(object);
        }
    }
}
