# Speed Reader

## About

_(TODO: insert a description of the project here!)_ 

### Authors

*   _(TODO: insert your names here!)_
*  ...

### Resources

*   _(TODO: list your resources here!)_
*   ...
*   `DrawingPanel.java` adapted from _[Building Java Programs](https://www.buildingjavaprograms.com/) by Reges and Stepp.

## Write-up

### Semantic Mysteries

#### Problem 1.1

change1: takes an int x as input and changes the value of that x to 5.
Here, Java passes by value.
This will not change the value of x in a Cell outside of this function.

change2: takes a Cell c as input and changes the value of x in that cell to 5.
Here, Java passes by reference.
This does change the value of c.x to 5.

change3: takes a Cell c as input and changes the value of x in that cell to 5, before setting the Cell to a new Cell of value 0.
Here, Java passes by reference.
Despite setting c to a new Cell, this does not change the value of c.x to 0 outside of the function, but instead to 5.

Passing an object with an arbitrary number of fields is not more costly than passing a primitive, since in both cases, we are fundamentally dealing with the same type. (?)


#### Problem 1.2

What is the this variable in a method, and where does it come from? How do these four classes differ with respect to their increment methods?
What’s the rule for variable look-up in Java? How does this differ from function calls in C?

The this keyword is used to refer to a field of an object within the constructors and methods of the class of that object. 

In Counter1, the increment function increments the internal value of a Counter1 object by 1. It does not use `this` as it is only considering one value.

In Counter2, the increment function attempts to increment the internal value of a Counter2 object by some given value. It does not use `this`, which results in only the given value and not the value field of the Counter2 object being incremented.

In Counter3, the increment function correctly increments the object field by using the `this` keyword to denote the incrementee as the value field, while incrementing by the passed value. 

In Counter4, the passed value is incremented instead of the object field value. it gives the object field access to the parameter instead because the value is storead back into the parameter 'value', the object feild stays the same.

In Java, for two variables of the same name, Java assumes the variable being referred to in a given method is the closest variable to that method.

#### Problem 1.3



#### Problem 1.4

_(TODO: fill me in!)_

#### Problem 2.1

(always: ✓, sometimes: ?, never: ✗)

*   Point A:
    + `x1 == 0`:
    + `x2 < 0`:
*   Point B:
    + `x1 == 0`:
    + `x2 < 0`:
*   Point C:
    + `y1 < 5`:
    + `y2 > 0`:
*   Point D:
    + `z > y1`:
    + `z < 0`:

#### Problem 2.2

(always: ✓, sometimes: ?, never: ✗)

|         | `s.length >= 2` | `ret.length() > 0` | `ret.length() % 2 == 0`
| ------- | --------------- | ------------------ | -----------------------
| Point A |                 |                    |
| Point B |                 |                    |
| Point C |                 |                    |
| Point D |                 |                    |
| Point E |                 |                    |

### Empirical Complexity Analysis

_(TODO: fill me in!)_
