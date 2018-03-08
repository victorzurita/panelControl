package com.key.licence.Dal.models;

import com.key.licence.Dal.enums.AccessLevel;

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
    private String code;
    private String description;
    private AccessLevel accessLevel;
    private boolean enabled_at_create;
    private boolean enabled_at_update;
    private boolean enabled_at_delete;
    private boolean enabled_at_print;
    private boolean active;
    private boolean created_at_date;
    private boolean updated_at_date;
    private boolean user_creator;

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

    public AccessLevel getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(AccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isEnabled_at_create() {
        return enabled_at_create;
    }

    public void setEnabled_at_create(boolean enabled_at_create) {
        this.enabled_at_create = enabled_at_create;
    }

    public boolean isEnabled_at_update() {
        return enabled_at_update;
    }

    public void setEnabled_at_update(boolean enabled_at_update) {
        this.enabled_at_update = enabled_at_update;
    }

    public boolean isEnabled_at_delete() {
        return enabled_at_delete;
    }

    public void setEnabled_at_delete(boolean enabled_at_delete) {
        this.enabled_at_delete = enabled_at_delete;
    }

    public boolean isEnabled_at_print() {
        return enabled_at_print;
    }

    public void setEnabled_at_print(boolean enabled_at_print) {
        this.enabled_at_print = enabled_at_print;
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
