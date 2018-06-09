package Afet.test.employee.service.impl;

import Afet.test.employee.dao.EmployeeRepositoriy;
import Afet.test.employee.model.Employee;
import Afet.test.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepositoriy employeeRepositoriy;

    @Override
    public Employee save(Employee employee) {
        if (Objects.isNull(employee)
                || Objects.nonNull(employee.getId()))
        return null;
        return employeeRepositoriy.save(employee);
    }
    @Override
    public Employee update(Employee employee) {
        if (Objects.isNull(employee)
                || Objects.isNull(employee.getId()))
        return null;
        return employeeRepositoriy.save(employee);
    }
    @Override
    public void delete(Integer id) {
        employeeRepositoriy.deleteById(id);

    }
    @Override
    public Optional<Employee> findById(Integer id) {
        return employeeRepositoriy.findById(id);
    }
    @Override
    public List<Employee> finfAll() {
        return (List<Employee>) employeeRepositoriy.findAll();
    }

    @Autowired
    public void setEmployeeRepositoriy(EmployeeRepositoriy employeeRepositoriy) {
        this.employeeRepositoriy = employeeRepositoriy;
    }
}
