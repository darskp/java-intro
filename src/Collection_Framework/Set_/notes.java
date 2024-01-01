//! Set

// A predefined interface under the Collection interface in java.util
// Introduced in JDK 1.2
// Collection -> Set -> HashSet, LinkedHashSet, TreeSet
// - LinkedHashSet maintains the insertion order

//! Difference between Set and List

// Set will not maintain any insertion order.
// No duplicates are allowed in a set.
// It is not index-based.
// Null value is allowed.
// No get or set methods are allowed.

// ? How does a Set maintain uniqueness?
// Internally, two methods are responsible for uniqueness:
// - hashCode(): Compares the hashcode of the object or element.
// - equals().

//! What is HashSet?
// A predefined class in java.util
// Introduced in JDK 1.2
// HashSet h = new HashSet();

// - Underlying data structure: HashTable
// HashTable stores the value in a key and value pair.
// - The key is the hashcode of an object.
// - The value is the object/element.
// - Initial capacity is 16.
// - Once it is filled, it will increase by 75% (Fill ratio/load factor - 75%).
// 16 + 12 = 28
// - 4 constructors.
