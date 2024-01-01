package Collection_Framework.Set_.Treeset_.DefaultSorting.Example2;

import java.util.TreeSet;

public class StudentSort {

  public static void main(String[] args) {
    Student c1 = new Student(1, "Darshan10");
    Student c2 = new Student(2, "Darshan20");
    Student c3 = new Student(3, "Darshan");
    TreeSet<Student> t = new TreeSet<Student>();
    t.add(c1);
    t.add(c2);
    t.add(c3);
    for (Student Student : t) {
      System.out.println(Student);
    }

    // String s1=new String("C");
    // String s2=new String("D");;
    // System.out.println(s1.compareTo(s2));
    // System.out.println(s2.compareTo(s1));

  }
}
