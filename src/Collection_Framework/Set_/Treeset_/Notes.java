// TreeSet

// - A predefined implementation class of the java.util package - it sorts homogeneous objects into the TreeSet, and we can't store heterogeneous objects because a comparison is needed.
// - Introduced in JDK 1.2

// When we use the add() method, internally the compareTo() method is called, which returns an int value: +1, -1, 0.

// +1 -> if it is greater than
// -1 -> if it is lesser than
// 0 -> if it is equal

// Underlying data structure is a binary tree.

// - If the result of the difference is +ve, the node moves to the RHS.
// - If -ve, the node moves to the LHS.
// - If zero, duplicates are neglected.

// Example:
// 1. t.add(30); - root node
// 2. t.add(40);
//     40.compareTo(30); => 40-30 => 10 -> +ve - RHS
// 3. t.add(20);
//     20.compareTo(30); => 20-30 => -ve -> LHS

// Traversing order - left node - root node - right node (inorder)

// If it is a character:
// t.add("apple");
// t.add("Banana");
// ASCII values will be compared.

// compareTo - a method present inside the <<Comparable>> interface.

// Example using Integer:
// Integer a = 10;
// int b = 30; - won't work ==> it is a primitive datatype and doesn't have a compareTo method
// Integer b = 20;
// System.out.println(a.compareTo(b));
// System.out.println(b.compareTo(a));
// System.out.println(a.compareTo(a));
