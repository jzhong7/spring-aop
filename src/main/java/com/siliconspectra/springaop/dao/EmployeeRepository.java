package com.siliconspectra.springaop.dao;

import com.siliconspectra.springaop.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String > {
    Employee findByEmpid(String id);

    @Transactional
    @Modifying
    void deleteByEmpid(String id);

}
