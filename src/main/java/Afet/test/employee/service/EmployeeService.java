package Afet.test.employee.service;

import Afet.test.employee.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

 Employee save(Employee employee);
 Employee update(Employee employee);
 void delete(Integer id);
 Optional<Employee> findById(Integer id);
 List<Employee> finfAll();
}
