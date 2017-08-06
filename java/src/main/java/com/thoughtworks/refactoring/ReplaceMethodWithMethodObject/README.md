# Replace Method with Method Object

## Motivation

You have a long method that uses local variables in such a way that you cannot apply Extract Method

## Mechanic

* Create a new class. Name it based on the purpose of the method that you are refactoring.
* In the new class, create a private field for storing a reference to an instance of the class in which the method was previously located. It could be used to get some required data from the original class if needed.
* Create a separate private field for each local variable of the method.
* Create a constructor that accepts as parameters the values of all local variables of the method and also initializes the corresponding private fields.
* Declare the main method and copy the code of the original method to it, replacing the local variables with private fields.
* Replace the body of the original method in the original class by creating a method object and calling its main method.
