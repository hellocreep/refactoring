# Replace Data Value with Object

## When
You have a data item that needs additional data or behavior.

## Motivation
Improves relatedness inside classes. Data and the relevant behaviors are inside a single class.

## Mechanics
Before you begin with refactoring, see if there are direct references to the field from within the class. If so, use Self Encapsulate Field in order to hide it in the original class.
  
*  Create a new class and copy your field and relevant getter to it. In addition, create a constructor that accepts the simple value of the field. This class will not have a setter since each new field value that is sent to the original class will create a new value object.
*  In the original class, change the field type to the new class.
*  In the getter in the original class, invoke the getter of the associated object.
*  In the setter, create a new value object. You may need to also create a new object in the constructor if initial values had been set there for the field previously.
