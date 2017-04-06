# Consolidate Duplicate Conditional Fragments

## Motivation

Sometimes you find the same code executed in all legs of a conditional. In that case you should move the code to
outside the conditional. This makes clearer what varies and what stays the same.

## Mechanic

* Identify code that is excuted the same way regardless of the condition.
* If the common code is at the beginning, move it to before the conditional.
* If the common code is at the end, move it to after the conditional.
* If the common code is in the middle, look to see whether the code before or after it changes anything. If it does,
  you can move the common code forward or backward to the ends. You can then move it as described for code at the end
  or the beginning.
* If there is more than a single statement, you should extract that code into a method.
