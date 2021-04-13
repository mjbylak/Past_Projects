Program Information for how it works is included in the CP12CompAssistedCount file


In this Challenge Problem, you will use Python to investigate a difficult counting problem; using the work you've don in Python, you will **make a conjecture** about the answer to the problem and **provide evidence** that your conjecture is true.  Before explaining what you will do with Python, let's first introduce the problem.

### The problem: Seating disaster

**You are not being asked to solve this problem!  Do not attempt to solve this problem!**

> 100 movie-goers have bought tickets to see the sold out box office hit "Cube 2: Hypercube."  The theater has assigned seats, so each customer has a ticket with their seat (a number 1-100) printed on it.  The customers line up to enter the theater.  The first person in line has lost their ticket, so they sit in a random seat.  The second person enters, and sits in their assigned seat (if it is empty) or a randomly chosen empty seat (if their seat is taken).  Each person in the line does the same thing, one after another.  What is the probability that the last person in line gets to sit in their own seat?

This problem is impossible to solve by a brute force computation (there are more possible arrangements of seats than there are atoms in the universe).  There is a clever way to answer the problem, but that is not the point of this assignment.  Instead, you will write Python code to simulate this scenario; run your simulation many many times; and make a conjecture about the answer to the problem.

### Your assignment

Write a function in Python called `RunExperiment` that does the following: 

+ The function `RunExperiment` accepts a single input, ``SeatAssignment`` which is a _list that contains the seating assignment of everyone in the line_.  
  - For example, if there are only 6 seats, and 6 people in the line, then the input ``[4, 2, 0, 3, 5, 1]`` means: the first person in line is assigned to seat 4; the second person is assigned seat 2; the third person is assigned seat 0, etc. (seats are numbered starting at 0)  Specifics about the input are:
  - **The seat assignment of person with the lost ticket is the first element of this list**
  - You may assume the input contains every number from 0 to ``len(SeatAssignment)`` exactly once
  - It may be helpful to write your code so that it accepts lists of any length (instead of only length 100 lists) for testing purposes.  _However, I will only evaluate your code with valid inputs of length 100._
+ The function `RunExperiment` simulates the problem described above, and ``return``s a list, ``ActualSeating``, that specifies the location of every movie-goer after they have taken their seats.
  - If there are only six seats, then the list ``[3, 2, 0, 1, 5, 4]`` means: the first person in line sat in seat 3; the second person sat in seat 2; the third person sat in seat 0, etc.
  
Your code must **actually simulate the scenario** in the sense that your code should first randomly assign a seat to the first person, then go through each member of the line placing them in their seat (if empty) or in a random empty seat (if their seat is taken).  _Read further for information about generating integers in Python._

Additionally, you will write a function in Python called `IterateExperiment` that does the following:
+ The function `IterateExperiment` takes two inputs: `SeatAssignment`, and `n`.  The first is a _list that contains the seating assignment of everyone in the line_.  The second input is the number of times the experiment will be run.
+ The function `IterateExperiment` calls `RunExperiment` a total of `n` times, and counts the number of times that the last person in line sits in their assigned seat.  `IterateExperiment` returns this count.
+ It may be helpful to write your code so that it accepts lists of any length (instead of only length 100 lists) for testing purposes.  _However, I will only evaluate your code with valid inputs of length 100._

Finally, you will make a conjecture about the answer to the problem described above.  Make your conjecture in a Markdown cell below all of your code.  Explain how your work provides evidence that the conjecture is true.  Does your work **prove** that your conjecture is correct?

Here are some examples of how this `RunExperiment` could look when called.  _Note that the outputs are not entirely random.  On first execution, the first person in line randomly sits in seat 4; the next three people sit in their assigned seats; the fifth person (who is assigned seat 4) randomly chooses from the empty seats (1 and 5), the last person takes the only remaining seat (1).

    RunExperiment([5, 2, 0, 3, 4, 1])
    > [4, 2, 0, 3, 5, 1]
    
    RunExperiment([4, 2, 0, 3, 5, 1])
    > [3, 2, 0, 1, 5, 4]
    
(Above, the `>` symbol just represents where the output cell would be in a Jupyter notebook. It's not part of the actual output.) 

Similarly, the function `IterateExperiment` might produce the following output.
 
     IterateExperiment([5, 2, 0, 3, 4, 1] , 50)
     > 29

Meaning that the last person sat in their assigned seat $\frac{29}{50}$ times.    