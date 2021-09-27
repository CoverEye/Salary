package com.m.test;

import com.m.domain.Salary;
import com.m.service.SalaryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "classpath:spring-mvc.xml"})
public class SalaryTest {
    @Autowired
    private SalaryService salaryService;

    /*** 工资录入测试
     * @author CloseEye
     */
    @Test
    public void test1() {
        Salary salary = new Salary();
        salary.setUserId("002");
        salary.setUserName("李四");
        salary.setDepartmentId("B001");
        salary.setDepartmentName("前台");
        salary.setYear(2021);
        salary.setMonth(10);
        salary.setPostWage(4000.0);
        salary.setAgeWage((double) 0);
        salary.setFixedTotal((double) 0);
        salary.setBenefitWage(200.0);
        salary.setOvertimeOrDuty(1000.0);
        salary.setBackPay((double) 0);
        salary.setFeeForOnlyChildren((double) 0);
        salary.setHousingSubsidy((double) 0);
        salary.setAccumulationFund(200.0);
        salary.setOldAgeInsurance(300.0);
        salary.setUnemploymentInsurance(200.0);
        salary.setMedicalInsurance(200.0);
        salary.setIncomeTax(70.0);
        salaryService.inputInformation(salary);
    }

    /*** 更新工资信息测试
     * @author CloseEye
     */
    @Test
    public void test2() {
        Salary salary = new Salary();
        salary.setUserId("001");
        salary.setYear(2021);
        salary.setMonth(10);
        salary.setBenefitWage(400.0);
        salaryService.updateInformation(salary);
        System.out.println(salary);
    }

    /*** 查询工资信息测试
     * @author CloseEye
     */
    @Test
    public void test3() {
        List<Salary> salaryList = salaryService.selectSalaryByUserId("001");

        assertEquals("001", salaryList.get(0).getUserId());
        assertEquals("张三", salaryList.get(0).getUserName());
        assertEquals("A001", salaryList.get(0).getDepartmentId());
        assertEquals("财务", salaryList.get(0).getDepartmentName());
        assertEquals(Integer.valueOf(2021), salaryList.get(0).getYear());
        assertEquals(Integer.valueOf(9), salaryList.get(0).getMonth());
        assertEquals(Double.valueOf(6000.00), salaryList.get(0).getPostWage());
        assertEquals(Double.valueOf(0.00), salaryList.get(0).getAgeWage());
        assertEquals(Double.valueOf(0.00), salaryList.get(0).getFixedTotal());
        assertEquals(Double.valueOf(200.00), salaryList.get(0).getBenefitWage());
        assertEquals(Double.valueOf(0.00), salaryList.get(0).getOvertimeOrDuty());
        assertEquals(Double.valueOf(0.00), salaryList.get(0).getBackPay());
        assertEquals(Double.valueOf(0.00), salaryList.get(0).getFeeForOnlyChildren());
        assertEquals(Double.valueOf(0.00), salaryList.get(0).getHousingSubsidy());
        assertEquals(Double.valueOf(0.00), salaryList.get(0).getAccumulationFund());
        assertEquals(Double.valueOf(0.00), salaryList.get(0).getOldAgeInsurance());
        assertEquals(Double.valueOf(0.00), salaryList.get(0).getUnemploymentInsurance());
        assertEquals(Double.valueOf(0.00), salaryList.get(0).getMedicalInsurance());
        assertEquals(Double.valueOf(9.00), salaryList.get(0).getIncomeTax());
        assertEquals(Double.valueOf(6200.00), salaryList.get(0).getTotalWages());
        assertEquals(Double.valueOf(6191.00), salaryList.get(0).getNetPayment());

        assertEquals("001", salaryList.get(1).getUserId());
        assertEquals("张三", salaryList.get(1).getUserName());
        assertEquals("A001", salaryList.get(1).getDepartmentId());
        assertEquals("财务", salaryList.get(1).getDepartmentName());
        assertEquals(Integer.valueOf(2021), salaryList.get(1).getYear());
        assertEquals(Integer.valueOf(10), salaryList.get(1).getMonth());
        assertEquals(Double.valueOf(7000.00), salaryList.get(1).getPostWage());
        assertEquals(Double.valueOf(0.00), salaryList.get(1).getAgeWage());
        assertEquals(Double.valueOf(0.00), salaryList.get(1).getFixedTotal());
        assertEquals(Double.valueOf(400.00), salaryList.get(1).getBenefitWage());
        assertEquals(Double.valueOf(1000.00), salaryList.get(1).getOvertimeOrDuty());
        assertEquals(Double.valueOf(0.00), salaryList.get(1).getBackPay());
        assertEquals(Double.valueOf(0.00), salaryList.get(1).getFeeForOnlyChildren());
        assertEquals(Double.valueOf(0.00), salaryList.get(1).getHousingSubsidy());
        assertEquals(Double.valueOf(200.00), salaryList.get(1).getAccumulationFund());
        assertEquals(Double.valueOf(300.00), salaryList.get(1).getOldAgeInsurance());
        assertEquals(Double.valueOf(200.00), salaryList.get(1).getUnemploymentInsurance());
        assertEquals(Double.valueOf(200.00), salaryList.get(1).getMedicalInsurance());
        assertEquals(Double.valueOf(70.00), salaryList.get(1).getIncomeTax());
        assertEquals(Double.valueOf(8400.00), salaryList.get(1).getTotalWages());
        assertEquals(Double.valueOf(7430.00), salaryList.get(1).getNetPayment());

    }

