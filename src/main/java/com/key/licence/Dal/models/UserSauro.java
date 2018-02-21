package com.key.licence.Dal.models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by jrafa on 2/6/2018.
 */
@Entity
public class UserSauro implements Serializable {
    private int id;
    private String name;

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
}
