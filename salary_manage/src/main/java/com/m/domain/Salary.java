package com.m.domain;

public class Salary {
    private String userId;
    private String userName;
    private String departmentId;
    private String departmentName;
    private int year;
    private int month;
    private double postWage;
    private double ageWage;
    private double fixedTotal;
    private double benefitWage;
    private double overtimeOrDuty;
    private double backPay;
    private double feeForOnlyChildren;
    private double housingSubsidy;
    private double accumulationFund;
    private double oldAgeInsurance;
    private double unemploymentInsurance;
    private double medicalInsurance;
    private double incomeTax;
    private double totalWages;
    private double takeHomePay;

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public double getPostWage() {
        return postWage;
    }

    public void setPostWage(double postWage) {
        this.postWage = postWage;
    }

    public double getAgeWage() {
        return ageWage;
    }

    public void setAgeWage(double ageWage) {
        this.ageWage = ageWage;
    }

    public double getFixedTotal() {
        return fixedTotal;
    }

    public void setFixedTotal(double fixedTotal) {
        this.fixedTotal = fixedTotal;
    }

    public double getBenefitWage() {
        return benefitWage;
    }

    public void setBenefitWage(double benefitWage) {
        this.benefitWage = benefitWage;
    }

    public double getOvertimeOrDuty() {
        return overtimeOrDuty;
    }

    public void setOvertimeOrDuty(double overtimeOrDuty) {
        this.overtimeOrDuty = overtimeOrDuty;
    }

    public double getBackPay() {
        return backPay;
    }

    public void setBackPay(double backPay) {
        this.backPay = backPay;
    }

    public double getFeeForOnlyChildren() {
        return feeForOnlyChildren;
    }

    public void setFeeForOnlyChildren(double feeForOnlyChildren) {
        this.feeForOnlyChildren = feeForOnlyChildren;
    }

    public double getHousingSubsidy() {
        return housingSubsidy;
    }

    public void setHousingSubsidy(double housingSubsidy) {
        this.housingSubsidy = housingSubsidy;
    }

    public double getAccumulationFund() {
        return accumulationFund;
    }

    public void setAccumulationFund(double accumulationFund) {
        this.accumulationFund = accumulationFund;
    }

    public double getOldAgeInsurance() {
        return oldAgeInsurance;
    }

    public void setOldAgeInsurance(double oldAgeInsurance) {
        this.oldAgeInsurance = oldAgeInsurance;
    }

    public double getUnemploymentInsurance() {
        return unemploymentInsurance;
    }

    public void setUnemploymentInsurance(double unemploymentInsurance) {
        this.unemploymentInsurance = unemploymentInsurance;
    }

    public double getMedicalInsurance() {
        return medicalInsurance;
    }

    public void setMedicalInsurance(double medicalInsurance) {
        this.medicalInsurance = medicalInsurance;
    }

    public double getIncomeTax() {
        return incomeTax;
    }

    public void setIncomeTax(double incomeTax) {
        this.incomeTax = incomeTax;
    }

    public double getTotalWages() {
        return totalWages;
    }

    public void setTotalWages(double totalWages) {
        this.totalWages = totalWages;
    }

    public double getTakeHomePay() {
        return takeHomePay;
    }

    public void setTakeHomePay(double takeHomePay) {
        this.takeHomePay = takeHomePay;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
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
                ", takeHomePay=" + takeHomePay +
                '}';
    }
}