    /*** 统计工资信息测试
     * @author CloseEye
     */
    @Test
    public void test4() {
        List<Salary> salaryList = salaryService.selectAllSalaryByUserId();

        assertEquals("001", salaryList.get(0).getUserId());
        assertEquals("张三", salaryList.get(0).getUserName());
        assertEquals("A001", salaryList.get(0).getDepartmentId());
        assertEquals("财务", salaryList.get(0).getDepartmentName());
        assertEquals(Integer.valueOf(2021), salaryList.get(0).getYear());
        assertEquals(Integer.valueOf(9), salaryList.get(0).getMonth());
        assertEquals(Double.valueOf(6000.00), salaryList.get(0).getPostWage());
        assertEquals(Double.valueOf(0.00), salaryList.get(0).getAgeWage());
        assertEquals(Double.valueOf(0.00), salaryList.get(0).getFixedTotal());
        assertEquals(Double.valueOf(200.00), salaryList.get(0).getBenefitWage());
        assertEquals(Double.valueOf(0.00), salaryList.get(0).getOvertimeOrDuty());
        assertEquals(Double.valueOf(0.00), salaryList.get(0).getBackPay());
        assertEquals(Double.valueOf(0.00), salaryList.get(0).getFeeForOnlyChildren());
        assertEquals(Double.valueOf(0.00), salaryList.get(0).getHousingSubsidy());
        assertEquals(Double.valueOf(0.00), salaryList.get(0).getAccumulationFund());
        assertEquals(Double.valueOf(0.00), salaryList.get(0).getOldAgeInsurance());
        assertEquals(Double.valueOf(0.00), salaryList.get(0).getUnemploymentInsurance());
        assertEquals(Double.valueOf(0.00), salaryList.get(0).getMedicalInsurance());
        assertEquals(Double.valueOf(9.00), salaryList.get(0).getIncomeTax());
        assertEquals(Double.valueOf(6200.00), salaryList.get(0).getTotalWages());
        assertEquals(Double.valueOf(6191.00), salaryList.get(0).getNetPayment());

        assertEquals("001", salaryList.get(1).getUserId());
        assertEquals("张三", salaryList.get(1).getUserName());
        assertEquals("A001", salaryList.get(1).getDepartmentId());
        assertEquals("财务", salaryList.get(1).getDepartmentName());
        assertEquals(Integer.valueOf(2021), salaryList.get(1).getYear());
        assertEquals(Integer.valueOf(10), salaryList.get(1).getMonth());
        assertEquals(Double.valueOf(7000.00), salaryList.get(1).getPostWage());
        assertEquals(Double.valueOf(0.00), salaryList.get(1).getAgeWage());
        assertEquals(Double.valueOf(0.00), salaryList.get(1).getFixedTotal());
        assertEquals(Double.valueOf(400.00), salaryList.get(1).getBenefitWage());
        assertEquals(Double.valueOf(1000.00), salaryList.get(1).getOvertimeOrDuty());
        assertEquals(Double.valueOf(0.00), salaryList.get(1).getBackPay());
        assertEquals(Double.valueOf(0.00), salaryList.get(1).getFeeForOnlyChildren());
        assertEquals(Double.valueOf(0.00), salaryList.get(1).getHousingSubsidy());
        assertEquals(Double.valueOf(200.00), salaryList.get(1).getAccumulationFund());
        assertEquals(Double.valueOf(300.00), salaryList.get(1).getOldAgeInsurance());
        assertEquals(Double.valueOf(200.00), salaryList.get(1).getUnemploymentInsurance());
        assertEquals(Double.valueOf(200.00), salaryList.get(1).getMedicalInsurance());
        assertEquals(Double.valueOf(70.00), salaryList.get(1).getIncomeTax());
        assertEquals(Double.valueOf(8400.00), salaryList.get(1).getTotalWages());
        assertEquals(Double.valueOf(7430.00), salaryList.get(1).getNetPayment());

        assertEquals("002", salaryList.get(2).getUserId());
        assertEquals("李四", salaryList.get(2).getUserName());
        assertEquals("B001", salaryList.get(2).getDepartmentId());
        assertEquals("前台", salaryList.get(2).getDepartmentName());
        assertEquals(Integer.valueOf(2021), salaryList.get(2).getYear());
        assertEquals(Integer.valueOf(10), salaryList.get(2).getMonth());
        assertEquals(Double.valueOf(4000.00), salaryList.get(2).getPostWage());
        assertEquals(Double.valueOf(0.00), salaryList.get(2).getAgeWage());
        assertEquals(Double.valueOf(0.00), salaryList.get(2).getFixedTotal());
        assertEquals(Double.valueOf(200.00), salaryList.get(2).getBenefitWage());
        assertEquals(Double.valueOf(1000.00), salaryList.get(2).getOvertimeOrDuty());
        assertEquals(Double.valueOf(0.00), salaryList.get(2).getBackPay());
        assertEquals(Double.valueOf(0.00), salaryList.get(2).getFeeForOnlyChildren());
        assertEquals(Double.valueOf(0.00), salaryList.get(2).getHousingSubsidy());
        assertEquals(Double.valueOf(200.00), salaryList.get(2).getAccumulationFund());
        assertEquals(Double.valueOf(300.00), salaryList.get(2).getOldAgeInsurance());
        assertEquals(Double.valueOf(200.00), salaryList.get(2).getUnemploymentInsurance());
        assertEquals(Double.valueOf(200.00), salaryList.get(2).getMedicalInsurance());
        assertEquals(Double.valueOf(70.00), salaryList.get(2).getIncomeTax());
        assertEquals(Double.valueOf(5200.00), salaryList.get(2).getTotalWages());
        assertEquals(Double.valueOf(4230.00), salaryList.get(2).getNetPayment());


    }
}
