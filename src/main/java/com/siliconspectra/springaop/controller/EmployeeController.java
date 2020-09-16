package com.siliconspectra.springaop.controller;

import com.siliconspectra.springaop.entity.Employee;
import com.siliconspectra.springaop.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/getEmployeeByEmpid/{empid}")
    public Employee getEmployeeByEmpid(@PathVariable String empid) throws Exception {
        return employeeService.getEmployeeByEmpid(empid);
    }

    @DeleteMapping("/deleteEmployeeByEmpid/{empid}")
    public void deleteEmployeeByEmpid(@PathVariable String empid) {
        employeeService.deleteEmployeeByEmpid(empid);
    }
}
