package org.example;
import java.util.ArrayList; // import the ArrayList class
public class Manager extends Employee implements IManager{
    private int numberOfEmployeesSupervised=0;
    public Manager(int pId,String pFirstName,String pLastName,int pAge,double pSalary,String pDepartment){
        super(pId,pFirstName,pLastName,pAge,pSalary,pDepartment);
        this.numberOfEmployeesSupervised=0;
    }
    ArrayList<Employee> employeesList = new ArrayList<Employee>();
    @Override
    public void getNumberOfEmployeesSupervised() {
          int empNumber=  this.employeesList.size();
        System.out.println(this.getFirstName()+" has "+empNumber+" employees");
    }

    @Override
    public void fireEmployee() {

    }

    @Override
    public void hireEmployee() {

    }

    @Override
    public void hireEmployee(Employee emp) {
//        this.employees.add(emp.getFirstName()+" "+emp.getLastName());
        this.employeesList.add(emp);
        System.out.println(emp.getFirstName()+" is hired.");
    }

    @Override
    public void increaseSalary() {

    }

    @Override
    public void increaseSalary(Employee emp, double amount) {
     emp.setSalary(amount);
        System.out.print(emp.getFirstName()+" "+emp.getLastName()+" salary is increased "+amount+" CHF.");
        System.out.println(" New salary : "+emp.getSalary());
    }


    public void getEmployees() {
        System.out.println(this.getFirstName() +" "+ this.getLastName() + "'s employees : ");
        for (Employee emp : this.employeesList) {
            System.out.println(emp.getFirstName()+" "+emp.getLastName());
        }
    }
    // A Manager has numberOfEmployeesSupervised attribute additionally.
    // Please implement necessary methods to get and set these attributes of Manager

}
