# Remove Setting Method

## Motivation

A field should be set at creation time and never altered.
Remove any setting method for that field.

## Mechanic

* Check that the setting method is called only in the constructor, or in a method called by the constructor.
* Modify the constructor to access the variables directly.
```
  You cannot do this if you have a subclass setting the private fields
  of a superclass. In this case you should try to provide a protected
  superclass method (ideally a constructor) to set these values. Whatever
  you do, don't give the superclass method a name that will confuse it with
  a setting method.
```
* Compile and test.
* Remove the setting method and make the field final.
* Compile.