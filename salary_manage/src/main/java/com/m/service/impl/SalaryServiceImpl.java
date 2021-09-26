package com.m.service.impl;

import com.m.domain.Salary;
import com.m.mapper.SalaryMapper;
import com.m.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryServiceImpl implements SalaryService {
    @Autowired
    private SalaryMapper salaryMapper;

    @Override
    public void inputInformation(Salary salary) {
        salaryMapper.inputInformation(salary);
    }

    @Override
    public List<Salary> selectSalaryByUserId(String userId) {
        List<Salary> salaryList =salaryMapper.selectSalaryByUserId(userId);
        return null;
    }

    @Override
    public void updateInformation(Salary salary) {
        salaryMapper.updateInformation(salary);
    }
}
