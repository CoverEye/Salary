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
    @Insert({"<script> "+
            "INSERT INTO salaryinfo  " +
            "SET `userId` = #{userId}, " +
            "`userName`= #{userName}, " +
            "`departmentId`= #{departmentId}, " +
            "`departmentName`= #{departmentName}, " +
            "`year`= #{year}, " +
            "`month`= #{month}, " +
            "`postWage`= #{postWage}, " +
            "`ageWage`= #{ageWage}, " +
            "`fixedTotal`= #{fixedTotal}, " +
            "`benefitWage`= #{benefitWage}, " +
            "`overtimeOrDuty`= #{overtimeOrDuty}, " +
            "`backPay`= #{backPay}, " +
            "`feeForOnlyChildren`= #{feeForOnlyChildren}, " +
            "`housingSubsidy`= #{housingSubsidy}, " +
            "`accumulationFund`= #{accumulationFund}, " +
            "`oldAgeInsurance`= #{oldAgeInsurance}, " +
            "`unemploymentInsurance`= #{unemploymentInsurance}, " +
            "`medicalInsurance`= #{medicalInsurance}, " +
            "`incomeTax`= #{incomeTax}, " +
            "`totalWages`= #{totalWages}, " +
            "`netPayment`= #{netPayment} </script>"})
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
    @Insert({"<script> "+
            "UPDATE salaryinfo  " +
            "<set>" +
            "<if test='userName!=null'> `userName`= #{userName} , </if>" +
            "<if test='departmentId!=null'> `departmentId`= #{departmentId} , </if> " +
            "<if test='departmentName!=null'> `departmentName`= #{departmentName} , </if> " +
            "<if test='postWage!=null'> `postWage`= #{postWage} , </if> " +
            "<if test='ageWage!=null'> `ageWage`= #{ageWage} , </if> " +
            "<if test='fixedTotal!=null'> `fixedTotal`= #{fixedTotal} , </if> " +
            "<if test='benefitWage!=null'> `benefitWage`= #{benefitWage} , </if> " +
            "<if test='overtimeOrDuty!=null'> `overtimeOrDuty`= #{overtimeOrDuty} , </if> " +
            "<if test='backPay!=null'> `backPay`= #{backPay} , </if> " +
            "<if test='feeForOnlyChildren!=null'> `feeForOnlyChildren`= #{feeForOnlyChildren} , </if>" +
            "<if test='housingSubsidy!=null'> `housingSubsidy`= #{housingSubsidy},  </if>" +
            "<if test='accumulationFund!=null'> `accumulationFund`= #{accumulationFund} , </if>" +
            "<if test='oldAgeInsurance!=null'> `oldAgeInsurance`= #{oldAgeInsurance},  </if> " +
            "<if test='unemploymentInsurance!=null'> `unemploymentInsurance`= #{unemploymentInsurance} , </if> " +
            "<if test='medicalInsurance!=null'> `medicalInsurance`= #{medicalInsurance} , </if>" +
            "<if test='incomeTax!=null'> `incomeTax`= #{incomeTax} , </if> " +
            "</set> " +
            "where `userId`= #{userId} " +
            "and `year`= #{year} " +
            "and `month`= #{month}  </script>"})
    void updateInformation(Salary salary);

    /*** 查询所有人工资信息
     * @author CloseEye
     */
    @Select(
            "SELECT * FROM salaryinfo  "
    )
    List<Salary> selectAllSalaryByUserId();
}
