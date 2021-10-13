# Assignment 3: Architecture Patterns and Styles

## How to run this project

For exercises 1 through 3, they each have a respective package in the **src** folder. Each package has a Driver class 
that can be run.

Note that every exercise is dependent on **ProductDatabase.txt**, so please keep the root directory intact when testing.

# Exercise 4

## Model View Controller

### Advantages:

•	MVC has good modularity (separation of concerns)

•	Easy to update and modify

•	Easier for developers to work together simultaneously 

### Disadvantages:

•	High coupling, all the modules depend on each other way too much

•	Possibility for slow performance on user interface

•	Can be hard to understand, especially if there are more modules

## Model View Controller + Interfaces

### Advantages:

•	Interfaces are flexible. Single implementation can have several interfaces

•	It is easy to put in new objects for future

•	Using interfaces let architecture have high reusability

### Disadvantages:

•	Can take a lot of time to make updates, need to update individual classes that implement the interfaces 

## Observer Pattern

### Advantages:

•	Loose coupling, the modules are less dependent on each other

•	You can update classes/objects without changing observer class

### Disadvantages:

•	If not implemented correctly, can result in higher complexity and unexpected, unwanted results