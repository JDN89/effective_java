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