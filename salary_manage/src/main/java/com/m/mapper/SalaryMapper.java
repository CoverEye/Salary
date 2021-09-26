package com.m.mapper;

import com.m.domain.Salary;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SalaryMapper {
    /*** 录入工资信息
     * @author CloseEye
     */
    @Insert("INSERT INTO salaryinfo  " +
            "SET `userId` = #{userId}, " +
            "`userName`= #{userName}, " +
            "`departmentId`= #{departmentId}, " +
            "`departmentName`= #{departmentName}, " +
            "`year`= #{year}, " +
            "`month`= #{month}, " +
            "`postWage;`= #{postWage;}, " +
            "`ageWage`= #{ageWage}, " +
            "`fixedTotal`= #{fixedTotal}, " +
            "`benefitWage`= #{benefitWage}, " +
            "`overtimeOrDuty`= #{overtimeOrDuty}, " +
            "`backPay`= #{backPay}, " +
            "`feeForOnlyChildren`= #{feeForOnlyChildren;}, " +
            "`housingSubsidy`= #{housingSubsidy}, " +
            "`accumulationFund`= #{accumulationFund}, " +
            "`oldAgeInsurance`= #{oldAgeInsurance}, " +
            "`unemploymentInsurance`= #{unemploymentInsurance}, " +
            "`medicalInsurance`= #{medicalInsurance}, " +
            "`incomeTax`= #{incomeTax}, " +
            "`totalWages`= #{totalWages}, " +
            "`takeHomePay`= #{takeHomePay}, ")
    void inputInformation(Salary salary);

    /*** 查询特定工资信息
     * @author CloseEye
     */
    @Select(
            "SELECT * FROM salaryinfo WHERE userId=#{userId} "
    )
    List<Salary> selectSalaryByUserId(String userId);

    /*** 更新工资信息
     * @author CloseEye
     */
    @Insert("UPDATE salaryinfo  " +
            "SET `userName`= #{userName}, " +
            "`departmentId`= #{departmentId}, " +
            "`departmentName`= #{departmentName}, " +
            "`year`= #{year}, " +
            "`month`= #{month}, " +
            "`postWage;`= #{postWage;}, " +
            "`ageWage`= #{ageWage}, " +
            "`fixedTotal`= #{fixedTotal}, " +
            "`benefitWage`= #{benefitWage}, " +
            "`overtimeOrDuty`= #{overtimeOrDuty}, " +
            "`backPay`= #{backPay}, " +
            "`feeForOnlyChildren`= #{feeForOnlyChildren;}, " +
            "`housingSubsidy`= #{housingSubsidy}, " +
            "`accumulationFund`= #{accumulationFund}, " +
            "`oldAgeInsurance`= #{oldAgeInsurance}, " +
            "`unemploymentInsurance`= #{unemploymentInsurance}, " +
            "`medicalInsurance`= #{medicalInsurance}, " +
            "`incomeTax`= #{incomeTax}, " +
            "`totalWages`= #{totalWages}, " +
            "`takeHomePay`= #{takeHomePay}, " +
            "where `userId`= #{userId}")
    void updateInformation(Salary salary);
    /*** 查询所有人工资信息
     * @author CloseEye
     */
    @Select(
            "SELECT * FROM salaryinfo  "
    )
    List<Salary> selectAllSalaryByUserId();
}
