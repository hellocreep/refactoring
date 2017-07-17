#Extract Interface

##Motivation

Classes use each other in several ways. Use of a class often means ranging over the whole area of responsibilities of a class. Another case is use of only a particular subset of a class’s responsibilities by a group of clients. Another is that a class needs to work with any class that can handle certain requests.

For the second two cases it is often useful to make the subset of responsibilities a thing in its own right, so that it can be made clear in the use of the system. That way it is easier to see how the responsibilities divide. If new classes are needed to support the subset, it is easier to see exactly what fits in the subset.

##Mechanics

* Create an empty interface.

* Declare the common operations in the interface.

* Declare the relevant class(es) as implementing the interface.

* Adjust client type declarations to use the interface.
