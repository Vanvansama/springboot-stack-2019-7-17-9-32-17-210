package com.tw.apistackbase.repository;

import com.tw.apistackbase.model.CriminalCase;
import com.tw.apistackbase.model.Detail;
import com.tw.apistackbase.model.Procuratorate;
import com.tw.apistackbase.model.Prosecutor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Create with IDEA
 *
 * @Author: gitee.com/KamisamaXX
 * @Date: Create in 21:32 2019/7/17
 * @Description:
 */

@DataJpaTest
@ExtendWith(SpringExtension.class)
class CaseRepositoryTest {

    @Autowired
    private CaseRepository caseRepository;
    @Autowired
    private DetailRepository detailRepository;
    @Autowired
    private ProcuratorateRepository procuratorateRepository;
    @Autowired
    private ProsecutorRepository prosecutorRepository;

    @Test
    void should_return_list_of_case_when_findByCaseName_given_caseName() {
        CriminalCase aCriminalCase = new CriminalCase("谋杀", new Date().getTime());
        caseRepository.save(aCriminalCase);

        List<CriminalCase> result_Criminal_case = caseRepository.findAllByCaseName("谋杀");

        Assertions.assertEquals(true, result_Criminal_case.contains(aCriminalCase));
    }

    @Test
    void should_return_case_with_detail_when_find_case_given_caseId() {
        Detail detail = new Detail("kill people", "kill nothing");
        Detail detailSave = detailRepository.save(detail);
        CriminalCase criminalCase = new CriminalCase("murder", new Date().getTime());
        criminalCase.setDetail(detailSave);
        caseRepository.save(criminalCase);
        List<CriminalCase> cases = new ArrayList<>();
        cases.add(criminalCase);

        List<CriminalCase> list = caseRepository.findAll();

        Assertions.assertEquals(cases, list);
    }

    @Test
    void should_return_procuratorate_with_prosecutor_when_find_case_given_caseId() {
        Procuratorate procuratorate = new Procuratorate("中国珠海");
        Procuratorate procuratorate1 = procuratorateRepository.save(procuratorate);
        Detail detail = new Detail("kill people", "kill nothing");
        Detail detailSave = detailRepository.save(detail);
        CriminalCase criminalCase = new CriminalCase("murder", new Date().getTime());
        criminalCase.setDetail(detailSave);
        criminalCase.setProcuratorate(procuratorate1);
        caseRepository.save(criminalCase);
        List<CriminalCase> cases = new ArrayList<>();
        cases.add(criminalCase);

        List<CriminalCase> list = caseRepository.findAll();

        Assertions.assertEquals(cases, list);
    }

    @Test
    void should_return_procuratorate_with_prosecutor_when_find_procuratorate_given_procuratorateId() {
        Procuratorate procuratorate = new Procuratorate("中国珠海检察院");
        List<Prosecutor> prosecutorList = new ArrayList<>();
        Prosecutor prosecutor = new Prosecutor("stefan");
        prosecutorRepository.save(prosecutor);
        Prosecutor prosecutor1 = new Prosecutor("stefan1");
        prosecutorRepository.save(prosecutor1);
        Prosecutor prosecutor2 = new Prosecutor("stefan2");
        prosecutorRepository.save(prosecutor2);
        Prosecutor prosecutor3 = new Prosecutor("stefan3");
        prosecutorRepository.save(prosecutor3);
        prosecutorList.add(prosecutor);
        prosecutorList.add(prosecutor1);
        prosecutorList.add(prosecutor2);
        prosecutorList.add(prosecutor3);
        procuratorate.setProsecutors(prosecutorList);
        procuratorateRepository.save(procuratorate);

        Procuratorate procuratorateFind = procuratorateRepository.findById(procuratorate.getId()).orElse(null);

        Assertions.assertEquals(procuratorate, procuratorateFind);
    }
}