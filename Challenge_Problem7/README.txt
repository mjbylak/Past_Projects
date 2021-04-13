The Problem: In this Challenge Problem, you'll have a chance to dive a little deeper into mathe-
matical relations. You will write four dierent functions in SageMath: isReflexive, isSymmetric,
isAntisymmetric, and isTransitive. The functions should behave like this:
 The input to the function is a relation on a set, entered as a dictionary.
 The output of the function isReflexive is a Boolean, returning True if the relation that was
input has the reflexive property, or False if it does not have the reflexive property.
 The remaining three functions isSymmetric, isAntisymmetric, and isTransitive should
behave similarly: isSymmetric should return True if the relation is symmetric and False
otherwise; isAntisymmetric should return True if the relation is antisymmetric and False
otherwise; isTransitive should return True if the relation is transitive and False otherwise.

Examples: 
Input:
relation1={1:[1,3,4], 2:[2,3], 3:[3], 4:[3,4]}
isReflexive{relation1)
Output: 
True

Input:
isSymmetric(relation1)
Output:
False

Input:
isAntisymmetric(relation1)
Output:
True

Input:
isTransitive(relation1)
Output:
True