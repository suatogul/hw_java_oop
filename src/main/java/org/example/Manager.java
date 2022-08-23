package org.example;

public class Manager extends Employee implements IManager{
    private int numberOfEmployeesSupervised;
    public Manager(int pId,String pFirstName,String pLastName,int pAge,double pSalary,String pDepartment){
        super(pId,pFirstName,pLastName,pAge,pSalary,pDepartment);
        this.numberOfEmployeesSupervised=0;
    }

    public int getNumberOfEmployeesSupervised() {
        return numberOfEmployeesSupervised;
    }

    public void setNumberOfEmployeesSupervised(int numberOfEmployeesSupervised) {
        this.numberOfEmployeesSupervised = numberOfEmployeesSupervised;
    }
    // A Manager has numberOfEmployeesSupervised attribute additionally.
    // Please implement necessary methods to get and set these attributes of Manager

}
