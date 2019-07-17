package com.tw.apistackbase.service;

import com.tw.apistackbase.model.Case;
import com.tw.apistackbase.repository.CaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public Case findById(String id){
        return caseRepository.findById(id).orElse(null);
    }

}
