package com.cercli.repos;

import com.cercli.models.Employee;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public class EmployeeRepository {
    private final Map<UUID, Employee> employeeStore = new HashMap<>();

    public void addEmployee(Employee employee) {
        employeeStore.put(employee.getEmployeeId(), employee);
    }

    public Optional<Employee> getEmployee(UUID employeeId) {
        return Optional.ofNullable(employeeStore.get(employeeId));
    }

    public Map<UUID, Employee> getAllEmployees() {
        return new HashMap<>(employeeStore);
    }

    public void updateEmployee(UUID employeeId, Employee employee) {
        if (!employeeStore.containsKey(employeeId)) {
            throw new IllegalArgumentException("Employee not found.");
        }
        employeeStore.put(employeeId, employee);
    }
}