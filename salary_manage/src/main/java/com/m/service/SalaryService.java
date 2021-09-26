package com.m.service;

import com.m.domain.Salary;

import java.util.List;

public interface SalaryService {
    void inputInformation(Salary salary);

    List<Salary> selectSalaryByUserId(String userId);

    void updateInformation(Salary salary);
}
