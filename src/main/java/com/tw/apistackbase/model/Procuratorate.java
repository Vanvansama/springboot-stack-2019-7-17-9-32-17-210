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
    @GeneratedValue
    private Integer id;

    @Column(name = "name",length = 50,nullable = false,unique = true)
    private String name;

    @OneToMany
    private List<CriminalCase> criminalCases;
}
