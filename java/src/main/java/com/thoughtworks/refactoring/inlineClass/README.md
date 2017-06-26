# Inline Class

## Motivation

One class is no longer pulling its weight and shouldn't be around anymore.
It often happens because of refactoring that moving other responsibilities out of the class and there is little left.

## Mechanic

* Declare the public protocol of the source class onto the absorbing class. Delegate all these methods to the source class
* Change all references code
* Test
* Move fields and methods
* Delete source class
