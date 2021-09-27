package com.m.domain;

public class Salary {
    private String userId;
    private String userName;
    private String departmentId;
    private String departmentName;
    private Integer year;
    private Integer month;
    private Double postWage;
    private Double ageWage;
    private Double fixedTotal;
    private Double benefitWage;
    private Double overtimeOrDuty;
    private Double backPay;
    private Double feeForOnlyChildren;
    private Double housingSubsidy;
    private Double accumulationFund;
    private Double oldAgeInsurance;
    private Double unemploymentInsurance;
    private Double medicalInsurance;
    private Double incomeTax;
    private Double totalWages;
    private Double netPayment;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Double getPostWage() {
        return postWage;
    }

    public void setPostWage(Double postWage) {
        this.postWage = postWage;
    }

    public Double getAgeWage() {
        return ageWage;
    }

    public void setAgeWage(Double ageWage) {
        this.ageWage = ageWage;
    }

    public Double getFixedTotal() {
        return fixedTotal;
    }

    public void setFixedTotal(Double fixedTotal) {
        this.fixedTotal = fixedTotal;
    }

    public Double getBenefitWage() {
        return benefitWage;
    }

    public void setBenefitWage(Double benefitWage) {
        this.benefitWage = benefitWage;
    }

    public Double getOvertimeOrDuty() {
        return overtimeOrDuty;
    }

    public void setOvertimeOrDuty(Double overtimeOrDuty) {
        this.overtimeOrDuty = overtimeOrDuty;
    }

    public Double getBackPay() {
        return backPay;
    }

    public void setBackPay(Double backPay) {
        this.backPay = backPay;
    }

    public Double getFeeForOnlyChildren() {
        return feeForOnlyChildren;
    }

    public void setFeeForOnlyChildren(Double feeForOnlyChildren) {
        this.feeForOnlyChildren = feeForOnlyChildren;
    }

    public Double getHousingSubsidy() {
        return housingSubsidy;
    }

    public void setHousingSubsidy(Double housingSubsidy) {
        this.housingSubsidy = housingSubsidy;
    }

    public Double getAccumulationFund() {
        return accumulationFund;
    }

    public void setAccumulationFund(Double accumulationFund) {
        this.accumulationFund = accumulationFund;
    }

    public Double getOldAgeInsurance() {
        return oldAgeInsurance;
    }

    public void setOldAgeInsurance(Double oldAgeInsurance) {
        this.oldAgeInsurance = oldAgeInsurance;
    }

    public Double getUnemploymentInsurance() {
        return unemploymentInsurance;
    }

    public void setUnemploymentInsurance(Double unemploymentInsurance) {
        this.unemploymentInsurance = unemploymentInsurance;
    }

    public Double getMedicalInsurance() {
        return medicalInsurance;
    }

    public void setMedicalInsurance(Double medicalInsurance) {
        this.medicalInsurance = medicalInsurance;
    }

    public Double getIncomeTax() {
        return incomeTax;
    }

    public void setIncomeTax(Double incomeTax) {
        this.incomeTax = incomeTax;
    }

    public Double getTotalWages() {
        return totalWages;
    }

    public void setTotalWages(Double totalWages) {
        this.totalWages = totalWages;
    }

    public Double getNetPayment() {
        return netPayment;
    }

    public void setNetPayment(Double netPayment) {
        this.netPayment = netPayment;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", departmentId='" + departmentId + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", year=" + year +
                ", month=" + month +
                ", postWage=" + postWage +
                ", ageWage=" + ageWage +
                ", fixedTotal=" + fixedTotal +
                ", benefitWage=" + benefitWage +
                ", overtimeOrDuty=" + overtimeOrDuty +
                ", backPay=" + backPay +
                ", feeForOnlyChildren=" + feeForOnlyChildren +
                ", housingSubsidy=" + housingSubsidy +
                ", accumulationFund=" + accumulationFund +
                ", oldAgeInsurance=" + oldAgeInsurance +
                ", unemploymentInsurance=" + unemploymentInsurance +
                ", medicalInsurance=" + medicalInsurance +
                ", incomeTax=" + incomeTax +
                ", totalWages=" + totalWages +
                ", netPayment=" + netPayment +
                '}';
    }
}
