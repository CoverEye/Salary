package com.m.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserControl {
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

        return null;
    }
}
