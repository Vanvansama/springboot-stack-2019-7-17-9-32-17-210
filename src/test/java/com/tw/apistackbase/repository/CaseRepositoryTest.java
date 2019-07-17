package com.tw.apistackbase.repository;

import com.tw.apistackbase.model.CriminalCase;
import com.tw.apistackbase.service.CaseService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

/**
 * Create with IDEA
 *
 * @Author: gitee.com/KamisamaXX
 * @Date: Create in 21:32 2019/7/17
 * @Description:
 */
@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class CaseRepositoryTest {

    @Autowired
    private CaseService caseService;

    @Test
    void should_return_list_of_case_when_findByCaseName_given_caseName(){
        CriminalCase aCriminalCase = new CriminalCase("谋杀",new Date().getTime());
        caseService.save(aCriminalCase);
        List<CriminalCase> result_Criminal_case = caseService.findAllByCaseName("谋杀");
        Assertions.assertEquals(true, result_Criminal_case.contains(aCriminalCase));
    }
}