## Classes

Company, Manager, Employee, Contractor

## Realtions

1) Employee

Works for Company, 1 to many. Aggregation.
Supervised by Manager, 1 to many.

2) Manager

Inherits from Employee.

3) Cotractor

Inherits from Employee.

4) Company

Employs Employee.

## Attributes

1) Employee

private String name
private int employeeNumber, salary
private Manager manager

2) Manager

private Employee messages[] 

3) Cotractor

private Date lengthOfContract 

4) Company

private String name
private Employee employees

## Methods

1) Employee

public String getName
public int getEmployeeNumber, getSalary
public Manager getManager

2) Manager

public void addTeamMembers
public Employee[] getTeamMembers

3) Cotractor

public Date getLengthOfContract 

4) Company

public String getName
public Employee[] getEmployees
