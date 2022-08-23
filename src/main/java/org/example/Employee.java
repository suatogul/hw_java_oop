package org.example;

public class Employee implements IEmployee{
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private  String department;

    // Please implement necessary methods to get and set these attributes of employee
    // All methods should only print the name of the employee (Manager or SoftDev) and the name of the method.

   public Employee(int pId,String pFirstName,String pLastName,int pAge,double pSalary,String pDepartment){
       this.id=pId;
       this.firstName=pFirstName;
       this.lastName=pLastName;
       this.age=pAge;
       this.salary=pSalary;
       this.department=pDepartment;
   }

    //Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double pSalary) {
        this.salary = this.salary+pSalary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

//implemented methods
    @Override
    public void getSalaryPayment() {
        System.out.println(this.firstName+" "+this.lastName+" got "+this.salary+"CHF salary payment!");

    }

    @Override
    public void takeABreak() {
        System.out.println(this.firstName+" took a break");

    }
}
