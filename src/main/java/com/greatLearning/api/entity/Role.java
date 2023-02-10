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
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "roles_generator")
    @SequenceGenerator(name = "roles_generator", sequenceName = "roles_seq", allocationSize = 50)
    @Column(name = "roleID")
    private Long roleID;

    @Column(name = "roleName")
    private String roleName;
}
