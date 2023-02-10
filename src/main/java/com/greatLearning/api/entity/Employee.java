package com.greatLearning.api.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "employees_generator")
    @SequenceGenerator(name = "employees_generator", sequenceName = "employees_seq", allocationSize = 50)
    @Column(name = "empID")
    private Long empID;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "empEmail")
    private String empEmail;
}
