# Programming Fundamentals - Practice Problems - Set 1

1.  Use programming elements to store, load and clear data
    Write a program to calculate factorial of a number.

    Example: 5! = 5*4*3*2*1.

    Input:

    Initialize/receive an integer value

    Output:

    Factorial of a given number is 120.

2.  Use programming elements to store, load and clear data
    Write a program that accepts an integer as input and prints the table of that integer up to 12.

    For example, is the user enters 7, the output should be:

    7x1=7

    7 x2 = 14

    .....

    7 x 12 = 84

3.  Use programming elements to store, load and clear data
    Write a program that reads in a number from the user and then displays the Hailstone sequence for
    that number. The problem can be expressed as follows:

    - Pick some positive integer and call it n.
    - If n is even, divide it by two.
    - If n is odd, multiply it by three and add one.
    - Continue this process until n is equal to one.

    Your program should be able to produce a sample run that looks like this:

    Input:

    Input is a positive number

    Output:

    Output is a series of steps showing how it reached the number and then should return total count of
    steps

4.  Use arrays to structure the raw data and to perform data comparison & operations
    Write a program which creates an integer array and displays sum of its elements.

5.  Write a program which performs addition of elements which are stored in two arrays of type double.
    Arrays lengths may be variable in size. The resultant values must be stored in an integer array.
    Display the resultant integer array in a formatted way.

    Example:

    Input:

    dInputArray1[] 10.0 20.0 30.0

    dInputArray2[] 20.0 50.0 30.0 70.0 80.0

    Output:

    10 70 60 70 80

    iSumArray[]

6.  Write a method that receives a name as parameter and prints on the console. “Hello, <name>!”

    Example

    Input Output
    Peter Hello, Peter!

7.  Create a method GetMax(int a, int b, int c), that returns maximal of three numbers. Write a program
    that reads three numbers from the console and prints the biggest of them.

    Examples

    Input Output Input Output
    1 3 -100 -100
    2 -101
    3 -102

8.  Write a method that prints the digits of a given decimal number in a reversed order.

    Examples

    Input Output

    256 652

9.  Write a Boolean method IsPrime(n) that check whether a given integer number n is prime.

    Examples:

    n IsPrime(n)

    0 false

    1 false

    2 true

    337 true

    6737626471 true

    117342557809 false

10. Write a method that calculates all prime numbers in given range and returns them as list of integers
    Write a method to print a list of integers. Write a program that takes two integer numbers (each at a
    separate line) and prints all primes in their range, separated by a comma.

    Examples

    Start and End Output Number

    0

    10

    2, 3, 5, 7

    100

    50

    (empty list)

11. Write a program that can calculate the area of four different geometry figures - triangle, square,
    rectangle and circle.
    On the first line you will get the figure type. Next you will get parameters for the chosen figure,
    each on a different line:

    - Triangle - side and height
    - Square - side
    - Rectangle - width and height
    - Circle - radius

    The output should be rounded to the second digit after the decimal point:

    Examples

    Input Output
    triangle 9.00
    3
    6
    rectangle 20.00
    4
    5

12. Write an application to store ‘N’ numbers of type integers and sort it using below explained logic
    (Bubble sort). Your program should display the sorted numbers in a formatted way

    Example: Let us take the array of numbers "5 1 4 2 8", and sort the array from lowest number to
    greatest number using bubble sort.

    In each step, elements written in bold are being compared. Three
    passes will be required.

    First Pass:

    (51428) ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1.

    (15428) ( 1 4 5 2 8 ), Swap since 5 > 4

    (14528) ( 1 4 2 5 8 ), Swap since 5 > 2

    (14258) ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does
    not swap them.

    Second Pass:

    (14258) (14258)

    (14258) ( 1 2 4 5 8 ), Swap since 4 > 2

    (12458) (12458)

    (12458) (12458)

    Now, the array is already sorted, but our algorithm does not know if it is completed. The algorithm
    needs one whole pass without any swap to know it is sorted.

    Third Pass:

    (12458) (12458)

    (12458) (12458)

    (12458) (12458)

    (12458) (12458)

13. Write a method which accepts an integer array and key element to search. It should return ‘true’ if
    given key element found otherwise ‘false’

