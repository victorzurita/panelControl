package com.key.licence.Dal.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by jrafa on 2/6/2018.
 */
@Entity
public class Usr implements Serializable {
    private int id;
    private String name;
    private Set<Module> modules;

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

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "usr_module", joinColumns = @JoinColumn(name = "usr_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "module_id", referencedColumnName = "id"))
    public Set<Module> getModules() {
        return modules;
    }

    public void setModules(Set<Module> modules) {
        this.modules = modules;
    }
}
