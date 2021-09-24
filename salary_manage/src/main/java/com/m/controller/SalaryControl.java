package com.m.controller;

import com.m.domain.Salary;
import com.m.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class SalaryControl {
    @Autowired
    private SalaryService salaryService;
    /*** 工资录入
     * @author CloseEye
     */
    @RequestMapping("/inputInformation")
    public String createNewBook(String userId, String userName, String departmentId,
                                String departmentName, int year, int month, double postWage,
                                double ageWage, double fixedTotal, double benefitWage,
                                double overtimeOrDuty, double backPay, double feeForOnlyChildren,
                                double housingSubsidy, double accumulationFund, double oldAgeInsurance,
                                double unemploymentInsurance, double medicalInsurance, double incomeTax,
                                double totalWages,double takeHomePay) {
        Salary salary=new Salary();
        salary.setUserId(userId);
        salary.setUserName(userName);
        salary.setDepartmentId(departmentId);
        salary.setDepartmentName(departmentName);
        salary.setYear(year);
        salary.setMonth(month);
        salary.setPostWage(postWage);
        salary.setAgeWage(ageWage);
        salary.setFixedTotal(fixedTotal);
        salary.setBenefitWage(benefitWage);
        salary.setOvertimeOrDuty(overtimeOrDuty);
        salary.setBackPay(backPay);
        salary.setFeeForOnlyChildren(feeForOnlyChildren);
        salary.setHousingSubsidy(housingSubsidy);
        salary.setAccumulationFund(accumulationFund);
        salary.setOldAgeInsurance(oldAgeInsurance);
        salary.setUnemploymentInsurance(unemploymentInsurance);
        salary.setMedicalInsurance(medicalInsurance);
        salary.setIncomeTax(incomeTax);
        salary.setTotalWages(totalWages);
        salary.setTakeHomePay(takeHomePay);

        return null;
    }
}
