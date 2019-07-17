package com.tw.apistackbase.repository;

import com.tw.apistackbase.model.Case;
import com.tw.apistackbase.service.CaseService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.ResultActions;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

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
        Case aCase = new Case("谋杀",new Date().getTime());
        caseService.save(aCase);
        List<Case> result_case = caseService.findAllByCaseName("谋杀");
        Assertions.assertEquals(true, result_case.contains(aCase));
    }
}