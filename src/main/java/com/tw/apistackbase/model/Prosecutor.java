package com.tw.apistackbase.model;

import javax.persistence.*;

/**
 * Create with IDEA
 *
 * @Author: gitee.com/KamisamaXX
 * @Date: Create in 22:38 2019/7/17
 * @Description:
 */
@Entity
@Table(name = "Prosecutor")
public class Prosecutor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

//    @Transient
//    private Integer procuratorateId;

    public Prosecutor(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
