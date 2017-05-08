# Introduce Named Parameter

## Motivation
The parameters in a method call cannot easily be deduced from the name of the method you are calling

## Mechanics
* Replace the parameters in the calling code with name/value pairs
* Replace the parameters with a Hash object in the receiving method. Modify
the receiving method to use the new Hash.
* Test
