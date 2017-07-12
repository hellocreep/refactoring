#Extract Class

##Motivation
You've probably heard that a class should be a crisp abstraction, handle a few clear responsibilities, or some similar guideline. In practice, classes grow. You add some operations here, a bit of data there. You add a responsibility to a class feeling that it's not worth a separate class, but as that responsibility grows and breeds, the class becomes too complicated. Soon your class is as crisp as a microwaved duck.

Such a class is one with many methods and quite a lot of data. A class that is too big to understand easily. You need consider where it can be split, and you split it. A good sign is that a subset of the data and a subset of the methods seems to go together. Other good signs are subsets of data that usually change together or are particularly dependent on each other. A useful test is to ask yourself what would happen if you removed a piece of data or method. What other fields and methods would become nonsense?

One sign that ofen crops up later in development is the way the class is subtyped. You may find that subtyping affects only a few features or that some features need to be subtyped one way and other features a different way.

##Mechanics

- Decide how to split the responsibilities of class.
- Create a new class to express the split-off responsibilities.
  *If the responsibilities of the old class no longer match its name, rename the old class*
- Make a link from the old to the new class.
  *You may need a two-way link, but don't make the back link until you find you need it.*
- Use Move Field on each field you wish to move.
- Compile and test after each move.
- Review and reduce the interfaces of each class.
  *If you did a two-way link, examine to see whether it can be made one way.*
- Decide whether to expose the new class. If you do expose the class, decide whether to expose it as a reference object or as an immutable value object.