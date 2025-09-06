Prime Number Programs in Java

This repository contains different implementations of Prime Number problems in Java using loops.
The aim is to practice multiple approaches, improve understanding of loops, and explore efficient methods.

📂 Programs Included
🔹 1. Prime Number Checker (Multiple Methods)

Check whether a number is prime using different techniques:

Method 1 → Count divisors (from 1 to n).

Method 2 → Skip 1 and n, check divisibility from 2 to n-1.

Method 3 → Optimize by checking only up to n/2.

Method 4 → Best approach: check only up to sqrt(n).

Method 5 → Boolean flag (prime = true/false).

🔹 2. Print First N Prime Numbers

Takes a limit as input and prints the first N prime numbers.

Example:

Enter the limit: 10  
Prime numbers: 2 3 5 7 11 13 17 19 23 29

🔹 3. Sum of Prime Numbers up to N

Calculates and prints the sum of all prime numbers up to a given number N.

Example:

Enter the limit: 10  
Series: 2 3 5 7  
Sum = 17

🧠 Key Learning Points

Understanding loops (for loops inside loops).

Checking divisibility (n % i == 0).

Importance of optimization (reducing iterations).

Using Math.sqrt() for efficiency.

Handling special cases (n <= 1 is not prime).

⚙️ Tech Stack

Language: Java

IDE: IntelliJ IDEA

Concepts Used: Loops, Conditionals, Boolean Flags, Math functions

📸 Screenshots

Included screenshots of code execution and different methods.

🚀 Next Steps

Implement prime number using recursion (to be done later).

Modularize code into functions for reusability.

Add more problems like Fibonacci, LCM, Perfect Squares under loops practice.

✨ This repo is part of my Full Stack Java Developer journey — documenting daily progress and practice.
