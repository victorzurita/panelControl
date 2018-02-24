package com.key.licence.Dal.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Module {
    private int id;
    private String name;
    private Set<Usr> usrs;

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

    @ManyToMany(mappedBy = "modules")
    public Set<Usr> getUsrs() {
        return usrs;
    }

    public void setUsrs(Set<Usr> usrs) {
        this.usrs = usrs;
    }
}
