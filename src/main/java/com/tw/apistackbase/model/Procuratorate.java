package com.tw.apistackbase.model;

import javax.persistence.*;
import java.util.List;

/**
 * Create with IDEA
 *
 * @Author: gitee.com/KamisamaXX
 * @Date: Create in 22:27 2019/7/17
 * @Description:
 */
@Entity
@Table(name = "Procuratorate")
public class Procuratorate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name",length = 50,nullable = false,unique = true)
    private String name;

//    @OneToMany
//    private List<CriminalCase> criminalCases;
//
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "Procuratorate_Id",referencedColumnName = "id")
    private List<Prosecutor> prosecutors;

    public Procuratorate(String name) {
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

    public List<Prosecutor> getProsecutors() {
        return prosecutors;
    }

    public void setProsecutors(List<Prosecutor> prosecutors) {
        this.prosecutors = prosecutors;
    }
}
