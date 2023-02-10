package com.greatLearning.api.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "users_generator")
    @SequenceGenerator(name = "users_generator", sequenceName = "users_seq", allocationSize = 50)
    @Column(name = "userID")
    private Long userID;

    @Column(name = "userName")
    private String userName;

    @Column(name = "password")
    private String password;

    //    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinTable(name = "Users",
//            joinColumns = @JoinColumn(name = "userID"),
//            inverseJoinColumns = @JoinColumn(name = "roleID"))
//    private List<Role> roles = new ArrayList<>();
    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinTable(name = "users",
            joinColumns = @JoinColumn(name = "userID"),
            inverseJoinColumns = @JoinColumn(name = "roleID"))
    private List<Role> roles = new ArrayList<>();
}