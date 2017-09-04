# Pull Up Constructor Body

## Motivation

* In Java, subclasses cannot inherit a constructor, so you cannot simply apply Pull Up Method to the subclass constructor and delete it after removing all the constructor code to the superclass. In addition to creating a constructor in the superclass it is necessary to have constructors in the subclasses with simple delegation to the superclass constructor.

* In C++ and Java (if you did not explicitly call the superclass constructor) the superclass constructor is automatically called prior to the subclass constructor, which makes it necessary to move the common code only from the beginning of the subclass constructors (since you will not be able to call the superclass constructor from an arbitrary place in a subclass constructor).

* In most programming languages, a subclass constructor can have its own list of parameters different from the parameters of the superclass. Therefore you should create a superclass constructor only with the parameters that it truly needs.

## Mechanic

* Create a constructor in a superclass.
* Extract the common code from the beginning of the constructor of each subclass to the superclass constructor. Before doing so, try to move as much common code as possible to the beginning of the constructor.
* Place the call for the superclass constructor in the first line in the subclass constructors.