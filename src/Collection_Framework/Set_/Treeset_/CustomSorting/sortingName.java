package Collection_Framework.Set_.Treeset_.CustomSorting;

import java.util.Comparator;

public class sortingName implements Comparator<Employee>{

    public int compare(Employee x,Employee y){
    return x.name.compareTo(y.name);
    }
    
}


//Comparator
// ------------
// 1. Comparator is a pre-defined interface present in java.util package.
// 2. It was introduced from JDK 1.2 .
// 3. Comparator has an abstract method called as compare().
// syntax : public int compare(Object o1, Object o2);
// Rules to use compare Objects using <<Comparator>>
// -------------------------------------------------
// 1. Design a new class in such a way which implements the Comparator
// interface and specify the Generics type.
// 2. import the Comparator interface.
// 3. Override the compare() by specifying the business logic for comparing
// and sorting.
// 4. Pass The Object of the Class which has the sorting logic to the
// constructor of the TreeSet.