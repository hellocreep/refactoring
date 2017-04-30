# Inline method

## Motivation

A method simply delegates to another method. In itself, this delegation is no problem.
But when there are many such methods, they become a confusing tangle that is hard to sort through.

Often methods are not too short originally, but become that way as changes are made to the program.
So don't be shy about getting rid of methods that have outlived their use.

## Mechanic

* Make sure that the method is not redefined in subclasses. If the method is redefined, refrain from this technique.
* Find all calls to the method. Replace these calls with the content of the method.
* Delete the method.

## ShortCut for Inline Method in Intellij

option + command + N