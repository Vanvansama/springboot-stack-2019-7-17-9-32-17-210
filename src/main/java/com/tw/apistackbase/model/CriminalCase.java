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
@Table(name = "Criminal_Case")
public class CriminalCase {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "case_name", nullable = false)
    private String caseName;

    @Column(name = "date", nullable = false)
    private Long date;

    @OneToOne
    @JoinColumn(name="detail_id",referencedColumnName="id")
    private Detail detail;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Procuratorate procuratorate;

    public CriminalCase() {
    }

    public CriminalCase(String caseName, Long date) {
        this.caseName = caseName;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }
}
