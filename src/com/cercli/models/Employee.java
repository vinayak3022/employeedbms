package com.cercli.models;

import com.cercli.enums.Position;

import java.time.LocalDateTime;
import java.util.UUID;

public class Employee {
    private final UUID employeeId;
    private final String name;
    private final Position position;
    private final String email;
    private final float salary;
    private final LocalDateTime createdAt;
    private final LocalDateTime modifiedAt;

    // Constructor with pre-converted timezone values
    public Employee(UUID employeeId, String name, Position position, String email, float salary,
                    LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.email = email;
        this.salary = salary;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    // Getters
    public UUID getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public Position getPosition() { return position; }
    public String getEmail() { return email; }
    public float getSalary() { return salary; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public LocalDateTime getModifiedAt() { return modifiedAt; }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", position=" + position +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", createdAt=" + createdAt +
                ", modifiedAt=" + modifiedAt +
                '}';
    }
}