## Ingenious Tech World Kotlin Questions

### SET 1 [Basic Questions]

1. Print the Diamond Pattern.

```
                *
             *  *  *
          *  *  *  *  *
        *   *   *   *   *
          *  *  *  *  *
             *  *  *
                *
```

2. Check if the number is Armstrong number or not?
3. Find the GCD of two numbers using Euclidean method.
4. Find the frequency of letters in a string.
5. Check if a number is duck number or not?

### SET 2 [Functions & Classes]

`Functions`

1.  Write a function that takes two integers and returns the larger of the two.
2.  Write a function sumOfList that takes a list of integers and returns the sum of all elements.
3.  Implement a function named isPalindrome that checks whether a given string is a palindrome (reads the same backward as forward).
4.  Create a function factorial that takes an integer n and returns the factorial of n using recursion.

`Class`

1. Define a BankAccount class with properties accountNumber and balance. Implement methods deposit and withdraw to modify the balance, and getBalance to return the current balance.
2. **Inheritance and Polymorphism:**  
   Create an abstract class Shape with an abstract method area. Create two subclasses Rectangle and Circle that implement the area method. Add another method perimeter in both subclasses and demonstrate polymorphism.
3. **Interface Implementation:**
   Create an interface Drawable with a method drawInfo. Implement this interface in two classes Square and Triangle and print the info about the shapes.

### SET 3 [Functions & Classes]

`Collections`

1. Write a function that takes a list of integers and returns a new list with the elements in reverse order.
2. Write a function that takes a list of integers and an integer n, and returns a new list with all elements less than n removed.
3. Write a function that takes a list of strings and returns a map where the keys are the strings and the values are their lengths.
4. Write a function that takes two lists of integers and returns true if the first list is a subset of the second list.
5. Given a list of Person objects (each with name and age properties), sort the list first by age in ascending order and then by name in alphabetical order if ages are equal.

`Null Safety`

1. **Safe Calls and Elvis Operator :**
   Write a function that takes a nullable string and returns its length if it is not null, or -1 if it is null. Use the safe call operator (?.) and the Elvis operator (?:).
2. **Nullability and Collections :**
   Given a list of nullable integers, write a function that returns a list of non-null integers. Use the filterNotNull function.
3. **Handling Null with let :**
   Write a function that takes a nullable string and prints its uppercase version if it is not null, otherwise prints “String is null”. Use the let function.
4. **Null Safety in Data Classes :**
   Define a data class User with nullable properties name and email. Write a function that prints “Incomplete User” if any property is null, otherwise prints the user’s details.
5. **Safe Casting with as :**
   Given a list of Any type, write a function that filters out all elements that are not strings and returns a list of strings. Use safe casting (as?).

### SET 4 [Coroutines & Lamda]

`Coroutines in Kotlin:`

1. **Basic Coroutine Example :** Write a simple coroutine in Kotlin that prints "Hello" and then "World" after a 1-second delay.
2. **Coroutine with Exception Handling :** Write a coroutine in Kotlin that handles exceptions during the execution of tasks.

`Basic try-catch Example:`

-   Write a Kotlin function that takes two integers and divides the first by the second. Use a try-catch block to handle any potential division by zero exceptions and return a meaningful error message.
-   Create a custom exception class in Kotlin called InvalidAgeException. Write a function that checks a person's age and throws nvalidAgeException if the age is less than 18.
-   Write a Kotlin function that accesses an array element by index. Use a finally block to print a message indicating the end of the operation, regardless of whether an exception was thrown.

`Coroutine with Timeout:`

-   Write a Kotlin program using coroutines that performs a long-running task but cancels it if it takes more than 2 seconds to complete. Use the withTimeout function to achieve this.

`Advanced Coding Questions on Lambdas in Kotlin:`

1. **Lambda for Sorting :** Write a Kotlin function that takes a list of pairs containing a name and age, and returns the list sorted by age using a lambda function.
2. **in Functional Programming :** Write a Kotlin program that uses map, filter, and reduce functions with lambdas to process a list of numbers. First, square all the numbers, then filter out the even numbers, and finally sum the remaining numbers.
3. **Lambda with Closures :** Write a Kotlin function that uses a lambda to create a closure. The function should return a lambda that adds a given number to its input.
4. **Lambda with Higher-Order Functions :** Write a Kotlin function that takes another function as a parameter and uses it to transform a list of strings.
5. **Lambdas with Collections:** Write a Kotlin function that uses lambdas to perform a sequence of operations on a list of strings: filter the strings to include only those starting with a specific letter, convert them to uppercase, and then sort them alphabetically.
6. **Lambda with Return Type Inference:** Write a Kotlin function that uses a lambda to calculate the factorial of a given number. The lambda should be assigned to a variable, and the function should use this lambda to compute the factorial.
