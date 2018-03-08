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
    private String code;
    private String name;
    private String last_name;
    private String nick_name;
    private String password;
    private boolean active;
    private boolean created_at_date;
    private boolean updated_at_date;
    private boolean user_creator;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
