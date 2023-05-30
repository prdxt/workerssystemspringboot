package com.workerssystem.workerssystem;

import com.workerssystem.workerssystem.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final List<Employee> employees = new ArrayList<>();

    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees);
    }

    public Employee getEmployeeById(Integer id) {
        Optional<Employee> employee = employees.stream().filter(e -> e.getId().equals(id)).findFirst();
        return employee.orElse(null);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void updateEmployee(Employee employee) {
        int index = employees.indexOf(getEmployeeById(employee.getId()));
        if (index != -1) {
            employees.set(index, employee);
        }
    }

    public void deleteEmployee(Integer id) {
        employees.removeIf(e -> e.getId().equals(id));
    }
}
