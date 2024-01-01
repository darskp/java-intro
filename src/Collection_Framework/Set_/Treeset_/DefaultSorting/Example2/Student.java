package Collection_Framework.Set_.Treeset_.DefaultSorting.Example2;

public class Student implements Comparable<Student> {

  Integer id;
  String name;

  Student(int id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Name: " + name + " id: " + id;
  }

  @Override
  public int compareTo(Student s) {
    // return this.id - s.id;
    return this.id.compareTo(s.id);
  }
//   @Override
//   public int compareTo(Student s) {
//     return this.name.compareTo(s.name);
//   }
}
