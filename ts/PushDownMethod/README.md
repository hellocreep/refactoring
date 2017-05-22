#Pull Down Method

##Motivation:

Pull Down Method is the opposite of Pull Up Method. I use it when I need to move behavior
from a superclass to a specific subclass, usually because it makes sense only there. You often do this when you use Extract Subclass.

##steps:

• Declare a method in all subclasses and copy the body into each subclass.  
• Remove method from superclass.
• Compile and test.
• Remove the method from each subclass that does not need it.
• Compile and test.
