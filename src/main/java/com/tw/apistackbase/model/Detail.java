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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "objective_description", nullable = false)
    private String objectivDescription;

    @Column(name = "subjective_description", nullable = false)
    private String subjectiveDescription;

    public Detail(String objectivDescription, String subjectiveDescription) {
        this.objectivDescription = objectivDescription;
        this.subjectiveDescription = subjectiveDescription;
    }

    public Detail() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getObjectivDescription() {
        return objectivDescription;
    }

    public void setObjectivDescription(String objectivDescription) {
        this.objectivDescription = objectivDescription;
    }

    public String getSubjectiveDescription() {
        return subjectiveDescription;
    }

    public void setSubjectiveDescription(String subjectiveDescription) {
        this.subjectiveDescription = subjectiveDescription;
    }
}
