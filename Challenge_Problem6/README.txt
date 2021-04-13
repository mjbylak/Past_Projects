The Problem: In this Challenge Problem, you'll have a chance to dig a little deeper into func-
tions. You will write four dierent functions in SageMath: isFunction, isOneToOne, isOnto, and
inverse. The functions should behave like this:
 There are three inputs to each function: the domain, in the form of a list without repeated
entries; the codomain, in the form of a list; and a relation on the domain/codomain, in the
form of a list whose entries are two-element lists [x; y] with x in the domain and y in the
codomain.
 The output of the function isFunction is a Boolean, returning True if the relation that was
input is a function, or False if the relation is not a function.
 The functions isOneToOne, and isOnto, should behave similarly: isOneToOne should return
True if the relation is a function that is 1-1 (you should test the input to ensure you are given
a function), and return False otherwise; isOnto should return True if the relation a function
that is onto and False otherwise;
 The function inverse should behave as follows:
{ If the input is a function that is 1-1 and onto, then return the inverse function in the
form of a list whose entries are 2-element lists (just like the function that you take as
input).
{ if the input is not a function, raise an exception with the string `Input is not a
function' (you can do this using an if statement combined with the code raise
Exception(`Input is not a function')).
{ if the input is a function, but is not 1-1 or not onto, raise an exception with the string
`Input is not invertible'
