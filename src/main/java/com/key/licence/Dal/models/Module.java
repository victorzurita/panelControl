package com.key.licence.Dal.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Module {
    private int id;
    private String name;
    private String description;
    private boolean active;
    private boolean createdAtDate;
    private boolean updatedAtDate;

    private Set<Usr> usrs;

    private int userCreatorId;

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

    public boolean isCreatedAtDate() {
        return createdAtDate;
    }

    public void setCreatedAtDate(boolean createdAtDate) {
        this.createdAtDate = createdAtDate;
    }

    public boolean isUpdatedAtDate() {
        return updatedAtDate;
    }

    public void setUpdatedAtDate(boolean updatedAtDate) {
        this.updatedAtDate = updatedAtDate;
    }

    public int getUserCreatorId() {
        return userCreatorId;
    }

    public void setUserCreatorId(int userCreatorId) {
        this.userCreatorId = userCreatorId;
    }
}
