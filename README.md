1a)
A simple Java class representing a student with a name and grade, including validation for the grade (between 0 and 100).

Features
Name Getter/Setter: Get and set the student's name.

Grade Getter/Setter: Get and set the student's grade with validation. Invalid grades default to 0.

Methods
getName(): Returns the student's name.

setName(String name): Sets the student's name.

getGrade(): Returns the student's grade.

setGrade(int grade): Sets the student's grade (0-100). Invalid grades default to 0.
1b)
A simple Java class that provides methods to multiply numbers. It includes overloaded methods for multiplying two or three integers.

Methods
multiply(int a, int b): Multiplies two integers.

multiply(int a, int b, int c): Multiplies three integers

A simple Java class representing an animal. The class includes a method to simulate making a sound.

Method
makeSound(): Prints a generic message indicating the animal makes a sound.

This Java class represents a Dog that extends the Animal class and overrides the makeSound() method to simulate a dog's barking.

Method
makeSound(): Prints a message indicating the dog barks ("Woof Woof!").

This Java class represents a Cat that extends the Animal class and overrides the makeSound() method to simulate a cat's meowing.

Method
makeSound(): Prints a message indicating the cat meows ("Meow Meow!").

This Java class represents an abstract Appliance with an abstract method turnOn(). Any subclass of Appliance must implement the turnOn() method to define how the appliance is turned on.

Method
turnOn(): An abstract method that must be implemented by subclasses to specify how the appliance is turned on.

This Java class represents a Fan that extends the abstract Appliance class and implements the turnOn() method to define how the fan is turned on.

Method
turnOn(): Prints a message indicating that the fan is now spinning.

This Java class represents a TV that extends the abstract Appliance class and implements the turnOn() method to define how the TV is turned on.

Method
turnOn(): Prints a message indicating that the TV is now displaying channels.

This Java program performs division of two numbers input by the user. It handles the case of division by zero with an error message.

Features
Prompts the user to enter two integers.

Divides the first number by the second and displays the result.

Catches ArithmeticException for division by zero and displays an appropriate message.

Method
divideNumbers(): Takes user input, performs division, and handles division by zero.

This Java program demonstrates various concepts such as object-oriented programming, method overriding, polymorphism, exception handling, and method overloading.

Features
Student Class:

Creates a Student object with a name and grade.

Displays the student's name and grade, ensuring the grade is validated (max 100).

Math Class:

Demonstrates method overloading with multiplication methods for two and three numbers.

Animal, Dog, and Cat Classes:

Demonstrates method overriding and polymorphism with Animal, Dog, and Cat classes.

Each animal makes a different sound.

Appliance, Fan, and TV Classes:

Demonstrates abstract class implementation, with Fan and TV classes overriding the turnOn() method.

Division Program:

Handles division with exception handling for division by zero using try-catch.
