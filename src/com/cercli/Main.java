package com.cercli;

import com.cercli.constants.TimezoneConstants;
import com.cercli.enums.Position;
import com.cercli.models.Employee;
import com.cercli.repos.EmployeeRepository;
import com.cercli.services.EmployeeService;
import com.cercli.utils.TimezoneUtility;

import java.time.LocalDateTime;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        TimezoneUtility timezoneUtility = new TimezoneUtility(TimezoneConstants.SERVER_TIMEZONE, TimezoneConstants.LOCAL_TIMEZONE);
        EmployeeRepository repository = new EmployeeRepository();
        EmployeeService service = new EmployeeService(repository, timezoneUtility);

        Employee employee1 = new Employee(
                UUID.randomUUID(),
                "John Doe",
                Position.SOFTWARE_ENGINEER,
                "john.doe@example.com",
                75000.0f,
                LocalDateTime.now(),
                LocalDateTime.now()
        );

        Employee employee2 = new Employee(
                UUID.randomUUID(),
                "Jane Smith",
                Position.PRODUCT_MANAGER,
                "jane.smith@example.com",
                85000.0f,
                LocalDateTime.now(),
                LocalDateTime.now()
        );

        service.addEmployee(employee1);
        service.addEmployee(employee2);

        service.printAllEmployees();
    }
}