package Afet.test.employee.controller;


import Afet.test.employee.model.Employee;
import Afet.test.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> findAll() {return employeeService.finfAll();}

    @PostMapping
public Employee save(@RequestBody Employee employee) {return employeeService.save(employee);}

    @PutMapping
    public  Employee update(@RequestBody Employee employee) {return employeeService.update(employee);}

    @GetMapping ("/{id}")
    public Optional<Employee> findById(@PathVariable Integer id) {return employeeService.findById(id);}

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {employeeService.delete(id);}

    @Autowired

    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
}