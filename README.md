# Employee Database Management System (Employee DBMS)

## Overview
The **Employee Database Management System (Employee DBMS)** is a Java application designed to store and manage employee information efficiently. Built with Object-Oriented Programming (OOP) principles, this system provides a structured approach to adding, updating, and retrieving employee records. The application demonstrates clean code practices, data validation, and timezone handling, making it ideal for managing employee data across various regions.

## Features
- **Add Employee**: Store new employee records with details like name, position, email, and salary.
- **Update Employee**: Modify existing employee details while maintaining data integrity.
- **Retrieve Employee**: Fetch individual or all employee records for easy viewing.
- **Timezone Handling**: Simulate a remote server by adjusting timestamps to local time.
- **Email Validation**: Ensures employee email addresses follow a valid format.

## Project Structure
- **models**: Defines the `Employee` class with attributes like ID, name, position, etc.
- **repositories**: Handles data storage and retrieval.
- **services**: Manages business logic for adding, updating, and fetching employees.
- **utilities**: Includes timezone handling and validation utilities.
- **constants**: Holds constants, such as timezone settings.
- **enums**: Defines enumerations if additional status or type attributes are added.

## Setup and Installation
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/vinayak3022/employee-dbms.git
