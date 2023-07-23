- List.of and List.copyOf are `IMMUTABLE`!
  - These methods not only prevent modifications but also don't change when the original list changes, as they create a new list.
- new Arraylist<>() is `MUTABLE`
  - use immutable
- `Builder pattern` for objects with lots of fields (and some of them are optional)
- Be carefull for creating unecessary objects
    - autoboxing pg 23, pattern matching pg 22
- always override `toString` (easy for debugging)
- equals and hascode
    - Why are these methods important?
        - Efficiency: The hashCode() method allows objects to be stored efficiently in hashed collections. The hash code
          is used to calculate the index at which to store the object. If many objects had the same hash code, it would
          slow down the lookup time, defeating the purpose of hashing.
        - Consistency with Collections: The equals() and hashCode() methods are essential when using objects within
          collections. For example, when you put an object into a HashMap, the map uses the object's hashCode() to
          determine where to store the object. When you attempt to retrieve the object, the map uses hashCode() to find
          it and then uses equals() to ensure it is the correct object.
        - Object Comparisons: They provide a mechanism for comparing objects. This can be useful in a variety of
          scenarios, like filtering out duplicates in a list, or finding a specific object in a list.
- Coparator :read

## CHAPTER 4: Classes and Interaces
- Immutable objects have exactly one state. Functional programming, your function doesn't change the state of the obj
  - pg 81
  - simple and thread safe and can be shared freely
  - downside to change state you need to create a new object
  - summary: make everything as much as possible private and final
  - A skeletal implementation in Java refers to an abstract class that provides a partial or "skeletal" implementation of an interface. It can provide a basic structure or default behavior for certain methods, and leave other methods abstract for subclasses to implement.
    - The skeletal implementation pattern helps reduce the effort required to implement an interface by providing "default" implementations for some (or even all) of the methods.

## CHAPTER 5: GENERICS
- Raw types in Java refer to generic classes or interfaces without their type arguments. For example, if we have a generic class List<E>, List would be the raw type.
  - Using raw types can lead to exceptions at runtime, which is not checked at compile time. Therefore, it's considered a good practice to avoid using raw types when dealing with generics in Java.

- Refer to objects by their interfaces:
  - If you want to swithc implementation, all you have to do is change the class name in the constructor;