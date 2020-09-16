package com.siliconspectra.springaop.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table
public class Employee {
    @Id
    private String empid;
    private String name;
    private String job;
    private String manager;
    private String hiredate;
    private String salary;
    private String deptid;
}
