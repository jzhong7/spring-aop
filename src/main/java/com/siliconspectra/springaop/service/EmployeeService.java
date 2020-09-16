package com.siliconspectra.springaop.service;

import com.siliconspectra.springaop.dao.EmployeeRepository;
import com.siliconspectra.springaop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee getEmployeeByEmpid(String empid) throws Exception {
        System.out.println("Get employee " + empid);
        Employee employee = employeeRepository.findByEmpid(empid);
        if (employee == null) {
            throw new Exception("Employee not found!");
        } else {
            return employee;
        }
    }

    public void deleteEmployeeByEmpid(String empid) {
        System.out.println("Delete employee " + empid);
        employeeRepository.deleteByEmpid(empid);
    }
}
