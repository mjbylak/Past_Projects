Program Information for how it works is included in the CP10RecurrenceSolverAssignment file

# Programming Challenge Problem 10

## Linear homogeneous recurrence relation solver

### Goal of this problem

In this Challenge Problem, you will write a function in Python called `rrsolver` that does the following: 

+ The function `rrsolver` accepts four numbers, which are the _coefficients_ and _initial conditions_ of a linear second-order homogeneous recurrence relation written in the form
$$a_n = c_1a_{n-1} + c_2a_{n-2} \quad a(0) = A, a(1) = B$$
and the input would look like ``rrsolver(c1, c2, A, B)``. For example, if the recurrence relation were
$$a_n = a_{n-1} + 6a_{n-2} \quad a(0) = 3, a(1) = 6$$
then the input would be ``rrsolver(1, 6, 3, 6)``. In other words there are four inputs, in this order: The coefficient on $a_{n-1}$, the coefficient on $a_{n-2}$, the value of $a(0)$, and the value of $a(1)$. We assume that the recurrence relation has been written as above, with $a_n$ on the left side and everything else on the right side. We are also assuming for this problem that we are only dealing with second-order equations, not third-order or higher. 

As you know from class work, linear homogeneous recurrence relations can be solved using the characteristic root method. What the `rrsolver` does with its input depends on how many real-number characteristic roots the recurrence relation has: 

+ If there are two real-number characteristic roots or one repeated characteristic root, then `rrsolver` prints off a string that represents the formula for the closed formula solution for the recurrence relation using the format shown later below; and
+ If there are _no_ real-number characteristic roots, then `rrsolver` simply prints `"There are no real roots"`. 

Here are some examples of how this function should look when called. Especially, note the format of the output when real characteristic roots are encountered: 

    rrsolver(1,2,2,7)
    > a(n) = 3*(2.0)^n + (-1)*(-1.0)^n 
    
The inputs 1,2,2,7 correspond to the recurrence relation $a_n = a_{n-1} + 2a_{n-2}$ with initial conditions $a(0) = 2$ and $a(1) = 7$. Likewise here are some more sample inputs and outputs:
    
    rrsolver(0,-1,2,3)
    > There are no real roots
    
    rrsolver(0, 1/4, 1, 0)
    > a(n) = (0.5)*(0.5)^n + (0.5)*(-0.5)^n
    
    rrsolver(7, -10, 2, 1) 
    > a(n) = (-1)*(5.0)^n + (3)*(2.0)^n 
    
    rrsolver(4,-4,6,8)    # This has a repeated root of r = 2
    > a(n) = 6*(2.0)^n - 2n*(2.0)^n
    
(Above, the `>` symbol just represents where the output cell would be in a Jupyter notebook. It's not part of the actual output.) 

So notice that if there are two distinct real roots `r` and `s`, then the output format is the string 

    a(n) = x*(r)^n + y*(s)^n
    
Where `r` and `s` are the roots and `x` and `y` are the coefficients, found in the characteristic root method. If there is only one repeated root `r`, then the output format is the string

    a(n) = x*(r)^n + yn*(r)^n 
    
    