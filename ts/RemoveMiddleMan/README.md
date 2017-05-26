#Remove Middle Man

##Motivation:

In the motivation for Hide Delegate, I talked about the advantages of encapsulating the use of a delegated object. There is a price for this. The price is that every time the client wants to use a new feature of the delegate, you have to add a simple delegating method to the server. After adding features for a while, it becomes painful. The server class is just a middle man, and perhaps it's time for the client to call the delegate directly.
It's hard to figure out what the right amount of hiding is. Fortunately, with Hide Delegate and Remove Middle Man it does not matter so much. You can adjust your system as time goes on. As the system changes, the basis for how much you hide also changes. A good encapsulation six months ago may be awkward now. Refactoring means you never have to say you're sorry—you just fix it.
Mechanics

##steps:

1. Create an accessor for the delegate.
2. For each client use of a delegate method, remove the method from the server and replace the call in the client to call method on the delegate.
3. Compile and test after each method.

