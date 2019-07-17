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
    @GeneratedValue
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;
}
