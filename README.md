# Speed Reader

## About

This project consists of a speed reader program that implements Rapid Serial Visual Presentation (RSVP) to facilitate speed reading. 
The program takes arguments of a file name, panel width, panel height, font size, and words per minute (WPM) from the command line to display a window of the given height and width with each word in the given file being displayed in the Courier font at the given font size at the given WPM. 
  Usage: SpeedReader <filename> <width> <height> <font size> <wpm>
In the case that these arguments are not provided, the program exits with a usage message. There is no error checking for individual arguments.

We used several texts from online sources like Wikipedia as testing material for our program, links to which can be found in the 'Resources' section. We also tested our program on three users with varying speed reading experience.

### Authors

*  Eva Kapoor
*  Robel Gebeyehu
*  Thomas Bao

### Resources

*   `DrawingPanel.java` adapted from _[Building Java Programs](https://www.buildingjavaprograms.com/) by Reges and Stepp.
*  Aurora reading link  :(https://en.wikipedia.org/wiki/Aurora)
*  Cacao reading link   :(https://en.wikipedia.org/wiki/Chocolate)
*  Coffee reading link  :(https://en.wikipedia.org/wiki/Coffee)
*  Fastfood reading link:(https://en.wikipedia.org/wiki/Fast_food)
*  Sleep reading link   :(https://en.wikipedia.org/wiki/Sleep)
*  Luge reading link    :(https://en.wikipedia.org/wiki/Luge)
*  Compost reading link :(https://en.wikipedia.org/wiki/Compost)
*  Bicycle reading link :(https://en.wikipedia.org/wiki/Bicycle)

## Write-up

## Questions

Haoson Liu @liuhonf@grinnell.edu
Jefferson Valladares: valladar2@grinnell.edu
Brynna Schwab: schwabbr@grinnell.edu

Aurora questions:
1. What are the two common names for an aurora? 
2. What causes an aurora? 
3. What is the most commone color for an Aurora? 
4. Where on Earth are the best places to see an aurora?

Hanson (500 WPM): 1,half 2,correct 3,correct 4,correct
Jefferson (No speedreader): 1,correct 2,correct 3,correct 4,correct 
Brynna (350 WPM): 1,correct 2,correct 3,half 4,correct 


Coffee questions:
1. What are the two main types of coffee beans?
2. What is the name of the stimulant found in coffee that makes people feel awake?
3. What country is named as the biggest producer of coffee?
4. According to the story, which animal first ate the coffee berries and became energetic?

Hanson (250 WPM): 1,nun 2,correct 3,correct 4,correct
Jefferson (500 WPM): 1,half 2,correct 3,correct 4,correct 
Brynna (500 WPM): 1,correct 2,correct 3,half 4,correct 


Cacao questions:
1. What are the two main parts that chocolate liquor is separated into? 
2. What is the key ingredient that white chocolate does not have?  
3. Which ancient Central American civilizations are mentioned as drinking chocolate?  

Hanson (350 WPM): 1,half 2,nun 3,correct
Jefferson (250 WPM): 1,half 2,correct 3,correct  
Brynna (No speed reader): 1,correct 2,correct 3,correct


Sleep questions:
1. What does the acronym "REM" stand for in REM sleep?
2. What is the approximate length of one full sleep cycle?
3. What does the body's internal clock responds to, which tells it to be awake or to sleep?

Hanson (No speed reader): 1,correct 2,correct 3,correct 
Jefferson (350 WPM): 1,half 2,correct 3,correct 
Brynna (250 WPM): 1,correct 2,half 3,correct 

CONCLUSION: All of our participants demonstrated that they were able to comprehend what they were reading with the speed reader, even at higher speeds.

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

Passing an object with an arbitrary number of fields is not more costly than passing a primitive, since in both cases, we are fundamentally dealing with the same type.


#### Problem 1.2

The this keyword is used to refer to a field of an object within the constructors and methods of the class of that object. 

In Counter1, the increment function increments the internal value of a Counter1 object by 1. It does not use `this` as it is only considering one value.

In Counter2, the increment function attempts to increment the internal value of a Counter2 object by some given value. It does not use `this`, which results in only the given value and not the value field of the Counter2 object being incremented.

In Counter3, the increment function correctly increments the object field by using the `this` keyword to denote the incrementee as the value field, while incrementing by the passed value. 

In Counter4, the passed value is incremented instead of the object field value. it gives the object field access to the parameter instead because the value is storead back into the parameter 'value', the object feild stays the same.

In Java, for two variables of the same name, Java assumes the variable being referred to in a given method is the closest variable to that method.

#### Problem 1.3

A static member can be called anywhere in the class where it is defined. It is not attached to any one object.

a. This code does not work because we are using the this keyword on a static value. We can fix this code by calling `value` without the this keyword. We should then also change the name of the parameter passed into increment to a clearer name.

b. This code does not work because the printGreeting method is a non-static method that is not called through an object.


#### Problem 1.4

When a new Counter is initialized, it is stored in a new address location. The `==` operator compares the addresses of the two object, and they will not be considered the same.

When initializing a string for the first time, it is also stored in a new address location. However, when another string is stored, it will look for the same string contents in that area and connect the new string to the original string stored there. Thus, when the `==` operator compares the two addresses, they will be considered the same.

When using nextLine, the input is saved at two different addresses, so the `==` operator will return false no matter what.

#### Problem 2.1

(always: ✓, sometimes: ?, never: ✗)

*   Point A:
    + `x1 == 0`: ?
    + `x2 < 0`: ?
*   Point B:
    + `x1 == 0`: ?
    + `x2 < 0`: ✗
*   Point C:
    + `y1 < 5`: ?
    + `y2 > 0`: ?
*   Point D:
    + `z > y1`: ✗
    + `z < 0`: ?

#### Problem 2.2

(always: ✓, sometimes: ?, never: ✗)

|         | `s.length >= 2` | `ret.length() > 0` | `ret.length() % 2 == 0`
| ------- | --------------- | ------------------ | -----------------------
| Point A |        ?        |          ✗         |            ✓
| Point B |        ✓        |          ✗         |            ✓
| Point C |        ✓        |          ?         |            ✓
| Point D |        ✓        |          ✓         |            ✓
| Point E |        ✓        |          ✓         |            ✓

### Empirical Complexity Analysis

Comparing graphs, the operation counting method is more accurate for determining and measuring time complexity. The operation counting method shows distinctions between programs with different time complexities more clearly than the wall-clock method.
