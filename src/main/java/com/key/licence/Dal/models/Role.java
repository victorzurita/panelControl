package com.key.licence.Dal.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jrafa on 2/6/2018.
 */
@Entity
@Table(name="role")
public class Role implements Serializable {
    private int id;
    private String name;
    private Set<UserSauro> users = new HashSet<>();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "role_id")
    public Set<UserSauro> getUsers() {
        return users;
    }

    public void setUsers(Set<UserSauro> users) {
        this.users = users;
    }
}
