package Afet.test.employee.dao;

import Afet.test.employee.model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepositoriy extends CrudRepository<Employee, Integer> {
List<Employee>findAll();
}
