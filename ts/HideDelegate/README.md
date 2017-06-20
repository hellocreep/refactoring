#Hide Delegate

##Motivation

If a client calls a method defined on one of the fields of the server object, the client needs to know about this delegate object. If the delegate changes, the client also may have to change. You can remove this dependency by placing a simple delegating method on the server, which hides the delegate (Figure 7.1). Changes become limited to the server and don't propagate to the client.

##Steps

1. For each method on the delegate, create a simple delegating method on the server.

2. Adjust the client to call the server.
 ☞ If the client is not in the same package as the server, consider
changing the delegate method's access to package visibility.

3. Compile and test after adjusting each method.

4. If no client needs to access the delegate anymore, remove the server's accessor for the delegate.

5. Compile and test.

