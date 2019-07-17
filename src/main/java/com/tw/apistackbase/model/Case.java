package com.tw.apistackbase.model;

import javax.persistence.*;

/**
 * Create with IDEA
 *
 * @Author: gitee.com/KamisamaXX
 * @Date: Create in 20:43 2019/7/17
 * @Description:
 */
@Entity
@Table(name = "Case")
public class Case {
    @Id
    @GeneratedValue
    private String id;

    @Column(name = "case_name", nullable = false)
    private String caseName;

    @Column(name = "date", nullable = false)
    private Long date;
}
