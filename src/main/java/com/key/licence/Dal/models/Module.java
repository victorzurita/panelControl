package com.key.licence.Dal.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Module {
    private int id;
    private String code;
    private String name;
    private String description;
    private boolean active;
    private boolean created_at_date;
    private boolean updated_at_date;

    private Set<Usr> usrs;

    private boolean user_creator;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isCreated_at_date() {
        return created_at_date;
    }

    public void setCreated_at_date(boolean created_at_date) {
        this.created_at_date = created_at_date;
    }

    public boolean isUpdated_at_date() {
        return updated_at_date;
    }

    public void setUpdated_at_date(boolean updated_at_date) {
        this.updated_at_date = updated_at_date;
    }

    public boolean isUser_creator() {
        return user_creator;
    }

    public void setUser_creator(boolean user_creator) {
        this.user_creator = user_creator;
    }
}
