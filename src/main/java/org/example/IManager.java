package org.example;

public interface IManager {
    public void getNumberOfEmployeesSupervised();
    public void fireEmployee(Employee emp);
    void hireEmployee(Employee emp);
    void increaseSalary(Employee emp, double amount);
    // A Manager can increaseSalary, hireEmployee, fireEmployee, and getNumberOfEmployeesSupervised
    // Please implement these methods
}
