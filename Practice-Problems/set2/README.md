26. A retail store wants to keep track of item id and item price of the five items sold by them. Based on
    the item purchased by the customer, item price must be identified and the computation of bill amount
    must be done as per the price and quantity of the item purchased.

Write a program to implement the above scenario.

- Represent the item ids and price in arrays.

- Search for the item purchased by the customer (assume it to be 5001) in the item ids arrays and
  identify the respective price. Display and appropriate error message if the item is not found in the
  array.

- If the item is found-

  - compute the bill amount as quantity purchased \* price identified.
  - display the bill id, customer id, purchase id, quantity purchased, discount and bill amount.

- Change the purchase item id value to 5006 and run the program again and observe the result.

27. Design and implement applications using basic OOP paradigms.

Write a program as below guideline: 1. Create an Employee class with following attributes:

```
Employee
-empId: int
-empName:String
-empDesig:String
-empDept:String
+Employee()
+getters()
+setters()
+Employee(int, String, String, String)
```

- Write a program, which creates an instance of employee class and sets the values for all the
  attributes.
- While setting value for empName, setEmpName() method should check for NullPointer and
  display appropriate error message.
- While setting value for empDesig, the designation must have any of the following values:
  developer, tester, Lead or manager. If none of these values is matching then setter method
  should display 'Invalid designation' error message.
- While setting value for empDept, the department must have any of the following values:
  TTH, RCM, Digital, DevOps. If none of these values is matching then setter method should
  display 'Invalid Dept' error message.

28. Design and implement applications using basic OOP paradigms.
    Develop a program that assists bookstore employees. For each book, the program should track the book’s title, its price, its year of publication, and the author’s name. . . . Develop an appropriate Java
    Class. Create instances of the class to represent these three books:

- Daniel Defoe, Robinson Crusoe, \$15.50, 1719;
- Joseph Conrad, Heart of Darkness, \$12.80, 1902;
- Pat Conroy, Beach Music, \$9.50, 1996.

29. Design and implement applications using basic OOP paradigms.

XYZ bank wants to maintain customer details. It will register the customer details whenever a person
opens an account with the bank. Below is the customer class diagram:

```
Customer
-custId:int
-custName:String
-custAddress:String
-accType:String
-custBalance:double
+getters and setters methods()
```

At times, the customer registration process changes, here are the guidelines: 1. Admin may register customer by filling only ID, name and address details 2. Admin may register customer by filling only ID and name 3. Admin may register customer by filling all the details.
Write an application which implements above scenario. Write main method in separate class, which
creates different customer objects and invokes appropriate constructors, here is sample code:
Note: When other data members which are not initialized through constructors should have
appropriate default values.

30. Design and implement applications using basic OOP paradigms.
    Implement below given class diagram. Invoke constructor and methods of this class by creating
    appropriate object in main method.

```
SavingsAccount
-balance: double
-interestRate:int
-accountNo:int
+SavingsAccount()
+SavingsAccount(double, int, int)
+void withDraw(double amount)
+void calculateInterest()
```

Implement the withDraw(double amount) method: If amount is greater than balance then display error
message; otherwise debit amount from balance and display the message “successfully withdrawn” + amount

Implement the calcuateInterest() method: calculation of simple interest for the balance maintained in
the saving account.

31. Design and implement applications using basic OOP paradigms.

A coffee shop would like to find out the customer feedback rating about its services. The customer class shown below:

```
Customer
-Name:String
-MobileNo:String
-feedbackRating:dobule
+Customer()
+Customer(String, String, double)
+getters()
+setters()
```

Example: Assume that the shop will collect feedback from ‘N’ customers. Following are the sample

customer feedback values.
Customer 1: 3 out of 5
Customer 2: 4 out of 5
Customer 3: 2.5 out of 5
Write an application which creates array of ‘N’ customer objects to store feedback values of these

32. Design and implement applications using basic OOP paradigms.

