package com.cercli.services;

import com.cercli.models.Employee;
import com.cercli.repos.EmployeeRepository;
import com.cercli.utils.TimezoneUtility;

import java.time.LocalDateTime;
import java.util.UUID;

public class EmployeeService {
    private final EmployeeRepository repository;
    private final TimezoneUtility timezoneUtility;

    // Constructor accepting a TimezoneUtility instance
    public EmployeeService(EmployeeRepository repository, TimezoneUtility timezoneUtility) {
        this.repository = repository;
        this.timezoneUtility = timezoneUtility;
    }

    public void addEmployee(Employee employee) {
        // Convert createdAt and modifiedAt to server timezone before saving
        LocalDateTime createdAtServerTime = timezoneUtility.toServerTimezone(employee.getCreatedAt());
        LocalDateTime modifiedAtServerTime = timezoneUtility.toServerTimezone(employee.getModifiedAt());

        Employee employeeWithServerTime = new Employee(
                UUID.randomUUID(),
                employee.getName(),
                employee.getPosition(),
                employee.getEmail(),
                employee.getSalary(),
                createdAtServerTime,
                modifiedAtServerTime
        );

        repository.addEmployee(employeeWithServerTime);
    }

    public void printAllEmployees() {
        for (Employee employee : repository.getAllEmployees().values()) {
            // Convert createdAt and modifiedAt to local timezone before displaying
            LocalDateTime createdAtLocalTime = timezoneUtility.toLocalTimezone(employee.getCreatedAt());
            LocalDateTime modifiedAtLocalTime = timezoneUtility.toLocalTimezone(employee.getModifiedAt());

            System.out.println("Employee: " + employee.getName() +
                    ", Position: " + employee.getPosition() +
                    ", Email: " + employee.getEmail() +
                    ", Salary: $" + employee.getSalary() +
                    ", Created At (Local): " + createdAtLocalTime +
                    ", Modified At (Local): " + modifiedAtLocalTime);
        }
    }
}