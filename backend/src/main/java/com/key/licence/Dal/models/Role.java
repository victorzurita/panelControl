package com.key.licence.Dal.models;

import com.key.licence.Dal.enums.AccessLevelType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Rafael Encinas.
 */
@Entity
@Table(name="role")
public class Role implements Serializable {
    private int id;
    private String name;
    private String description;
    private AccessLevelType accessLevelType;
    private boolean enabledAtCreate;
    private boolean enabledAtUpdate;
    private boolean enabledAtDelete;
    private boolean enabledAtPrint;
    private boolean active;
    private Date createdAtDate;
    private Date updatedAtDate;
    private int userCreatorId;

    private Set<Usr> users = new HashSet<>();

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
    public Set<Usr> getUsers() {
        return users;
    }

    public void setUsers(Set<Usr> users) {
        this.users = users;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AccessLevelType getAccessLevelType() {
        return accessLevelType;
    }

    public void setAccessLevelType(AccessLevelType accessLevelType) {
        this.accessLevelType = accessLevelType;
    }

    public boolean isEnabledAtCreate() {
        return enabledAtCreate;
    }

    public void setEnabledAtCreate(boolean enabledAtCreate) {
        this.enabledAtCreate = enabledAtCreate;
    }

    public boolean isEnabledAtUpdate() {
        return enabledAtUpdate;
    }

    public void setEnabledAtUpdate(boolean enabledAtUpdate) {
        this.enabledAtUpdate = enabledAtUpdate;
    }

    public boolean isEnabledAtDelete() {
        return enabledAtDelete;
    }

    public void setEnabledAtDelete(boolean enabledAtDelete) {
        this.enabledAtDelete = enabledAtDelete;
    }

    public boolean isEnabledAtPrint() {
        return enabledAtPrint;
    }

    public void setEnabledAtPrint(boolean enabledAtPrint) {
        this.enabledAtPrint = enabledAtPrint;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getCreatedAtDate() {
        return createdAtDate;
    }

    public void setCreatedAtDate(Date createdAtDate) {
        this.createdAtDate = createdAtDate;
    }

    public Date getUpdatedAtDate() {
        return updatedAtDate;
    }

    public void setUpdatedAtDate(Date updatedAtDate) {
        this.updatedAtDate = updatedAtDate;
    }

    public int getUserCreatorId() {
        return userCreatorId;
    }

    public void setUserCreatorId(int userCreatorId) {
        this.userCreatorId = userCreatorId;
    }
}
