package org.example;

public interface IManager {
    public void getNumberOfEmployeesSupervised();
    public void fireEmployee();
    public void hireEmployee();

    void hireEmployee(Employee emp);

    public void increaseSalary();

    void increaseSalary(Employee emp, double amount);
    // A Manager can increaseSalary, hireEmployee, fireEmployee, and getNumberOfEmployeesSupervised
    // Please implement these methods
}
