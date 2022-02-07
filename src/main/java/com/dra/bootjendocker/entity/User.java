package com.dra.bootjendocker.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "t_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String mobile;
    @Column(unique = true)
    private String email;

    @ManyToMany(
            targetEntity = Role.class,
            cascade =
                           {CascadeType.PERSIST,
                            CascadeType.DETACH,
                            CascadeType.MERGE,
                            CascadeType.REFRESH}
    )
    private List<Role> roles;

}
