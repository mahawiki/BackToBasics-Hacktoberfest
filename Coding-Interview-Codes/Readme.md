# How to install GCC complier?
[http://www.sefidian.com/2020/05/09/installing-g-c-compiler-on-windows/]

# How to compile and run the C++ program?

- Step 1 − Open a new terminal window or cmd if you are on windows.

- Step 2 − Change the directory to the directory in which you have your source.cpp file. 

  For example, if it is in C:/Users/Dell/Documents, enter your command line

  $ cd 'C:/Users/Dell/Documents'
 
- Step 3 − Now enter the following command to compile the source file using g++.

  $ g++ -o <name-you-want-to-give> source.cpp
  
  In place of <name-you-want-to-give> replace it by any name like myprogram, etc.
  
- Step 4 − Run it! Now you can run the program using

  $ ./myprogram
 
 # 1. Reverse words in a given string(Reverse_word.cpp)

## Problem statement: 
Let the input string be “i like this program very much”. The function should change the string to “much very program this like i”

## Explanation: 

 Initially, reverse the individual words of the given string one by one, for the above example, after reversing individual words the *string should be “i ekil siht margorp yrev hcum”.
Reverse the whole string from start to end to get the desired output “much very program this like i” in the above example.

# 2. Bubble Sort(Bubble_sort.cpp)

Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.

## Example:

### First Pass:

( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1.

( 1 5 4 2 8 ) –>  ( 1 4 5 2 8 ), Swap since 5 > 4

( 1 4 5 2 8 ) –>  ( 1 4 2 5 8 ), Swap since 5 > 2

( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.

### Second Pass:

( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ) 

( 1 4 2 5 8 ) –> ( 1 2 4 5 8 ), Swap since 4 > 2

( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )

( 1 2 4 5 8 ) –>  ( 1 2 4 5 8 )

Now, the array is already sorted, but our algorithm does not know if it is completed. The algorithm needs one whole pass without any swap to know it is sorted.

### Third Pass:

( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )

# 3. find largest element in an array(Largest_Elelment.cpp)

## Problem Statement : 
find the largest element in from array(Array will given).

Input : arr[] = {10, 20, 4}
Output : 20

Input : arr[] = {20, 10, 20, 4, 100}
Output : 100

The solution is to initialize max as first element, then traverse the given array from second element till end. For every traversed element, compare it with max, if it is greater than max, then update max.

# 4. Fibonacci series(fibonacci.cpp)

## Problem Statement :

Given a number n, the task is to write a program in C++ to print the n-terms of Fibonacci Series using a Class template
The Fibonacci numbers are the numbers in the following integer sequence.

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, .....

### Examples:

Input: n = 2
Output: 0, 1

Input: n = 9
Output: 0, 1, 1, 2, 3, 5, 8, 13, 21

### Explanation:

1. Create a class for the Fibonacci Series

2. Take the first two terms of the series as public members a and b with values 0 and 1, respectively.

3. Create a generate() method in this class to generate the Fibonacci Series.

4. Create an object of this class and call the generate() method of this class using that object.

5. The Fibonacci Series will get printed.

## [Different Patterns Codes](https://github.com/mahawiki/BackToBasics-Hacktoberfest/tree/main/Coding-Interview-Codes/Patterns)

- Triangle Pattern
- Pyramid Pattern
