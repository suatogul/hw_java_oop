# Table of Contents 
- [Project Description](#project-description)
- [Class Attributes](#class-attributes)
  * [Employee](#employee)
  * [Manager](#manager)
  * [SoftwareDeveloper](#softwaredeveloper)
- [Class Methods](#class-methods)
  * [Employee](#employee-1)
  * [Manager](#manager-1)
  * [SoftwareDeveloper](#softwaredeveloper-1)
- [Main Code](#main-code)
- [Expected Outputs](#expected-outputs)

---

## Project Description

This project is designed for new learners of OOP. You can fork this project and complete the missing parts according to given descriptions. After completing this project, you will learn OOP programming and its principles. 

In this project we have 3 classes: __(Employee, SoftwareDeveloper, Manager)__ and 3 interfaces __(IEmployee, ISoftwareDeveloper, IManager)__. You should implement these 3 classes and 3 interfaces according to given conditions: 

1. Employees have **id, firstName, lastName, age, salary, and department** attributes. Employees can **take a break** and can **get salary payments**.
2. Managers are also **employees** and additionally have **employees** attribute and can **hire or fire employees and increase salaries**.
3. Software Developers are also employees and additionally have **skilss, supervisor, and experience** attributes. They can **write and test code, and push the changes**.

The template of the classes and interfaces are given with descriptions. Please fill the missing parts.

---

## Class Attributes:
### Employee:
- id
- firstName
- lastName
- age
- salary
- Department

### Manager:
- all attributes of Employee class and
- employees

### SoftwareDeveloper:
- all attributes of Employee class and
- supervisor 
- skilss
- experience

---

## Class Methods: 
### Employee:
- takeABreak
- getSalaryPayment

### Manager:
- all methods of Employee class and
- increaseSalary
- hireEmployee
- fireEmployee
- getNumberOfEmployeesSupervised

### SoftwareDeveloper:
- all methods of Employee class and
- writeCode
- testCode
- pushChanges

---

# Main Code: 

```Java
Manager manager1 = new Manager(1, "John", "Murphy", 45, 10000, "Test");
Manager manager2 = new Manager(2, "Mark", "Rylie", 51, 10200, "Development");
Manager manager3 = new Manager(3, "Maria", "Swift", 42, 10500, "HR");

SoftwareDeveloper softwareDeveloper1 = new SoftwareDeveloper(1, "Alex", "Davies", 27, 6000, "Test", manager1, "Selenium", 7);
SoftwareDeveloper softwareDeveloper2 = new SoftwareDeveloper(2, "Oliver", "Wilson", 32, 6250, "Development", manager2, "Selenium", 7);
SoftwareDeveloper newSoftwareDeveloper = new SoftwareDeveloper(3, "Charlie", "Evans", 38, 6600, "Development", manager2, "Selenium", 7);

Employee newEmployee = new Employee(3, "Max", "Adams", 34, 6000, "Unknown");
Employee newEmployee2 = new Employee(3, "Mario", "Trix", 30, 6000, "Unknown");

System.out.println("###########################################################");
manager1.getNumberOfEmployeesSupervised();
manager1.hireEmployee(newSoftwareDeveloper);
manager1.getNumberOfEmployeesSupervised();
System.out.println("###########################################################");
System.out.println("SoftDev 1 salary : "+ softwareDeveloper1.getSalary());
manager1.increaseSalary(softwareDeveloper1, 500);
softwareDeveloper1.getSalaryPayment();
softwareDeveloper2.takeABreak();
System.out.println("###########################################################");
softwareDeveloper2.writeCode();
softwareDeveloper1.testCode();
softwareDeveloper2.pushChanges();
System.out.println("###########################################################");
System.out.println(softwareDeveloper1.getSkills());
System.out.println(softwareDeveloper2.getDepartment());
System.out.println("###########################################################");
manager2.getNumberOfEmployeesSupervised();
manager2.hireEmployee(newSoftwareDeveloper);
manager2.getNumberOfEmployeesSupervised();
manager2.getEmployees();
manager2.getSalaryPayment();
manager2.takeABreak();
manager2.fireEmployee(newSoftwareDeveloper);
manager2.getNumberOfEmployeesSupervised();
manager2.getEmployees();
System.out.println("###########################################################");
manager3.getNumberOfEmployeesSupervised();
manager3.hireEmployee(newEmployee);
manager3.getNumberOfEmployeesSupervised();
manager3.hireEmployee(newEmployee2);
manager3.getNumberOfEmployeesSupervised();
manager3.getEmployees();
```

---

# Expected Outputs:

```
###########################################################
John has 0 employees. 
Charlie is hired!
John has 1 employees. 
###########################################################
SoftDev 1 salary : 6000.0
Alex Davies's salary is increased 500.0 CHF. New Salary : 6500.0
Alex Davies got 6500.0 CHF salary payment!
Oliver took a break!
###########################################################
Code has been written by : Oliver Wilson
Code has been tested by : Alex Davies
Code has been pushed by : Oliver Wilson
###########################################################
Selenium
Development
###########################################################
Mark has 0 employees. 
Charlie is hired!
Mark has 1 employees. 
Mark Rylie's employees : 
Charlie Evans
Mark Rylie got 10200.0 CHF salary payment!
Mark took a break!
Charlie is fired!
Mark has 0 employees. 
Mark Rylie's employees : 
###########################################################
Maria has 0 employees. 
Max is hired!
Maria has 1 employees. 
Mario is hired!
Maria has 2 employees. 
Maria Swift's employees : 
Max Adams
Mario Trix
```