Analyze following class diagram and answer below questions.

```
Employee
Company
-name:String
-name:String -employeeNumber:int
-employees[]:Employee -salary:int
-manager:Manager
+String getName() 1.._
+Employee[] getEmployees() +String getName()
+employer works for +employee +int getEmployeeNumber()
+int getSalary()
+Manager getManager()
1.._
+supervises
Manager
-manages[]:Employee
Contractor
+void addTeamMembers()
+Employee[] getTeamMembers() -lengthOfContract:Date
+Date getLengthOfContract()
+supervisor
```

a) Identify the classes
b) Identify the relationships between each classes
c) Identify the attributes and methods

33. Design and implement applications using basic OOP paradigms.

Objective:

Given a class diagram for a problem, use the method and constructor overloading concepts to solve
the problem and test using a set of values in an IDE.
Problem Description: The admin of a pre-university college wants to calculate the marks of students
in a particular course based on some criteria. Write a Java program to implement the below given
class diagram.

```
Student
-studentId: int
-studentName: String
-marks: float
-secondChance: boolean
+Student(int,String,String)
+getStudentId(): int
+getStudentName(): String
+getMarks(): float
+getSecondChance():
Boolean
+identifyMarks(float): void
+identifyMarks(float, float):
void

Student Class:
Constructor: Initializes studentId, studentName and secondChance.

identifyMarks(float) method:
This method is used to set the marks of the student if the student has cleared in the first chance itself,
i.e. second chance is false. This method accepts the marks scored by the student which must be set
in the marks instance variable.

identifyMarks (float, float) method:
This method is used to set the marks of the student if the student has taken the second chance i.e.
second chance is true. This method accepts the marks scored by the student in the first chance and
second chance. The maximum of both these marks must be identified and set in the marks instance
variable.

Starter Class:
Write a starter class named Demo,
```

Step1: Create an object of Student class by passing appropriate values to the constructor.

Step2: Based on the value used for second chance instance variable, invoke the appropriate
identifyMarks() method.

Step3: Invoke the getter methods and display all the instance variable values of the Student object
created. Create one more object (use different value for second chance) by repeating steps 1 to 3
and test your program.

34. Design and implement applications using basic OOP paradigms.

Create menu driven program to implement following scenario:

    1. Create Student Record
    2. Display Student Names in sorted order based on branch (alphabetical order)
    3. Display Student ID in ascending sorted order

35. Design and implement applications using basic OOP paradigms.

Create a method which accepts array of ‘Student’ objects and returns Student object who has scored highest marks.
Note: Each Student object should have following values:

- ID
- Name
- Branch
- Score

36. Write a method which accepts two integer arrays and returns an array of unique elements.

    Example:

    Array 1 = { 10, 5, 20, 15, 25, 30}
    Array 2 = {50, 12, 5, 30, 15, 70}
    Result_Array = {10, 20, 25, 50, 12, 70}
    Int [] uniqElements(int array1[], int array2[]);

37. Analyze below given code and predict the output.

38. Write a method which accepts two matrices of Size N X N and returns summation of resultant Matrix.

    Example:

    Matrix A: [1,2,3][4,5,6]
    Matrix B: [4,5,6][7,8,9]
    Matrix C = A + B = [5,7,9][11,13,15]

39. Write a method
    public static boolean isRowMagic(int[][] a)
    that checks if the array is row-magic (this means that every row has the same row sum).

40. Write a method
    public static boolean isMagic(int[][] a)
    that checks if the array is a magic square. This means that it must be square, and that all row sums,
    all column sums, and the two diagonal-sums must all be equal.

41. Write select queries to retrieve specific set of data from given database

Complete the exercises listed at following URL:

https://www.techonthenet.com/sql/select_exercises.php

42. Write select queries to retrieve specific set of data from given database

Complete at least 30 exercises listed at following URL:

