package com.tw.apistackbase.service;

import com.tw.apistackbase.model.CriminalCase;
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

    public CriminalCase findById(Integer id){
        return caseRepository.findById(id).orElse(null);
    }

    public List<CriminalCase> findAll(){
        return caseRepository.findAll();
    }

    public CriminalCase save (CriminalCase aCass){
        return caseRepository.save(aCass);
    }

    public List<CriminalCase> findAllByCaseName(String caseName){
        return caseRepository.findAllByCaseName(caseName);
    }

    public void delete(Integer id){
        caseRepository.deleteById(id);
    }

}
