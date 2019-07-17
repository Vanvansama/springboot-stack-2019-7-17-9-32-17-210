package com.tw.apistackbase.repository;

import com.tw.apistackbase.model.CriminalCase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Create with IDEA
 *
 * @Author: gitee.com/KamisamaXX
 * @Date: Create in 21:09 2019/7/17
 * @Description:
 */
public interface CaseRepository extends JpaRepository<CriminalCase, Integer> {

    List<CriminalCase> findAllByCaseName(String caseName);
}
