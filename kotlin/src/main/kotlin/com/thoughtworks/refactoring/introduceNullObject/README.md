#Introduce Null Object

##Motivation

The essence of polymorphism is that instead of asking an object what type it is and then invoking some behavior based on the answer, you just invoke the behavior. The object, depending on its type, does the right thing. One of the less intuitive places to do this is where you have a null value in a field.

##Mechanics

* Create a subclass of the source class to act as a null version of the class. Create an `isNull` operation on the source class and the null class. For the source class it should return false, for the null class it should return true.

* Compile

* Find all places that give out a null when asked for a source object. Replace them to give out a null object instead.

* Find all places that compare a variable of the source type with null and replace them with a call `isNull`.

* Compile and test

* Look for cases in which clients invoke an operation if not null and do some alternative behavior if null.

* For each of these cases override the operation in the null class with the alternative behavior.

* Remove the condition check for those that use the override behavior, compile, and test.
