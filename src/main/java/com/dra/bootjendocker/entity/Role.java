package com.dra.bootjendocker.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "t_role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    @ManyToMany(
            targetEntity = User.class,
            mappedBy="roles",
            cascade =
                           {CascadeType.PERSIST,
                            CascadeType.DETACH,
                            CascadeType.MERGE,
                            CascadeType.REFRESH}
    )
    private List<User> users;

}
