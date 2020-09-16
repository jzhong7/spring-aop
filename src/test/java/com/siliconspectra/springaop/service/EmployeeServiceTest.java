package com.siliconspectra.springaop.service;

import static org.mockito.Mockito.when;

import com.siliconspectra.springaop.dao.EmployeeRepository;
import com.siliconspectra.springaop.entity.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class EmployeeServiceTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private EmployeeService employeeService;

//    @BeforeAll
//    public void setUp() {
//        MockitoAnnotations.initMocks(this);
//    }

    @Test
    public void getEmployeeByEmpidTest() throws Exception {
        MockitoAnnotations.initMocks(this);
        Employee employee = new Employee();
        employee.setName("FORD");
        when(employeeRepository.findByEmpid("7902")).thenReturn(employee);

        Employee res = employeeService.getEmployeeByEmpid("7902"); // return the obj in line 26, only test the service code
        Assertions.assertEquals("FORD", res.getName());

    }
}
