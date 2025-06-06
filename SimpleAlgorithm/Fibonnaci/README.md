# Simple Algorithms - Fibonacci Implementation in Java

This repository contains Java implementations of the algorithm for generating the Fibonacci sequence, demonstrating both iterative and recursive approaches. The project serves as a practical example to understand the differences in implementation and performance between these two techniques. The content complements the "DSA Simple Algorithm" tutorial from W3Schools.

## About Fibonacci Numbers

Fibonacci numbers form a sequence where each number is the sum of the two preceding ones, starting with 0 and 1. The sequence is defined as: 0, 1, 1, 2, 3, 5, 8, 13, 21, ....

## Implementations

The project includes the following implementations for generating Fibonacci numbers:

1.  **Iterative Approach (using `for` loop):**
    * `Fibonnaci.LoopFibonnaci(int num)`: Generates a list of the first `num` Fibonacci numbers using a `for` loop. This is an efficient implementation with linear time complexity $O(n)$.

2.  **Recursive Approach:**
    * `Fibonnaci.getFibonacciNumber(int f)`: Calculates the `f`-th Fibonacci number directly from the recursive definition $F(n) = F(n-1) + F(n-2)$.
        
    * `Fibonnaci.RecursiveFibonnaci(int num)`: Constructs a list of the first `num` Fibonacci numbers using successive calls to `getFibonacciNumber`.

## Project Structure

* `src/fibonacciNumberAlgorithm/FibonnaciMain.java`: Application entry point, containing the `main` method for user interaction, prompting for the number of terms or the index position for calculation.
* `src/fibonacciNumberAlgorithm/Fibonnaci.java`: Contains the implementations of the `LoopFibonnaci`, `getFibonacciNumber`, and `RecursiveFibonnaci` methods.

## How to Run

To compile and execute the project:

1.  Clone this repository.
2.  Navigate to the `SimpleAlgorithm` directory.
3.  **Create a directory for compiled classes:**
    ```bash
    mkdir -p bin
    ```
4.  **Compile the Java files, targeting Java 17 for broader compatibility:**
    ```bash
    javac -d bin --release 17 src/fibonacciNumberAlgorithm/Fibonnaci.java src/fibonacciNumberAlgorithm/FibonnaciMain.java
    ```
    *Note: This command ensures compatibility if your Java Runtime Environment (JRE) is version 17 or newer. If you have a more recent JDK installed but need to run on an older JRE, the `--release 17` flag is crucial.*
    

5.  **Execute the application:**
    ```bash
    java -cp bin fibonacciNumberAlgorithm.FibonnaciMain
    ```
    The program will prompt the user for input regarding the number of terms or the desired index.


## References

* [DSA Simple Algorithm - W3Schools](https://www.w3schools.com/dsa/dsa_algo_simple.php)
