# Replace Temp with Chain

##Motivation
Calling methods on different lines technically gets the job done, but at times it makes sense to chain method calls together and provide a more fluent interface. In the above examples, assigning an expectation to a local variable is only necessary so that the arguments and return value can be specified. The solution utilizing Method Chaining removes the need for the local variable. Method Chaining can also improve maintainability by providing an interface that allows you to compose code that reads naturally.

##Mechanics
* Return self from methods you wish to allow chaining from
* Test
* Remove the local variable and chain the method calls
* Test