https://www.w3resource.com/sql-exercises/sql-retrieve-from-table.php

43. Write select queries to retrieve specific set of data from given database

Complete at least 20 exercises listed at following URL:

https://www.w3resource.com/sql-exercises/sql-joins-exercises.php

44. Write select queries to retrieve specific set of data from given database

Complete at least 20 exercises listed at following URL:

https://www.w3resource.com/sql-exercises/sql-aggregate-functions.php

45. Write select queries to retrieve specific set of data from given database

Complete following online quiz:

https://www.w3schools.com/quiztest/quiztest.asp?qtest=SQL

46. Integrated Assignment-1

An administrator who is helping customers to book bus tickets is looking for a solution to book tickets

and get details:
While booking tickets, customers are requested to key-in following details:

- Name of the customer
- Mobile Number
- Source
- Destination
- Travel Date and time
  Implement a solution to validate these input based on following guidelines:

  - Given customer id and mobile number must exist in array of customers
  - Source and destination must not be same string
  - Travel date must satisfy following rules:
  - Date must be at least advanced by a day
  - It can’t be present date
  - Date can’t be more than a month
    Write a menu driven program with following options:

    1: Add customer details
    a. Each customer has following details: ID, name, age, mobile number, date of birth and
    address
    2: Book a ticket
    a. Accept following input: customer id, mobile number, source, destination, date and time
    b. Upon successful validations, print “ticket confirmed” message on console, otherwise
    print failure message.
    3: Display Customers
    a. Display customer based on city names
    b. Display customers based on ID
    c. Display customer Names in sorted order
    4: Exit

47. Integrated Assignment-2

Write a menu driven program to implement a solution to manage customers of a bank with following
options: 1. Create bank user
a. Every bank user has following details: account number, name, account type: saving,
loan and current, Date of birth, balance and address 2. Update user details
a. This option should allow user to update either one of following details: address and
name 3. Delete user details
a. This option to delete user details from the record 4. Display user details
a. Display user details based on ID
b. Display user details based on Name
c. Display all users who have non-zero balance
d. Display user sorted based on address (location wise)
e. Display users sorted based on account id 5. Exit

48. Integrated Assignment-3

Write a program to implement number guessing game:

In this guessing game, the computer will come up with a random number between 1 and 1000. The
player must then continue to guess numbers until the player guesses the correct number. For every
guess, the computer will either say “Too high” or “Too low”, or then ask for another input. At the end
of the game, the number is revealed along with the number of guesses it took to get the correct
number.

49. Integrated Assignment-4

Write a program to find a subset of a given set S = {Sl, S2,.....,Sn} of n positive integers whose SUM

is equal to a given positive integer d.
For example, if S ={1, 2,5,6, 8} and d= 9, there are two solutions {1,2,6}and {1,8}.
Display a suitable message, if the given problem instance doesn't have a solution.

50. Integrated Assignment-5

Write a menu driven program to check palindrome of a given input:

51. Integrated Assignment-6

Given an input array of n positive integers where the integers are in random order. Each number in

that array can occur many times. You need to find all the distinct duplicate elements and put all those
elements in an array i.e. output1. If no number is duplicate in input1 , then output1 should be {-1}.
Input: {4, 4, 7, 8, 8, 9}
Output: {4, 8}
Input: {3, 6, 5, 7, 8, 19, 32}
Output: {-1}

## Additional Assignments:

1. Implement ‘Stack’ data structures using integer array
2. Implement ‘Queue’ data structures using integer array
3. Implement ‘Singly Linked List’ to store set of integer elements
4. Implement transpose of a given matrix
5. Implement multiplication of two Matrix
6. Implement a program to generate random password based on customer name, age and id for banking applications
7. Write a program to check if string is complete (contains all alphabets)
8. Write a program to find Fibonacci of a given number using recursive call
9. Write a program to find sum of elements of given integer array using recursive call
10. Write a program to find power of given number using recursive call
