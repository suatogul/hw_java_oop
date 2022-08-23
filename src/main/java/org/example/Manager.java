package org.example;

public class Manager extends Employee implements IManager{
    private int numberOfEmployeesSupervised;
    public Manager(int pId,String pFirstName,String pLastName,int pAge,double pSalary,String pDepartment){
        super(pId,pFirstName,pLastName,pAge,pSalary,pDepartment);
        this.numberOfEmployeesSupervised=0;
    }

    @Override
    public void getNumberOfEmployeesSupervised() {

    }

    @Override
    public void fireEmployee() {

    }

    @Override
    public void hireEmployee() {

    }

    @Override
    public void increaseSalary() {

    }


    // A Manager has numberOfEmployeesSupervised attribute additionally.
    // Please implement necessary methods to get and set these attributes of Manager

}
