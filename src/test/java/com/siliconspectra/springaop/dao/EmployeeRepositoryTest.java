package com.siliconspectra.springaop.dao;

import com.siliconspectra.springaop.entity.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmployeeRepositoryTest {

    @Autowired
    EmployeeRepository employeeRepository;

    @Test
    public void getEmployeeByEmpidTest() {
        Employee employee = employeeRepository.findByEmpid("7902");
        Assertions.assertEquals("FORD", employee.getName());
    }
}
