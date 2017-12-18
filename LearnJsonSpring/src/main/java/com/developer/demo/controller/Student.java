

package com.developer.demo.controller;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author bossbaby
 */
@Entity
@Table(name = "Name")
public class Student implements Serializable {
    @Id
    @Column(name = "Number")
    private long id;
    
    @Column(name = "Ten")
    private String name;
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
