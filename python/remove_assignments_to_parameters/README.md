# Remove Assignments To Parameters

## Motivation
The reasons for this refactoring are the same as for Split Temporary Variable,
but in this case we are dealing with a parameter, not a local variable.


## Mechanic
* Create a local variable and assign the initial value of your parameter.
* In all method code that follows this line, replace the parameter with your new local variable.
