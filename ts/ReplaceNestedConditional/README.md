#Replace Nested Conditional with Guard Clauses

##Motivation

I often find that conditional expressions come in two forms. The first
form is a check whether either course is part of the normal behavior,
the second case is where one answer from the conditional indicates
normal behavior and the other indicates an unusual condition.

These kinds of conditionals have a different intention, and this intention
should come through in the code. If both are part of normal
behavior, then use a condition with an if and an else leg. However if
the condition is an unusual condition then check the condition and
return if the condition is true. This kind of check is often called a Guard
Clause [Beck].
The key point about this refactoring is one of emphasis. If you are
using an if-then-else construct you are giving equal weight to the if leg
and the else leg. This communicates to the reader that they are equally
likely and important. Instead the guard clause says “this is rare, and if
it happens do something and get out”.
I often find I use this refactoring when I’m working with a programmer
who has been taught to have only one entry and one exit point
from a method. One entry point is enforced by modern languages, and
one exit point is really not a useful rule. Clarity is the key principle: if it
is clearer with one exit point then use one exit point, otherwise don’t.

##Steps

1.For each check put the guard clause in.
  ☞ The guard clause will either return, or throw an exception.

2.Compile and test after each check is replaced with a guard clause.
  ☞ If all the guard clauses yield the same result then Consolidate the Conditional
Expressions.

