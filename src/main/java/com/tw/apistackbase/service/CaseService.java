package com.tw.apistackbase.service;

import com.tw.apistackbase.model.Case;
import com.tw.apistackbase.repository.CaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create with IDEA
 *
 * @Author: gitee.com/KamisamaXX
 * @Date: Create in 21:17 2019/7/17
 * @Description:
 */
@Service
public class CaseService {
    @Autowired
    private CaseRepository caseRepository;

    public Case findById(Integer id){
        return caseRepository.findById(id).orElse(null);
    }

    public List<Case> findAll(){
        return caseRepository.findAll();
    }

    public Case save (Case aCass){
        return caseRepository.save(aCass);
    }

    public List<Case> findAllByCaseName(String caseName){
        return caseRepository.findAllByCaseName(caseName);
    }

}
