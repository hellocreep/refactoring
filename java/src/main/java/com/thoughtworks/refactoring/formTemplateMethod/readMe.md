#Form Template Method

* Split algorithms in the subclasses into their constituent parts described in separate methods. *Extract Method* can help with this.

* The resulting methods that are identical for all subclasses can be moved to a superclass via *Pull Up Method*.

* The non-similar methods can be given consistent names via *Rename Method*.

* Move the signatures of non-similar methods to a superclass as abstract ones by using *Pull Up Method*. Leave their implementations in the subclasses.

* And finally, pull up the main method of the algorithm to the superclass. Now it should work with the method steps described in the superclass, both real and abstract.