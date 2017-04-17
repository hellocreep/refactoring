#Decompose Conditional

##Motivation

One of the most common areas of complexity in a program lies in complex
conditional logic. As you write code to test conditions, and to do
various things depending on various conditions, you quickly end up
with a pretty long method. Length of a method is in itself a factor that
makes it harder to read, but conditions increase the difficulty. The
problem usually lies in the fact that the code, both in the condition
checks and in the actions, tells you what happens but can easily
obscure the why.
As with any large block of code, you can make your intention clearer
by decomposing it, replacing chunks of code with a method call that is
named after the intention of that block of code. With conditions you
can get a further benefit by doing this for the conditional part and each
of the alternatives. This way you highlight the condition and make it
clearly what you are branching on, and why you are doing the branching.


##Step

1.Extract the condition into its own method.

2.Extract the ‘then part’ and the ‘else part’ into their own methods.

If I find a nested conditional I will usually first look to see if I should
Replace Nested Conditional with Guard Clauses . If that does not
make sense I will decompose each of the conditionals. 