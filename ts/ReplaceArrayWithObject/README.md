#Motivation

Arrays are a common structure for orgnizing data. However, they should be used only to contain a collection of similar objects in some order. Sometimes, however, you see them used to contain a number of different things. Conventions such as "the first element on the array is the person's name" are hard to remember. With an object you can use names of fields and methods to convey this information so you don't have to remember it or hope the comments are up to date. You can also encapsulate the information and use Move Method to add behavior to it.

#Mechanics

  1. Create a new class to represent the information in the array. Give it a public field for the array.
  2. Change all users of the array to use the new class.
  3. Compile and test.
  4. One by one, add getters and setters for each element of the array. Name the accessors after the purpose of the array element. Change the clients to use the accessors. Compile and test after each change.
  5. When all array accesses are replaced by methods, make the array private.
  6. Compile.
  7. For each element of the array, create a field in the class and change the accessors to use the field.
  8. Compile and test after each elements is changed.
  9. When all elements have been replaced with fields, delete the array.