14. Write a menu driven program to implement binary search algorithm on both integer elements and
    strings.

    Menu: - Binary search for Integer elements - Binary search for Strings - Exit
    Write two methods:

    Boolean findElement(int arr[], int key): Should return ‘true’ if key element found otherwise ‘false’

    Boolean findString(String names[], String name): Should return ‘tru’ if name found in the list otherwise ‘false’.

15. Write a method which accepts array of unsorted integer elements and display elements in sorted
    order. Use insertion sort algorithm to sort.
    Refer below diagram to understand how insertion sort works.

16. Write a program which sorts ‘N’ array of Strings in an ascending order.

    Note: Write two methods:

    - First method: sort using bubble sort

    - Second Method: sort using insertion sort

17. Write a program that computes your initials from your full name and displays them.

    Example:

    If name = “KaviArasuV”, it must record the initials as “KAV”

18. Write a program which generates a password for a student using his initials and age.Each student will have first name, middle name and last name.

19. We have 2 student names Ali Al-Ali and Ahmed Al-Ahmed. Design and implement a Java program that will exchange the last name of the two students in such a way that the new names are going to be

    Ali Al-Ahmed and Ahmed Al-Ali.

20. Analyze the below code and invoke the method using main method.

21. In an online application, a university would like to validate the university seat number (USN) entered
    by its student.

    Example:

    A sample USN looks like: 1DS09CS010
    Following are the constraints to enter registration number:

    - Each USN must be length of 10 characters
    - 1st character must be digit and have value either '1' or '2'
    - 2nd and 3rd characters must be upper case letters
    - 4th and 5th characters must be digits and can have values between 0-9
    - 6th and 7th characters must be upper case letters and can have combination any of following substring: CS, IS,EC and ME
    - 8th,9th and 10th characters must be digits and can have values between 0-9
    - Create class called TestUSN which has main() method to:
    - Initialize USN variable with string value
    - Validate USN against above constraints
    - Print "Success" or "Failure" message based on result of validation

22. Given a sentence which consists of alphabets [a-zA-Z], digits [0-9], “,” and “.”.
    Write a method which returns a string after reversing only the alphabets [a-zA-Z] in a sentence which
    is passed as an argument the method.

    Note: reversing has to be done word-by-word. Example: if sentence contains “Hello World”, the
    reversed sentence will be “dlroW olleH”

    Example

    Input Output

    - 1 cup of hot coffee costs 8.00,whereas cold coffee costs 45.00.
    - 1 puc fo toh eeffoc stsoc 8.00, saerehw dloc eeffoc stsoc 45.00.

    - It Costs 25000rs for 1 LCD Projector.
    - tI stsoC 25000sr rof 1 DCL rotcejorP.

    - 8990.33 8990.33

23. Complete the method to print the consecutive characters and the number of times appearing in a
    String.

    void printConsecutiveCharacters(String input) {
    }

    Example

    Sample Input Sample Output

    - “I saw a CD play-er and a modem in ccd”
      CD 2
      DE 1
    - “Student List do not exist in sys-tem” ST 4
      DE 1
      NO 1

24. Let us design a simple compression algorithm where only the frequency of individual letters is used to
    compress the data. For e.g., the string Aabcccccaaa would become a2b1c5a3. The compression
    logic should be applied only when the total length of the compressed string is less than the original
    string. For the purpose of compression logic, the case sensitiveness is not considered.

    For e.g. A and a are considered the same.

    Input

    A String that needs to be compressed is given. Given string always contains characters. The string
    may contain characters in upper as well as lower case.

    Output

    Output is the compressed string or the same string if the compressed string length is more than or
    equal to the length of the original string. Output contains string in lowercase always.

    Input: aAbcccccaaA output: a2b1c5a3

    Input: BBBBbbb output: b7

25. Triplets are a set of three similar things.
    Complete the function to print all the triplets

    <A, B, C> such that A+B = C

    void printTriplets(int[ ] data) {
    }

    Example

    Sample Input Sample Output

    data ={2,3,4,5,7}

    <2,3,5> <2,5,7> <3,4,7>

    data = {1,2,3,4,5,7,9}

    <1,2,3>
    <1,3,4>
    <1,4,5>
    <2,3,5>
    <2,5,7>
    <3,4,7>
    <4,5,9>
