package com.tw.apistackbase.model;

import javax.persistence.*;

/**
 * Create with IDEA
 *
 * @Author: gitee.com/KamisamaXX
 * @Date: Create in 22:11 2019/7/17
 * @Description:
 */
@Entity
@Table(name = "detail")
public class Detail {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "objective_description", nullable = false)
    private String objectivDescription;

    @Column(name = "subjective_description", nullable = false)
    private String subjectiveDescription;
}
