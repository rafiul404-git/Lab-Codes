package entityList;

import entity.Employee;
import java.util.ArrayList;

public class EmployeeList {

    // List to store all employee objects
    private ArrayList<Employee> employees = new ArrayList<>();

    // Adds a new employee to the list
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Removes an employee from the list based on their ID
    public boolean removeEmployeeById(int id) {
        for (Employee e : employees) {
            if (e.getId() == id) {
                employees.remove(e);
                return true; // Successfully removed
            }
        }
        return false; // No match found
    }

    // Searches for an employee by their ID and returns the employee object
    public Employee searchById(int id) {
        for (Employee e : employees) {
            if (e.getId() == id)
                return e;
        }
        return null; // Employee not found
    }

    // Displays all employees' details
    public void viewAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employee found.");
            return;
        }
        for (Employee e : employees) {
            e.displayEmployee();
        }
    }

    // Returns the entire list of employees
    public ArrayList<Employee> getAllEmployees() {
        return employees;
    }

    // Sets the entire list of employees (used for loading data)
    public void setAllEmployees(ArrayList<Employee> list) {
        this.employees = list;
    }
}
