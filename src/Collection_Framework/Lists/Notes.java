//! List Collection Framework - Lists
// - Predefined interface
// - java.util
// - Introduced in JDK 1.2

// Under List, there are 4 types:

// 1. ArrayList
// 2. Vector
// 3. Stack
// 4. LinkedList

// Specifications:
// 1. Insertion order
// 2. Duplicates allowed
// 3. Indexed-based
// 4. Null can be inserted

// Upcasting - Subclass object and superclass reference; here, it is an interface
// List l =
// new ArrayList()
// new Vector()
// new Stack()
// new LinkedList()

//! 1. ArrayList
// - Predefined class
// - java.util
// - 4 Specifications
// - Initial capacity of ArrayList is 10
// - It is dynamic
// Underlying data structure: Resizable and growable array

// Example:
// ArrayList l = new ArrayList();
// l.add(10);
// l.add(20);
// ...
// l.add(100)

// - If the ArrayList capacity is full, adding a new item will create a new array, calculated as ((currentCapacity*3)/2)+1.
// - All objects from the old array are copied to the new array, and the garbage collector is invoked.
// - References will be updated.

// ArrayList implements 4 interfaces - List, RandomAccess, Cloneable, Serializable
